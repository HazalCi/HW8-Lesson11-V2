package org.example.departmentapp;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Female personnel1 = new Female("Ayşe", "Yılmaz", LocalDate.of(1980, 5, 15));
        Male personnel2 = new Male("Mehmet", "Kara", LocalDate.of(1990, 8, 20));
        Female personnel3 = new Female("Elif", "Demir", LocalDate.of(1985, 12, 5));
        Male personnel4 = new Male("Ali", "Öztürk", LocalDate.of(1997, 2, 3));

        Department department = new Department("IT", personnel1);
        System.out.println("Team Leader: " + department.getTeamLeader());
        department.setNewTeamLeader(personnel4);

        department.addPerson(personnel2);
        System.out.println("Personnel List: " + department.getPersonnel());
        department.addPerson(personnel3);
        System.out.println("Personnel List: " + department.getPersonnel());
        department.removePerson(personnel3);
        System.out.println("Personnel List: " + department.getPersonnel());
        department.updatePerson(personnel2,personnel3);
        System.out.println("Personnel List: " + department.getPersonnel());

        department.addTask("Test Case Writing");
        department.addTask("Functional Tests");
        department.addTask("Database backup");
        System.out.println("Task List:" + department.getTasks());
        department.markTaskAsCompleted("Test Case Writing");
        System.out.println("Last Task List:" + department.getTasks());
        System.out.println( personnel2  + " Years Until Retirement: " + personnel2.yearsUntilRetirement());
        System.out.println( personnel3  + " Years Until Retirement: " + personnel3.yearsUntilRetirement());


    }
}