import java.util.Locale;
import java.util.Scanner;



public class Ex5 {
    public static void main (String [] args)throws Exception {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */
        double a, b, c, tri, circ, trap, quad, ret, pi;
        pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite os valores de 'A','B' e 'C': ");
        a = sc.nextDouble();
        sc.nextLine();
        b = sc.nextDouble();
        sc.nextLine();
        c = sc.nextDouble();

        //Área do triângulo retângulo
        tri = (a * c) / 2;
        System.out.printf("Triângulo: %.3f \n", tri);
        //Área do círculo
        circ = pi * Math.pow(c, 2);
        System.out.printf("Círculo: %.3f \n", circ);
        //Área do trapézio
        trap = ((a + b) * c) / 2;
        System.out.printf("Trapézio: %.3f \n", trap);
        //Área do quadrado
        quad = Math.pow(b, 2);
        System.out.printf("Quadrado: %.3f \n", quad);
        //Área do retângulo
        ret = a * b;
        System.out.printf("Retângulo: %.3f \n", ret);
    }
}
