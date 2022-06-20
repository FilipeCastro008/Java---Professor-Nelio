package Aplicacao;
import java.util.Scanner;
import java.util.Locale;
import Entidades.Salario;

public class App {
    public static void main(String[] args) throws Exception {
        Salario sal = new Salario();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        sal.setNome(sc.nextLine());
        System.out.print("Groo salary: ");
        sal.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        sal.setTax(sc.nextDouble());
        sal.setSalario(sal.getGrossSalary(), sal.getTax());
        System.out.println();
        
        System.out.println(sal.getEmpregado());
        System.out.println();
        System.out.print("Qual a taxa de aumento: ");
        sal.increaseSalary(sc.nextDouble());
        System.out.println(sal.getEmpregado());
        sc.close();
    }
}
