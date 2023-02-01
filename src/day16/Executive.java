package day16;

import java.time.LocalDate;

public final class Executive extends Manager{
    public Executive(String name, LocalDate hireDate, double salary, double bonus) {
        super(name, hireDate, salary, bonus);
    }

    public void fire(Employee e){

    }
}
