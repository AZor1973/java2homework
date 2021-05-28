package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook2 implements IPhoneBook{
    private final Map<String, Set<Integer>> phoneBook;

    public PhoneBook2(){
        phoneBook = new HashMap<>();
    }
    @Override
    public void addPhone(String surname, int number) {
        Set<Integer> phones = addNumbers(surname);
        phones.add(number);
    }

    @Override
    public String getPhone(String surname) {
        return null;
    }

    @Override
    public Set<Integer> getPhoneNumbers(String surname) {
       return addNumbers(surname);
    }

    private Set<Integer> addNumbers(String surname){
        return phoneBook.computeIfAbsent(surname,key -> new HashSet<>());
    }
}
