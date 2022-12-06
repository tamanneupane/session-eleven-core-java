package day5;

import day1.BankAccount;

public class WorkingWithNull {

    public static void main(String[] args) {
        BankAccount tamanAccount = new BankAccount();

        System.out.println(tamanAccount.getAccountBalance());
        System.out.println(tamanAccount.getAccountNumber());
        System.out.println(tamanAccount.getAddress());
    }
}
