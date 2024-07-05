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

public class HashMapExample {
    private Map<Integer, Person> people;

    public HashMapExample() {
        people = new HashMap<>();
    }

    // Метод для добавления объектов
    public void addPerson(int id, Person person) {
        people.put(id, person);
        System.out.println("Added: ID " + id + ", " + person);
    }

    // Метод для удаления объекта
    public void removePerson(int id) {
        Person removedPerson = people.remove(id);
        if (removedPerson != null) {
            System.out.println("Removed: ID " + id + ", " + removedPerson);
        } else {
            System.out.println("No person found with ID " + id);
        }
    }

    // Метод для поиска объекта по ключу
    public void searchPerson(int id) {
        Person person = people.get(id);
        if (person != null) {
            System.out.println("Person with ID " + id + ": " + person);
        } else {
            System.out.println("No person found with ID " + id);
        }
    }

    // Метод для печати всех объектов
    public void printAllPeople() {
        System.out.println("People in HashMap:");
        for (Map.Entry<Integer, Person> entry : people.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    // Метод для выполнения всех действий
    public void executeActions() {
        // Добавление объектов
        addPerson(1, new Person("Alice", 30));
        addPerson(2, new Person("Bob", 25));
        addPerson(3, new Person("Charlie", 35));

        // Печать всех объектов
        printAllPeople();

        // Поиск объекта по ключу
        searchPerson(2);

        // Удаление объекта
        removePerson(1);

        // Печать всех объектов после удаления
        printAllPeople();
    }

    public static void main(String[] args) {
        HashMapExample example = new HashMapExample();
        example.executeActions();
    }
}