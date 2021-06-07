package lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleServer {
    private static final int PORT = 8189;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("The server is running, waiting for new connection.");
            Socket socket = serverSocket.accept();
            System.out.println("Client is connected.");
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
                System.out.println("Client: " + inputMessage);
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
