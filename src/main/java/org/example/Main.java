package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Ivan", "+74991111111");
        phoneBook.addContact("Maxim", "+74991111112");
        phoneBook.addContact("Leonid", "+74991111113");
        phoneBook.addContact("Maxim", "+74991111114");
        phoneBook.addContact("Maxim", "+74991111116");
        phoneBook.addContact("Leonid", "+74991111115");
        phoneBook.addContact("Sergey", "+74991111117");
        phoneBook.addContact("Leonid", "+74991111115");
        phoneBook.addContact("Sergey", "+74991111118");

        List<Contact> contactList = phoneBook.transferToSortedContactList();

        contactList.forEach(System.out::println);
    }
}
