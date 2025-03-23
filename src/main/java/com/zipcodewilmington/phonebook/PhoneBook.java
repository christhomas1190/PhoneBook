package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    private Map<String,Person>contacts;

    public PhoneBook(){
        this.contacts= new HashMap<>();
    }

    public void add(String name, String number) {
        contacts.putIfAbsent(name, new Person(name));
        contacts.get(name).addPhoneNumbers(number);
    }

    public void addAll(String name, String... phoneNumbers) {
        contacts.putIfAbsent(name,new  Person(name));
        Person person=contacts.get(name);
        for(String number : phoneNumbers){
            person.addPhoneNumbers(number);
        }
    }

    public void remove(String name) {
        contacts.remove(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
        return contacts.containsKey(name);
    }

    public List<String> lookup(String name) {
        contacts.getOrDefault(name, new Person(name));
        Person person=contacts.get(name);
        if(person==null){
            new ArrayList<>();
        }
        List<String> numbers = new ArrayList<>();
        for(PhoneNumbers phone: person.getPhoneNumbers()){
            numbers.add(phone.getNumber());
        }
        return numbers;
    }

    public String reverseLookup(String phoneNumber)  {
        for(Map.Entry<String, Person> entry:contacts.entrySet()){
            Person person =entry.getValue();
            for(PhoneNumbers phone: person.getPhoneNumbers()){
                if(phone.getNumber().equals(phoneNumber))
                return entry.getKey();
            }
        }

        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(contacts.keySet());
    }

    public Map<String, Person> getMap() {
        return contacts;
    }
}
