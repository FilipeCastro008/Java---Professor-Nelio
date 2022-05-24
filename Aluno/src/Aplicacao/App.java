package Aplicacao;
import java.util.Scanner;
import java.util.Locale;
import Entidade.NotaAluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NotaAluno nt = new NotaAluno();

        System.out.print("Digite seu nome: ");
        nt.setNome(sc.nextLine());
        
        for(int i = 0; i < 3; i++){
            System.out.print("Digite sua nota: ");
            nt.setNota(sc.nextDouble());
        }
        System.out.println();
        nt.resultado();
        sc.close();
    }
}
