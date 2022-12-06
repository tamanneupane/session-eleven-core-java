package day1;

public class BankAccount {

    // States

    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String accountType;
    private String phoneNumber;

    private Address address; // country, state, city, street

    // Linked Cards (List)
    private final String BANK_NAME = "RBB";
    private String socialSecurityNumber;
    private String openingBranch;

    private String licenseNumber;

    public BankAccount(){} // Auto Generate by compiler (Default Constructor)

    public BankAccount(String accountNumber, String accountHolderName ,double accountBalance, String phoneNumber, Address address){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public BankAccount(String accountNumber, String accountHolderName ,double accountBalance, String phoneNumber, Address address, String licenseNumber){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.licenseNumber = licenseNumber;
    }

    // Getters and Setters
    public void setAccountNumber(String accountNumber){
        // checking
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getBANK_NAME(){
        return  this.BANK_NAME;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Address getAddress() {
        return address;
    }

    // Behaviour(Bank Application)

    // deposit
    public double deposit(BankAccount toAccount, double amountToBeDeposited){
        return 0.0;
    }
    // withdraw
    public double withDraw(BankAccount fromAccount, double amountToBeWithDrawn){
        return  0.0;
    }
    // transfer balance
    public boolean transferBalance(BankAccount fromAccount, BankAccount toAccount, double amountToBeTransferred){
        // Balance Transfer logic
        return true;
    }
    // download statement
    public String downloadStatement(BankAccount account, String fromDate, String toDate){
        return "";
    }
    // link credit card
    public void linkCreditCard(BankAccount account, String cardNumber){}
    // link debit card
    // check balance
    public double checkBalance(BankAccount account){
        return account.accountBalance;
    }

    public static void main(String[] args) {
        BankAccount tamanAccount = new BankAccount();
        tamanAccount.accountNumber = "1234";
        tamanAccount.accountHolderName = "Taman Neupane";
//        tamanAccount.BANK_NAME = "Nabil";

        BankAccount ramAccount = new BankAccount();
        ramAccount.accountNumber = "5678";
        ramAccount.accountHolderName = "Ram Thapa";

        tamanAccount.transferBalance(tamanAccount, ramAccount, 2000);
    }

}
