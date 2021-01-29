package com.company;

import java.util.concurrent.Callable;

public class Main {

    /**
     * 1. Написать класс Dog (домашний питомец: собака, у питомца есть имя)
     * метод "подать голос" (выводит сообщение "Гав")
     * метод "подать лапу" (воводит сообщение, что собака с таким то именем подала лапу)
     * гетер и сеттер для имени
     */
    public static void exercise01() {
        Dog[] dogs = {
                new Dog("Tor"),
                new Dog("Volt"),
                new Dog("Noi")
        };

        for (Dog dog : dogs) {
            System.out.println(dog.giveAVote());
        }
        for (Dog dog : dogs) {
            System.out.println(dog.giveAPaw());
        }
    }

    /**
     * 2.Написать классы точка (математическая, двухмерная) и окружность
     *
     * Класс точка:
     * конструктор принимает координаты
     * метод проверки лежит ли точка в начале координат (возвращает true или false)
     * гетеры и сеттеры для координат
     * метод для вывода точки в консоль
     * метод для нахождения расстояния до другой точки (double distanceTo(Point point2))
     *
     * Класс окружность
     * конструктор принимает точку-центр и радиус
     * гетеры и сеттеры для всех полей
     * метод проверки лежит ли точка в этой окружности (boolean containsPoint(Point p))
     */
    public static void exercise02() {
        Point[] points = {
                new Point(5,10),
                new Point(0,0),
                new Point(2,4),
                new Point(1,0),
                new Point(14,4)
        };

        for (Point point : points) {
            point.print();
        }
        for (Point point : points) {
            System.out.println(point.isOrigin());
        }
        System.out.println(points[0].distanceTo(points[1]));

        Point center = new Point(1, 1);
        Circle circle = new Circle(center, 7);
        for (Point point : points) {
            System.out.println(circle.containsPoint(point));
        }
    }

    public static void main(String[] args) {
        exercise02();
    }
}
