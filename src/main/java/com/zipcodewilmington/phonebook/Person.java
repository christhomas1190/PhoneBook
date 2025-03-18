package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.ArrayList;

public class Person {
    private String name;
    private List<PhoneNumbers> phoneNumbers;

    public Person(String name){
        this.name=name;
        this.phoneNumbers = new ArrayList<>();
    }
    public void addPhoneNumbers(String number, String type){
        phoneNumbers.add(new PhoneNumbers());
    }

    public String getName() {
        return name;
    }

    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }
}
