package com.uniyaz.nesneproje;

public class Employees {
   public long employeeId;
   public String employeeName ;
   public String employeeLastName;
   public int monthlySalary;
   public Department department;

   public long getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(long employeeId) {
      this.employeeId = employeeId;
   }

   public String getEmployeeName() {
      return employeeName;
   }

   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }

   public String getEmployeeLastName() {
      return employeeLastName;
   }

   public void setEmployeeLastName(String employeeLastName) {
      this.employeeLastName = employeeLastName;
   }

   public int getMonthlySalary() {
      return monthlySalary;
   }

   public void setMonthlySalary(int monthlySalary) {
      this.monthlySalary = monthlySalary;
   }

   public Department getDepartment() {
      return department;
   }

   public void setDepartment(Department department) {
      this.department = department;
   }
}
