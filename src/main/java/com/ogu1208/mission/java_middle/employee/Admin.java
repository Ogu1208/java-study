package com.ogu1208.mission.java_middle.employee;

public class Admin extends Employee{

    private String position;

    public Admin(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + "  관리자{" +
                "직책='" + position + '\'' +
                '}';
    }
}
