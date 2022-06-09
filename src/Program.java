import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.addAll(FactoryUtils.initEmployees());

        employees.forEach(employee -> System.out.println(employee));
        Helper.report(employees);
    }
}
