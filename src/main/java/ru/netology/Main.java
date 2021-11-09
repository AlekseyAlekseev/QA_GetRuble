package ru.netology;

public class Main {
    public static void main(String[] args) {

        int customerAmountBalance = 100; // начальный баланс клиента
        int depositAmount = 1100; // сумма пополнения
        int bonus = 0; // бонусы
        int finalAmountBalance; // итоговый баланс клиента

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            finalAmountBalance = customerAmountBalance + depositAmount + bonus;
        } else {
            finalAmountBalance = customerAmountBalance + depositAmount;
        }
        System.out.println("Деньги зачислены!\n\nБаланс лицевого счета: " + finalAmountBalance +
                "\nБаланс бонусного счета: " + bonus);
    }
}
