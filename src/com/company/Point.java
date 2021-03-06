package com.company;

/**
 * 2.Написать классы точка (математическая, двухмерная) и окружность
 *
 * Класс точка:
 * конструктор принимает координаты
 * метод проверки лежит ли точка в начале координат (возвращает true или false)
 * гетеры и сеттеры для координат
 * метод для вывода точки в консоль
 * метод для нахождения расстояния до другой точки (double distanceTo(Point point2))
 */
class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("x = %.1f, y = %.1f\n", x, y);
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public double distanceTo(Point point2) {
        return Math.sqrt(Math.pow((point2.x - x), 2) + Math.pow((point2.y - y), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
