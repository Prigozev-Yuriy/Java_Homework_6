package org.example;

import java.util.*;

public class PhoneBook{

    Map<String, ArrayList<String>> phoneBookMap = new HashMap<>();

    public void addContact(String contactName, String phoneNumber) {
        if (phoneBookMap.containsKey(contactName)) {
            phoneBookMap.get(contactName).add(phoneNumber);
        } else {
            ArrayList<String> valueForNewContact = new ArrayList<>();
            valueForNewContact.add(phoneNumber);
            phoneBookMap.put(contactName, valueForNewContact);
        }
    }

    public List<Contact> transferToSortedContactList() {
        List<Contact> result = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> mapEntry : phoneBookMap.entrySet()) {
            Contact contact = new Contact(mapEntry.getKey(), mapEntry.getValue());
            result.add(contact);
        }

        Comparator<Contact> comparator = (x, y) -> {
           return y.phoneNumbers.size()-x.phoneNumbers.size();
        };

        result.sort(comparator);

        return result;
    }
}
