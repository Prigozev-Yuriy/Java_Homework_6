package org.example;

import java.util.ArrayList;

public class Contact {

    String name;

    ArrayList<String> phoneNumbers = new ArrayList<>();

    public Contact(String name, ArrayList<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "name = " + name + ", phoneNumbers = " + phoneNumbers;
    }
}
