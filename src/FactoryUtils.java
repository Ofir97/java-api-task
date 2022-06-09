import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FactoryUtils {

    public static Double randSalary(Employee employee) {

        if (employee instanceof Secretary) {
            return (Math.random() * 1500) + 7000;
        }
        if (employee instanceof Engineer) {
            return (Math.random() * 2000) + 9000;
        }
        if (employee instanceof Manager) {
            return (Math.random() * 3500) + 12000;
        }
        if (employee instanceof Director) {
            return (Math.random() * 17000) + 18000;
        }

        // employee
        return 1000.0;
    }

    public static List<Employee> initEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (int i=0; i<2; i++) {
            employees.add(new Secretary("Office", Name.valueOf(Name.getRandName().toUpperCase()), randSalary(new Secretary())));
        }
        for (int i=0; i<2; i++) {
            employees.add(new Manager("department", Name.valueOf(Name.getRandName().toUpperCase()), randSalary(new Manager())));
        }
        for (int i=0; i<3; i++) {
            employees.add(new Employee(Name.valueOf(Name.getRandName().toUpperCase()), randSalary(new Employee())));
        }

        employees.add(new Director("group", Name.valueOf(Name.getRandName().toUpperCase()), randSalary(new Director())));

        for (int i=0; i<2; i++) {
            employees.add(new Engineer("engineer", Name.valueOf(Name.getRandName().toUpperCase()), randSalary(new Engineer())));
        }

        return employees;
    }

    public static int getNumOfManagementEmployees(List<Employee> employees) {
        return (int) employees.stream().filter(employee -> employee instanceof Manager || employee instanceof Director).count();
    }


}
