package lesson6;

import java.io.*;
import java.net.Socket;

public class ConsoleClient {
    private static final int PORT = 8189;
    private static final String HOSTNAME = "localhost";

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOSTNAME, PORT)) {
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Thread thread = new Thread(() -> {
                while (true) {
                    String outMessage;
                    try {
                        outMessage = reader.readLine();
                        output.writeUTF(outMessage);
                    } catch (IOException e) {
                        System.out.println("Send message fail.");
                    }
                }
            });
            thread.setDaemon(true);
            thread.start();

            while (true) {
                String inputMessage = input.readUTF();
                System.out.println("Server: " + inputMessage);
                if (inputMessage.equals("end")) {
                    output.writeUTF("end");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Connection lost.");
        }
    }
}
