package ru.netology;

public class Main {
    public static void main(String[] args) {

        int customerBalance = 500; // баланс на счете клиента

        int depositAmount = 2000; // сумма пополнения
        int bonus; // начисляемые бонусы
        int bonusBalance = 7; // баланс бонусного счета

        int newCustomerBalance = customerBalance + depositAmount; // пополнение счета


        if (newCustomerBalance > 1000) {
            bonus = bonusBalance + newCustomerBalance / 100;
            bonusBalance += bonus;
            System.out.println("Деньги зачислены!\n\nНачислено бонусов: " + bonus + "\nБаланс бонусного счета: " + bonusBalance);
        } else {
            System.out.println("Деньги зачислены!\nБаланс бонусного счета: " + bonusBalance);
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.


    }
}
