package com.ogu1208.mission.java_middle.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ogu", 5000000);
        Admin admin = new Admin("LittleOgu", 6000000, "벌목 관리자");

        System.out.println("Ogu 직원 정보: ");
        System.out.println(employee.toString());

        System.out.println("LittleOgu 관리자 정보");
        System.out.println(admin.toString());
    }
}
