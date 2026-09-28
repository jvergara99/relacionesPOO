import asociacion.Bank;
import asociacion.Employee;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
        System.out.println("=====Relaciones POO====");
        System.out.println("1) Asociación");
        System.out.println("2) Agregación");
        System.out.println("3) Composición");
        System.out.print("Opción: ");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                // Creating Employee objects
                Employee emp1 = new Employee("Ridhi");
                Employee emp2 = new Employee("Vijay");

                // adding the employees to a set
                Set<Employee> employees = new HashSet<>();
                employees.add(emp1);
                employees.add(emp2);

                // Creating a Bank object
                Bank bank = new Bank("ICICI");

                // setting the employees for the Bank object
                bank.setEmployees(employees);

                // traversing and displaying the bank employees
                for (Employee emp : bank.getEmployees()) {
                    System.out.println(emp.getEmployeeName()
                            + " belongs to bank "
                            + bank.getBankName());
                }
                break;
            default:
                System.out.println("No existe opción");
                break;
        }

    }
}