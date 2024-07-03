package test.collections;

import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        Map<Integer, Person> people = new HashMap<>();

        // Добавление объектов
        people.put(1, new Person("Alice", 30));
        people.put(2, new Person("Bob", 25));
        people.put(3, new Person("Charlie", 35));

        // Печать всех объектов
        System.out.println("People in HashMap:");
        for (Map.Entry<Integer, Person> entry : people.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // Поиск объекта по ключу
        Person person = people.get(2);
        System.out.println("\nPerson with ID 2: " + person);

        // Удаление объекта
        people.remove(1);
        System.out.println("\nAfter removing person with ID 1:");
        for (Map.Entry<Integer, Person> entry : people.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}