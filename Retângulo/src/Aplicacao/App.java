package Aplicacao;
import Entidade.Retangulo;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Retangulo rt = new Retangulo();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);        
        

        System.out.println("Digite a altura do retângulo: ");
        rt.setHeigth(sc.nextDouble());
        System.out.println("Digite a largura do triângulo: ");
        rt.setWidth(sc.nextDouble());
        
        System.out.println("ÁREA: " + rt.area());
        System.out.println("PERÍMETRO: " + rt.perimetro());  
        System.out.println("DIAGONAL: " + rt.diagonal());
      
        sc.close();
    }
}
