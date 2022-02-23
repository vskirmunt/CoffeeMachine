package org.example;

public class CoffeeMachine {

    private int coffee, water, milk;

    public CoffeeMachine(int coffee, int water, int milk) {
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
    }


    public int addWater(int n) {
        this.water += n;
        System.out.println(coffee + " " + water + " " + milk);
        return water;

    }

    public int addCoffee(int n) {
        this.coffee += n;
        System.out.println(coffee + " " + water + " " + milk);
        return coffee;
    }

    public int addMilk(int n) {
        this.milk += n;
        System.out.println(coffee + " " + water + " " + milk);
        return milk;
    }

    public void makeLatte(int n) {
        float coffeeLatte = (float) (0.1 * n);
        float milkLatte = (float) (0.3 * n);
        float waterLatte = (float) (0.6 * n);
        if (10 <= n && coffeeLatte <= coffee && milkLatte <= milk && waterLatte <= water) {  // Проверка на то, что результат вычитания не будет отрицательным
            coffee -= coffeeLatte;
            milk -= milkLatte;
            water -= waterLatte;
            System.out.println(coffee + " " + water + " " + milk);
        } else
            System.out.println("Проверьте уровень ингридиентов");
    }

    public void makeRistretto(int n) {
        float coffeeRistretto = (float) (0.5 * n);
        float waterRistretto = (float) (0.5 * n);
        if (10 <= n && coffeeRistretto <= coffee && waterRistretto <= water) {
            coffee -= coffeeRistretto;
            water -= waterRistretto;
            System.out.println(coffee + " " + water + " " + milk);
        }
        else
            System.out.println("Проверьте уровень ингридиентов");
    }

    public void makeСappuccino(int n) {
        float coffeeСappuccino = (float) (n * 0.15);
        float milkСappuccino = (float) (n * 0.45);
        float waterСappuccino = (float) (0.4 * n);
        if (10 <= n && coffeeСappuccino <= coffee && milkСappuccino <= milk && waterСappuccino <= water) {
            coffee -= coffeeСappuccino;
            milk -= milkСappuccino;
            water -= waterСappuccino;
            System.out.println(coffee + " " + water + " " + milk);
        } else
            System.out.println("Проверьте уровень ингридиентов");
    }

    public void makeLungo(int n) {
        float coffeeLungo = (float) (n * 0.15);
        float waterLungo = (float) (n * 0.85);
        if (10 <= n && coffeeLungo <= this.coffee && waterLungo <= this.water) {
            this.coffee -= coffeeLungo;
            this.water -= waterLungo;
            System.out.println(this.coffee + " " + this.water + " " + this.milk);
        } else
            System.out.println("Проверьте уровень ингридиентов");
    }

    public void makeEspresso(int n) {
        float coffeeEspresso = (float) (0.3 * n);
        float waterEspresso = (float) (0.7 * n);
        if (10 <= n && coffeeEspresso <= coffee && waterEspresso <= water) {
            coffee -= coffeeEspresso;
            water -= waterEspresso;
            System.out.println(coffee + " " + water + " " + milk);
        } else
            System.out.println("Проверьте уровень ингридиентов");
    }

}




