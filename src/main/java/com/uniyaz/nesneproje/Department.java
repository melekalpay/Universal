package com.uniyaz.nesneproje;

public class Department {
    private long departmentId;
    private String departmentName;


    public int howManyhourWork(){
        return 8;
    }


    public int minSalary(){
        int minSalary = 8500;
        return minSalary;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
