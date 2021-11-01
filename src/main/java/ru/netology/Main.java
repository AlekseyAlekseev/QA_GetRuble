package ru.netology;

public class Main {
    public static void main(String[] args) {

        int customerBalance = 500; // баланс на счете клиента

        int depositAmount = 100; // сумма пополнения
        int bonus; // начисляемые бонусы
        int bonusBalance = 7; // баланс бонусного счета
        int finalBalance = customerBalance + depositAmount; //расчет баланса после пополнения

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            bonusBalance += bonus;
            System.out.println("Деньги зачислены!\n\nБаланс лицевого счета: " + finalBalance +
                    "\nНачислено бонусов: " + bonus + "\nБаланс бонусного счета: " + bonusBalance);
        } else {
            System.out.println("Деньги зачислены!\n\nБаланс лицевого счета: " + finalBalance +
                    "\nБаланс бонусного счета: " + bonusBalance);
        }
    }
}
