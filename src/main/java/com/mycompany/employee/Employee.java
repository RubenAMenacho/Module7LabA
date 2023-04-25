/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author ramlifting
 */

import java.util.Date;
import java.util.Calendar;

public class Employee {
   private String firstName;
   private String lastName;
   private Date birthDate;
   private Date hireDate;

   // constructor to initialize name, birth date and hire date
   public Employee(String firstName, String lastName, Date birthDate,
      Date hireDate) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthDate = birthDate;
      this.hireDate = hireDate;
   }

    Employee(String bob, String blue, com.mycompany.employee.Date birth, com.mycompany.employee.Date hire) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   // get method for birth date
   public Date getBirthDate() {
      return birthDate;
   }

   // calculate the employee's payroll
   public double calculatePayroll() {
      return 2000.0; // replace with actual calculation
   }

   // convert Employee to String format
   public String toString() {
      return String.format("%s, %s  Hired: %s  Birthday: %s",
         lastName, firstName, hireDate, birthDate);
   }

   public static void main(String[] args) {
      Employee[] employees = new Employee[1];
      employees[0] = new Employee("Bob", "Blue", new Date(49, 6, 24), new Date(88, 2, 12));

      Calendar calendar = Calendar.getInstance();
      int currentMonth = calendar.get(Calendar.MONTH) + 1; // add 1 because Calendar.MONTH is zero-based

      for (Employee employee : employees) {
         Date birthDate = employee.getBirthDate();
         int birthMonth = birthDate.getMonth();

         double payroll = employee.calculatePayroll();
         if (birthMonth == currentMonth) {
            payroll += 100.0;
         }

         System.out.printf("%s's payroll for this month is $%.2f%n", employee.firstName, payroll);
      }
   }
}
