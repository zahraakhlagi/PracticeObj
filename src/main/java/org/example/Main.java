package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Person person = new Person();
       //Set values using setter method
       person.setName("Zahra");
       person.setAge(25);
       person.setCountry("Afghanistan");

       //get values using getter method
        String name=person.getName();
       int age= person.getAge();
       String country= person.getCountry();
       System.out.println("My name is "+name+ ", "+ age+ " years old and from "+ country+"." );


    }
}