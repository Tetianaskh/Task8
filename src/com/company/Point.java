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
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
