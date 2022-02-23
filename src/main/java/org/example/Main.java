package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine delongi = new CoffeeMachine(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));


        System.out.println("Введите команду и объем напитка в Мл: \nwater\nmilk\ncoffee\nlatte\nristretto\ncappuccino\nlungo\nespresso\nturn off");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();

            switch (command) {
                    case "water":
                        int addWater = scanner.nextInt();
                        delongi.addWater(addWater);
                        break;
                    case "milk":
                        int addMilk = scanner.nextInt();
                        delongi.addMilk(addMilk);
                        break;
                    case "coffee":
                        int addCoffee = scanner.nextInt();
                        delongi.addCoffee(addCoffee);
                        break;
                    case "latte":
                        int latteValue = scanner.nextInt();
                        delongi.makeLatte(latteValue);
                        break;
                    case "ristretto":
                        int ristrettoValue = scanner.nextInt();
                        delongi.makeRistretto(ristrettoValue);
                        break;
                    case "cappuccino":
                        int cappuccinoValue = scanner.nextInt();
                        delongi.makeСappuccino(cappuccinoValue);
                        break;
                    case "lungo":
                        int lungoValue = scanner.nextInt();
                        delongi.makeLungo(lungoValue);
                        break;
                    case "espresso":
                        int espressoValue = scanner.nextInt();
                        delongi.makeEspresso(espressoValue);
                        break;
                    case "turn":
                        String off = scanner.next();
                        if (off.equals("off")) {
                            System.out.println("Кофе машина отключена");
                            return;
                        }
                    default:
                        System.out.println("Неизвестная команда");
                        break;
                }
            }
        }
    }
