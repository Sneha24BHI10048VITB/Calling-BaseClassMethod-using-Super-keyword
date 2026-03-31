// Program to demonstrate calling a base class method using super keyword

// Parent class
class Employee {
    protected String name;
    protected double salary;

    // Constructor of parent class
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method of parent class
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
    }
}

// Child class
class Manager extends Employee {
    private double bonus;

    // Constructor of child class
    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Overriding the parent class method
    @Override
    void displayDetails() {
        super.displayDetails();  // calling base class method
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

// Main class
public class SuperMethodExample {
    public static void main(String[] args) {
        Manager m = new Manager("Sneha Mukherjee", 35000, 5000);
        m.displayDetails();
    }
}
