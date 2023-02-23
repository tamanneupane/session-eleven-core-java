package day30;

import java.time.LocalDate;

public class CustomerTransaction {

    private long id;
    private double amount;

    private LocalDate date;

    public CustomerTransaction(long id, double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public long getId() {
        return id;
    }
}
