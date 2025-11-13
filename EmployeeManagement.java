// Abstract base class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract void calculateSalary();
}

// Subclass 1: Manager
class Manager extends Employee {
    double baseSalary;

    Manager(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    @Override
    void calculateSalary() {
        double salary = baseSalary + 10000; // bonus added
        System.out.println("Manager Salary for " + name + " (ID: " + id + "): ₹" + salary);
    }
}

// Subclass 2: Developer
class Developer extends Employee {
    double baseSalary;

    Developer(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    @Override
    void calculateSalary() {
        double salary = baseSalary + 5000; // allowance added
        System.out.println("Developer Salary for " + name + " (ID: " + id + "): ₹" + salary);
    }
}

// Subclass 3: Intern
class Intern extends Employee {
    double stipend;

    Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    void calculateSalary() {
        System.out.println("Intern Stipend for " + name + " (ID: " + id + "): ₹" + stipend);
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        // Dynamic method dispatch: base class reference → subclass objects
        Employee e1 = new Manager("Ravi", 101, 50000);
        Employee e2 = new Developer("Priya", 102, 40000);
        Employee e3 = new Intern("Amit", 103, 10000);

        // Polymorphic behavior
        e1.calculateSalary();  // Manager’s version
        e2.calculateSalary();  // Developer’s version
        e3.calculateSalary();  // Intern’s version
    }
}

