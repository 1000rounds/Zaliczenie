import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    static Company initData() {
        Person firstPerson = new Person("Jan", "Pierwszy");
        Person secondPerson = new Person("Kazimierz", "Drugi");
        Person thirdPerson = new Person("Kamil", "Trzeci");
        Person fourthPerson = new Person("Michał", "Czwarty");
        Person fifthPerson = new Person("Krzysztof", "Piąty");
        Person sixthPerson = new Person("Andrzej", "Szósty");

        Employee firstEmployee = new Employee(firstPerson, Departament.SALES, 6400.0, 24);
        Employee secondEmployee = new Employee(secondPerson, Departament.FINANCE, 7200.0, 28);
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION, 7000.0, 31);
        Employee fourthEmployee = new Employee(fourthPerson, Departament.FINANCE, 6100.0, 20);
        Employee fifthEmployee = new Employee(fifthPerson, Departament.FINANCE, 8400.0, 53);
        Employee sixthEmployee = new Employee(sixthPerson, Departament.SALES, 12200.0, 38);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(fourthEmployee);
        employees.add(fifthEmployee);
        employees.add(sixthEmployee);

        Company company = new Company("MERITO COMPANY");
        company.setEmployees(employees);

        return company;
    }
    public static int inputInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Proszę podać poprawną liczbę całkowitą:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static int inputInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Proszę podać poprawną liczbę całkowitą:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static String inputString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    static void printBanner(String title) {
        System.out.println(title);
    }

    static void printAnswer(String message) {
        System.out.println(message);
    }

    static void printOptions() {
        System.out.println("1. Wyświetl pracowników");
        System.out.println("2. Dodaj pracownika");
        System.out.println("3. Zwolnij pracownika");
        System.out.println("4. Edytuj pracownika");
        System.out.println("5. Wybierz dział");
        System.out.println("6. Analiza pracowników");
        System.out.println("7. Oblicz podatki");
        System.out.println("8. Wyjście");
    }

    public static double inputDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Proszę podać poprawną liczbę zmiennoprzecinkową:");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }
}
