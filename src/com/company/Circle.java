package com.company;

/**
 * 2.Написать классы точка (математическая, двухмерная) и окружность
 *
 * Класс окружность
 * конструктор принимает точку-центр и радиус
 * гетеры и сеттеры для всех полей
 * метод проверки лежит ли точка в этой окружности (boolean containsPoint(Point p))
 */
class Circle {
    private Point center;
    private double radius;

    public Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean containsPoint (Point p) {
        return p.distanceTo(center) <= radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
