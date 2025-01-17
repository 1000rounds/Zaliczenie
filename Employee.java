import java.util.List;

public class Employee extends Person {

    private Departament departament;
    private double salary;
    private int age;
    private List<Employee> employees;


    public Employee(Person person, Departament departament, double salary, int age) {
        super(person.getName(), person.getSurname());
        this.departament = departament;
        this.salary = salary;
        this.age = age;

    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
