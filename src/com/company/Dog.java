package com.company;

/**
 * 1. Написать класс Dog (домашний питомец: собака, у питомца есть имя)
 * метод "подать голос" (выводит сообщение "Гав")
 * метод "подать лапу" (воводит сообщение, что собака с таким то именем подала лапу)
 * гетер и сеттер для имени
 */
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String giveVoice() {
        return name + ' ' + "Гав";
    }

    public String givePaw() {
        return name + " " + "подал лапу)";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
