package org.example.departmentapp;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Personnel teamLeader;
    private List<Personnel> personnel;
    private List<String> tasks;


    public Department(String name, Personnel teamLeader) {
        this.name = name;
        this.teamLeader = teamLeader;
        this.personnel = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.personnel.add(teamLeader);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Personnel getTeamLeader() {
        return teamLeader;
    }


    public void setNewTeamLeader(Personnel teamLeader) {
        this.teamLeader = teamLeader;
        if (!personnel.contains(teamLeader)){
            personnel.add(teamLeader);
            System.out.println("New team leader : " +teamLeader);
        }
    }

        public void addPerson(Personnel person) {
            this.personnel.add(person);
        }

        public void removePerson(Personnel person) {
            if (person.equals(teamLeader)){
                System.out.println("The team leader cannot be removed from the list!");
            } else {
                this.personnel.remove(person);
            }
        }

        public void updatePerson(Personnel currentPerson, Personnel newPerson) {
            int index = personnel.indexOf(currentPerson);
            if (index != -1) {
                this.personnel.set(index, newPerson);

            }
        }

        public List<Personnel> getPersonnel() {
            return personnel;
        }


        public void addTask(String task) {
            this.tasks.add(task);
        }

        public void markTaskAsCompleted(String completedTask) {
            int index = this.tasks.indexOf(completedTask);
            if (index != -1) {
                this.tasks.set(index, completedTask + " (Completed)");
            }
        }

        public List<String> getTasks() {
            return tasks;
        }
    }