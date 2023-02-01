package day5;

import day1.Address;
import day1.BankAccount;

import java.util.Objects;

public class WorkingWithNull {

    public static void main(String[] args) {
        Address address = null;

        BankAccount tamanAccount = new BankAccount("1234", null, 5000, "123456789", address);


        System.out.println(tamanAccount.getAccountBalance());
        System.out.println(tamanAccount.getAccountNumber());
        System.out.println(tamanAccount.getAddress());
        System.out.println("Account holder name : " + tamanAccount.getAccountHolderName());

        int length = tamanAccount.getAccountNumber().length();

        boolean isAddressNull = Objects.isNull(tamanAccount.getAddress());
        System.out.println(isAddressNull);

        if(!isAddressNull) {
            String city = tamanAccount.getAddress().getCity();
            System.out.println(city);
        }
    }
}
