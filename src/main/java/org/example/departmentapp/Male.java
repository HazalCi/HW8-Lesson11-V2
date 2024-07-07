package org.example.departmentapp;

import java.time.LocalDate;
import java.time.Period;

public class Male extends Personnel {
    private static final int RETIREMENT_AGE = 65;

    public Male(String name, String surname, LocalDate birthdate) {
        super(name, surname, birthdate);
    }

    @Override
    public int yearsUntilRetirement() {
        int age = ageCalculation();
        return Math.max(RETIREMENT_AGE - age, 0);
    }
}