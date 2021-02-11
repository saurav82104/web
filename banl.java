package lab2;

import java.util.Scanner;

class EmployeeInfo{

    String name;
    String address;
    int salary;
    int year;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public void getInfo(){
        Scanner s= new Scanner(System.in);
        Scanner scannerLong = new Scanner(System.in);
        System.out.println("\nEnter Employee Name: ");
        name = s.nextLine();
        System.out.println("\nEnter Employee Salary: ");
        salary = s.nextInt();
        System.out.println("\nEnter Address");
        address = scannerLong.nextLine();
        System.out.println("\nEnter Joining Year: ");
        year = s.nextInt();
    }
    public void display(){
        System.out.println("\n"+ getName() + "\t\t\t" + getYear() + "\t\t\t" + getAddress());
    }

}

public class Employee {

    public static void main(String[] args) {
        int i;
        EmployeeInfo[] employeeInfo = new EmployeeInfo[3];
        for (i = 0; i < 3; i++) {
            employeeInfo[i] = new EmployeeInfo();
            employeeInfo[i].getInfo();
        }
        //Display
        System.out.println("Name\t\t\t Year of Joining\t\t\t Address");
        for (i = 0; i < 3; i++) {
            employeeInfo[i].display();
        }
    }
}
