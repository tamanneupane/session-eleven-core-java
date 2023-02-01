package day1;

public class RBBApplication {

    public static void main(String[] args) {
//        BankAccount tamanAccount = new BankAccount();
////        tamanAccount.accountNumber = "1234";
//        tamanAccount.setAccountNumber("1234");
//
////        tamanAccount.accountHolderName = "Taman Neupane";
////        tamanAccount.BANK_NAME = "Nabil";
//
//
//
//        BankAccount ramAccount = new BankAccount();
////        ramAccount.accountNumber = "5678";
//        ramAccount.setAccountNumber("5678");

//        ramAccount.accountHolderName = "Ram Thapa";


//        String tamanAccountNumber = tamanAccount.accountNumber;
//        String tamanAccountNumber = tamanAccount.getAccountNumber();

        Address address = new Address();
        BankAccount shyamAccount = new BankAccount("12345", "Shyam", 500, "9851184633", address);

        shyamAccount.checkBalance();

        BankAccount ramAccount = new BankAccount("123456", "Ram", 500, "9851184633", address);

        ramAccount.checkBalance();

        ramAccount.linkCreditCard( "987654321");

        shyamAccount.downloadStatement("2022-01-01", "2022-12-09");

        ramAccount.transferBalance( shyamAccount,2000);

        shyamAccount.transferBalance(ramAccount, 1000);

        ramAccount.withDraw( 1000);

        shyamAccount.deposit( 500);
    }
}
