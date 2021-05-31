package lesson3;

import java.util.*;

public class PhoneBook implements IPhoneBook {
    private final Map<Integer, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPhone(String surname, int number) {
        phoneBook.put(number, surname);
    }

    @Override
    public String getPhone(String surname) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer integer : phoneBook.keySet()) {
            if (phoneBook.get(integer).equals(surname)) {
                numbers.add(integer);
            }
        }
        return surname + " : " + numbers;
    }

    @Override
    public Set<Integer> getPhoneNumbers(String surname) {
        return null;
    }
}
