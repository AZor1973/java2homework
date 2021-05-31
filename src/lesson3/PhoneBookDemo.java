package lesson3;

public class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
//        PhoneBook2 myPhoneBook = new PhoneBook2();
        myPhoneBook.addPhone("Smirnoff", 31220);
        myPhoneBook.addPhone("Smirnoff", 31221);
        myPhoneBook.addPhone("Ivanov", 31222);
        myPhoneBook.addPhone("Petrov", 31223);
//        System.out.println("Smirnoff : "+myPhoneBook.getPhoneNumbers("Smirnoff"));
        System.out.println(myPhoneBook.getPhone("Smirnoff"));
    }

}

