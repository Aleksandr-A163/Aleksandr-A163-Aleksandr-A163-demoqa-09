package test.collections;

import java.util.Deque;
import java.util.LinkedList;

public class CarDequeExample {

    public static void main(String[] args) {
        // Создаем экземпляр Deque, используя реализацию LinkedList
        Deque<String> carDeque = new LinkedList<>();

        // Добавляем элементы (марки автомобилей) в конец очереди
        carDeque.add("Audi");
        carDeque.add("BMW");
        carDeque.add("Mercedes");
        carDeque.add("Porsche");
        carDeque.add("Peugeot");
        carDeque.add("Lada");
        System.out.println("После добавления элементов: " + carDeque);

        // Поиск элемента в очереди
        String searchCar = "Mercedes";
        boolean found = carDeque.contains(searchCar);
        if (found) {
            System.out.println(searchCar + " найден в очереди.");
        } else {
            System.out.println(searchCar + " не найден в очереди.");
        }

        // Удаляем элемент из начала очереди
        String firstCar = carDeque.removeFirst();
        System.out.println("Удален первый элемент: " + firstCar);
        System.out.println("После удаления первого элемента: " + carDeque);

        // Удаляем элемент из конца очереди
        String lastCar = carDeque.removeLast();
        System.out.println("Удален последний элемент: " + lastCar);
        System.out.println("После удаления последнего элемента: " + carDeque);

        // Удаляем определенный элемент
        String removeCar = "BMW";
        boolean removed = carDeque.remove(removeCar);
        if (removed) {
            System.out.println(removeCar + " был удален.");
        } else {
            System.out.println(removeCar + " не был найден.");
        }
        System.out.println("После удаления элемента: " + carDeque);
    }
}