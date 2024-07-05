package test.collections;


public class Main {

    public static void main(String[] args) {

        System.out.println("Класс, использующий Deque");
        CarDequeExample example = new CarDequeExample();
        example.addElements("Toyota", "BMW", "Honda");
        example.searchElement("BMW");
        example.removeFirstElement();
        example.removeLastElement();
        example.removeElement("Honda");


        System.out.println("Класс, использующий List");
        LinkedListExample searchInt = new LinkedListExample();
        searchInt.printElements();
        int searchElement = 657;
        System.out.println("Element " + searchElement + " found: " + searchInt.findElement(searchElement));
        int removeElement = 55;
        System.out.println("Element " + removeElement + " removed: " + searchInt.removeElement(removeElement));
        searchInt.printElements();
        System.out.println("Total number of elements: " + searchInt.countElements());


        System.out.println("Класс, использующий Set");
        TreeSetExample treeSet = new TreeSetExample();
        System.out.println("Initial count of elements: " + treeSet.countElements());
        treeSet.printElements();
        String elementB = "BB";
        System.out.println("Element " + searchElement + " found: " + treeSet.findElement(elementB));
        String elementA = "AAA";
        System.out.println("Element " + removeElement + " removed: " + treeSet.removeElement(elementA));
        treeSet.printElements();
        System.out.println("Count after removal: " + treeSet.countElements());
        treeSet.removeElement("BB");
        treeSet.removeElement("CC");
        treeSet.printElements();
        System.out.println("Count after additional removals: " + treeSet.countElements());
        treeSet.removeElement("AA");
        treeSet.removeElement("CCC");
        treeSet.printElements();
        System.out.println("Final count of elements: " + treeSet.countElements());

        System.out.println("Класс, использующий Map");
        HashMapExample person = new HashMapExample();
        person.addPerson(4, new Person("David", 28));
        person.addPerson(5, new Person("Eve", 22));
        person.addPerson(6, new Person("Frank", 33));
        person.printAllPeople();
        person.searchPerson(4);
        person.searchPerson(5);
        person.searchPerson(6);
        person.searchPerson(7); // Не существующий ID
        person.removePerson(2);
        person.removePerson(3);
        person.removePerson(7); // Не существующий ID
        person.printAllPeople();
        person.addPerson(7, new Person("Grace", 40));
        person.addPerson(8, new Person("Hank", 45));
        person.addPerson(9, new Person("Ivy", 19));
        person.printAllPeople();
        person.searchPerson(7);
        person.searchPerson(8);
        person.searchPerson(9);

    }
}