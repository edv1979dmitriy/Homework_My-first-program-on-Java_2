package org.example;

public class Main {
    public static void main(String[] args) {

        int startBalance;
        int summaChange;
        int bonus;
        int endBalance;

        startBalance = 888;
        summaChange = 2010;

        if (summaChange > 1000) {
            bonus = summaChange / 100;
            endBalance = startBalance + summaChange + bonus;
            System.out.println(" Ваш бонус за пополнение счёта на 1000 рублей и более: " + bonus + " руб.");
            System.out.println(" Ваш баланс: " + endBalance + " руб.");
        } else {
            endBalance = startBalance + summaChange;
            System.out.println(" Ваш бонус за пополнение счёта на 1000 рублей и более: 0 руб.");
            System.out.println(" Ваш баланс: " + endBalance + " руб.");
        }
    }
}