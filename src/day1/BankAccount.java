package day1;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Taman Neupane
 * @since JDK 11
 *
 */
public class BankAccount {

    // States
    private String accountNumber = "";
    private String accountHolderName = "GUEST-"+ UUID.randomUUID() ;
    private double accountBalance = 0.0;
    private String accountType;
    private String phoneNumber;



    private Address address; // country, state, city, street (Dependency)

    // Linked Cards (List)
    private final String BANK_NAME = "RBB";
    private String socialSecurityNumber;
    private String openingBranch;

    private String licenseNumber;

    private BankAccount(){
        this.accountNumber = "";
        this.accountHolderName = "";
        this.accountBalance = 0.0;
    } // Auto Generate by compiler (Default Constructor)

    public BankAccount(String accountNumber, String accountHolderName ,double accountBalance, String phoneNumber, Address address){
        this.accountNumber = accountNumber;
        if(Objects.isNull(accountHolderName)){
            this.accountHolderName = "GUEST-"+ UUID.randomUUID();
        }else{
            this.accountHolderName = accountHolderName;
        }
//        this.accountHolderName = Objects.requireNonNullElse(accountHolderName, "Guest-"+ UUID.randomUUID());
        this.accountBalance = accountBalance;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public BankAccount(String accountNumber, String accountHolderName ,double accountBalance, String phoneNumber, Address address, String licenseNumber){
        this(accountNumber, accountHolderName, accountBalance, phoneNumber, address);
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

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Behaviour(Bank Application)

    // deposit
    public double deposit(double amountToBeDeposited){
        // this = shyamAccount
        return 0.0;
    }
    // withdraw
    public double withDraw(double amountToBeWithDrawn){
        // this = ramAccount
        return  0.0;
    }
    // transfer balance

    /**
     * This Function is used to transfer balance from one account to another
     * @param toAccount The account to which balance is to be transferred
     * @param amountToBeTransferred The amount in double that needs to be transferred ,and it cannot be negative
     * @return If transfer balance is successful then true is returned else false will be returned
     */
    public boolean transferBalance( BankAccount toAccount, double amountToBeTransferred){
        // Balance Transfer logic
        // fromAccount = this
        return true;
    }
    // download statement
    public String downloadStatement(String fromDate, String toDate){
        return "";
    }
    // link credit card
    public void linkCreditCard(String cardNumber){
        // this == ramAccount
    }
    // link debit card
    // check balance
    public double checkBalance(){
        return this.accountBalance; // == shyamAccount.accountBalance
    }

    public static void main(String[] args) {
        BankAccount tamanAccount = new BankAccount();
        tamanAccount.accountNumber = "1234";
        tamanAccount.accountHolderName = "Taman Neupane";
//        tamanAccount.BANK_NAME = "Nabil";

        BankAccount ramAccount = new BankAccount();
        ramAccount.accountNumber = "5678";
        ramAccount.accountHolderName = "Ram Thapa";

//        tamanAccount.transferBalance(tamanAccount, ramAccount, 2000);
    }

}
