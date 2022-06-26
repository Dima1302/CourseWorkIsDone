public class Main {
    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Filipov Andrey Valentinovich", 1, 40_000);
        employee[1] = new Employee("Gadzur Oleg Olegovich", 2, 43_000);
        employee[2] = new Employee("Shneider Artem Vladimirovich", 3, 35_000);
        employee[3] = new Employee("Korneeva Anna Viktorovna", 4, 25_000);
        employee[4] = new Employee("Morozyk Inokentiy Smoktunovskiy", 5, 50_000);
        employee[5] = new Employee("Pereba Viktor Vasilyevich", 1, 30_000);
        employee[6] = new Employee("Kapustov Faruh Rahmetovich", 2, 45_000);
        employee[7] = new Employee("Goneev Dmitriy Robertovich ", 5, 10_000);
        employee[8] = new Employee("Lipovskaya Evgeniya Sergeevna", 4, 55_000);
        employee[9] = new Employee("Bludov Vladimir Valeriyevich", 3, 60_000);

        countDepartmentMinSalary(2);
        countMinSalary();
        countDepartmentMaxSalary(1);
        typeAllStuff();
        countMaxSalary();
        countAverageSalary();
        countSumSalary();
        typeEmployeeNames();
        countDepartmentSumSalary(2);
        countDepartmentAverageSalary(3);
        System.out.println(employee[3]);
        indexSalary(10, employee[3]);
        System.out.println(employee[3]);
        typeAllEmployeeExceptDepartment();
        employeeWithSalaryMore(58_000.0);
        employeeWithSalaryLess(15_000.0);
    }

    public static void countMinSalary() {
        if (employee.length > 0) {
            double minSalary = employee[0].getSalary();
            String staffMan = "";
            for (Employee employees : employee) {
                if (minSalary > employees.getSalary()) {
                    minSalary = employees.getSalary();
                    staffMan = employees.getName();
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + minSalary + " " + " руб " + "-" + " " + staffMan);

        } else {
            System.out.println("Массив пуст");
        }
    }

    public static void countDepartmentMinSalary(int departmentNumber) {

        if (employee.length > 0) {
            double minSalary = 0;
            String staffMan = "";
            for (int i = 0; i < employee.length; i++) {
                if (employee[i].getDepartmentNumber() == departmentNumber && (minSalary > employee[i].getSalary() || minSalary == 0)) {
                    minSalary = employee[i].getSalary();
                    staffMan = employee[i].getName();
                }
            }
            System.out.println("Сотрудник отдела " + departmentNumber + " с минимальной зарплатой: " + minSalary + " " + " руб " + "-" + " " + staffMan);
        }
    }

    public static void countDepartmentMaxSalary(int departmentNumber) {
        if (employee.length > 0) {
            double maxSalary = 0;
            String staffMan = "";
            for (int i = 0; i < employee.length; i++) {
                if (employee[i].getDepartmentNumber() == departmentNumber && (maxSalary < employee[i].getSalary() || maxSalary == 0)) {
                    maxSalary = employee[i].getSalary();
                    staffMan = employee[i].getName();
                }
            }
            System.out.println("Сотрудник отдела " + departmentNumber + " с максимальной зарплатой: " + maxSalary + " " + " руб " + "-" + " " + staffMan);
        }
    }

    public static void countMaxSalary() {
        double maxSalary = employee[0].getSalary();
        String staffMan = "";
        for (Employee employee : employee) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                staffMan = employee.getName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary + " " + " руб " + "-" + " " + staffMan);
    }

    public static void typeAllStuff() {
        for (Employee employee : employee
        ) {
            System.out.println(employee.toString());
        }
    }

    public static void countSumSalary() {
        double sum = 0;
        for (Employee employee : employee
        ) {
            sum += employee.getSalary();
        }
        System.out.println("Cумма затрат на зарплаты в месяц: " + sum);

    }

    public static void countDepartmentSumSalary(int departmentNumber) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartmentNumber() == departmentNumber) {
                sum += employee[i].getSalary();
            }

        }
        System.out.println("Номер отдела " + departmentNumber + " сумма затрат " + sum);
    }

    public static void countAverageSalary() {
        double sum = 0;
        for (Employee employee : employee
        ) {
            sum += employee.getSalary();
        }
        double averageSalary = sum / employee.length;
        System.out.println("Среднее значение зарплат: " + averageSalary);

    }

    public static void countDepartmentAverageSalary(int departmentNumber) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartmentNumber() == departmentNumber) {
                sum += employee[i].getSalary();
                count++;
            }
        }
        double averageSalary = sum / count;

        System.out.println("Номер отдела " + departmentNumber + " средняя зарплата " + averageSalary);
    }


    public static void indexSalary(double index, Employee emp) {
        double nowSalary = emp.getSalary();
        nowSalary = nowSalary * 0.01 * index / 0.01;
        emp.setSalary(nowSalary);
    }

    public static void typeEmployeeNames() {
        for (Employee employee : employee
        ) {
            System.out.println(employee.getName());
        }
    }

    public static void typeAllEmployeeExceptDepartment() {
        for (int i = 0; i < employee.length; i++) {


            System.out.println(("ФИО " + employee[i].getName() + " . " + "Зарплата сотрудника - " + employee[i].getSalary() + " . " + "Идентификационный номер - " + employee[i].getId()).toString());
        }
    }

    public static void employeeWithSalaryMore(double randomNumber) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > randomNumber) {
                System.out.println(("У сотрудника " + employee[i].getName() + " Идентификационный номер - " + employee[i].getId() + " Зарплата " + employee[i].getSalary() + " > " + randomNumber).toString());
            }
        }

    }

    public static void employeeWithSalaryLess(double randomNumber) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < randomNumber) {
                System.out.println(("Сотрудник: " + "" + employee[i].getName() + "." + " Идентификационный номер - " + employee[i].getId() + "." + " Зарплата " + employee[i].getSalary() + " < " + randomNumber).toString());
            }

        }
    }
}
