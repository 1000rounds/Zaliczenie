public class Main {
    public static void main(String[] args) {
        Company company = Utils.initData();
        Utils.printBanner("Panel administracyjny firmy " + company.getName());

        boolean done = false;
        while (!done) {
            Utils.printOptions();
            int choice = Utils.inputInt("Wybierz operację: ");

            switch (choice) {
                case 1 -> company.printEmployees();
                case 2 -> company.addEmployee(
                        Utils.inputString("Podaj imię: "),
                        Utils.inputString("Podaj nazwisko: "),
                        Utils.inputInt("Podaj pensję: "),
                        Utils.inputInt("Podaj wiek: "));
                case 3 -> {
                    company.printEmployees();
                    company.removeEmployee(Utils.inputInt("Podaj id pracownika: "));
                }
                case 4 -> {
                    company.printEmployees();
                    company.editEmployee(Utils.inputInt("Podaj id pracownika: "));
                }
                case 5 -> {
                    Departament.printDepartments();
                    Departament departament = Departament.values()[Utils.inputInt("Podaj id działu: ")];
                    System.out.println("Wybrano dział: " + departament.getName());
                    company.printEmployeesByDepartment(departament);
                }
                case 6 -> company.analyzeEmployees();
                case 7 -> company.calculateTaxes();
                case 8 -> {
                    System.out.println("Do zobaczenia!");
                    done = true;
                }
                default -> System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
            }
        }
    }
}
