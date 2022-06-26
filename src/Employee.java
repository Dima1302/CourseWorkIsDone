public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    private static int count = 0;
    private int id;


    public Employee(String name, int department, int salary) {
        this.name = name;
        this.departmentNumber = department;
        this.salary = salary;
        this.count++;
        this.id = counter();
    }


    public String getName() {
        return name;
    }


    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public static int counter() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника " + name + ". " +
                "Зарплата сотрудника " + salary + " руб" + ". " +
                "Номер департамента " + departmentNumber + ". " +
                "Идентификационный номер " + "-" + " " + id + ".";

    }


}
