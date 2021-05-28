package lesson3;

import java.util.Set;

public interface IPhoneBook {
    void addPhone(String surname, int number);

    String getPhone(String surname);
    Set<Integer> getPhoneNumbers(String surname);
}
