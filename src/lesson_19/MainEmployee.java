package lesson_19;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("John P.", 2000);
        Employee employee1 = new Employee("John P.", 2000);
        Employee employee2 = new Employee("John P.", 2000);

        System.out.println(employee.info());
        System.out.println(employee1.info());
        System.out.println(employee2.info());

    }
}
