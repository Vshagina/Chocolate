package com.company;

public class Chocolate {
    public static void main(String[] args) {
        int money = 15;
        int price = 1;
        int wrap = 3;

        int chocolateBars = money / price;
        int wrappers = chocolateBars;

        while (wrappers >= wrap) {
            int newBars = wrappers / wrap;
            wrappers = wrappers % wrap + newBars;
            chocolateBars += newBars;
        }
        System.out.println("Максимальное кол-во шоколадок: " + chocolateBars);
    }
}