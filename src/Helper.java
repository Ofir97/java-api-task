import java.util.List;

public class Helper {

    public static double getAvgSalary(List<Employee> employees) {
        Double sumSalaries = employees.stream().map(employee ->
                employee.getSalary()).reduce(0.0, Double::sum);

        return sumSalaries/employees.size();
    }

    public static double avgManagementSalary(List<Employee> employees) {
        Double sumSalaries = employees.stream()
                .filter(employee -> employee instanceof Manager || employee instanceof Director)
                .map(employee -> employee.getSalary())
                .reduce(0.0, Double::sum);

        return sumSalaries/FactoryUtils.getNumOfManagementEmployees(employees);
    }

    public static void display(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee));
    }

    public static void report(List<Employee> employees) {
        display(employees);
        avgManagementSalary(employees);
        System.out.println("Employees average management salary: " + avgManagementSalary(employees));
        System.out.println("Employees average salary: " + getAvgSalary(employees));

    }
}
