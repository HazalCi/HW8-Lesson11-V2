package org.example.departmentapp;
import java.time.LocalDate;
import java.time.Period;

public abstract class Personnel {
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Personnel(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int ageCalculation() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public abstract int yearsUntilRetirement();

    @Override
    public String toString() {
        return "Personnel{" +
                "Name ='" + name + '\'' +
                ", Surname ='" + surname + '\'' +
                ", Birthdate =" + birthdate +
                '}';
    }
}