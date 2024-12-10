import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников и руководителей
        Employee employee1 = new Employee("Ivan", 50000, "1985-02-15");
        Employee employee2 = new Employee("Oleg", 45000, "1984-02-15");
        Director director1 = new Director("Sergey",100000, "1975-11-10");

        // Добавляем всех сотрудников в общий список
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(director1);

        // Сравниваем даты рождения сотрудников
        System.out.println("Ответ на задание №1 :\n" + Employee.compareDates(director1.getBirthday(), employee1.getBirthday()));

        // Печатаем зарплаты до повышения
        System.out.println("\nЗарплаты до повышения:");
        for (Employee employee : employees) {
            System.out.println("Зарплата " + employee.getName() + ": " + employee.getSalary());
        }

        // Повышаем зарплату всем сотрудникам, кроме руководителей
        Director.increaseSalary(employees);

        // Печатаем зарплаты после повышения
        System.out.println("\nЗарплаты после повышения:");
        for (Employee employee : employees) {
            System.out.println("Зарплата " + employee.getName() + ": " + String.format("%.1f", employee.getSalary()));
        }
    }
}
