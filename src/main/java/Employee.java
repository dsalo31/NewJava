public class Employee {
    Employee(int id1, String name1, String surname1, int age1, double salary1, String department1) {
        id =id1;
        name =name1;
        surname =surname1;
        age =age1;
        salary =salary1;
        department =department1;
}
    int id;
    String name;
    String surname;
    int age;
    double salary;
    String department;
        void multiplieSalary(){
             salary *= 2;
        }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee den = new Employee(1, "Denys", "Salo", 33, 1500, "Gamedev");
        den.multiplieSalary();
        System.out.println(den.salary);
        Employee kar = new Employee(2, "Karyna", "Dom", 31, 900, "Gamedev");
        kar.multiplieSalary();
        System.out.println(kar.salary);

    }
}