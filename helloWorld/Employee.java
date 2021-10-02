package myCaptain;

public class Employee {

    public static void main(String[] args) {
        EmployeeDetails[] newStudent = new EmployeeDetails[3];
        newStudent[0] = new EmployeeDetails("john","26B- WallsStreet",1999);
        newStudent[1] = new EmployeeDetails("Sam","68D- WallsStreet",2000);
        newStudent[2] = new EmployeeDetails("Robert" ,"64C- WallsStreet",1994);
        for (int i = 0; i < 3; i++) {
            System.out.print(newStudent[i].name + " " + newStudent[i].yearOfJoining + " " + newStudent[i].address + " ");
        }

    }
}
class EmployeeDetails{
    String name;
    int yearOfJoining;
    String address;
    EmployeeDetails(String name, String address , int yearOfJoining) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
}
