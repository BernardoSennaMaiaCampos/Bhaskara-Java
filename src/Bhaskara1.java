import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Bhaskara1 {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Entre com o valor de 'a': ");
        double a = myObj.nextDouble();
        System.out.println("O valor de 'a' é: " + a);
        
        System.out.print("\nEntre com o valor de 'b': ");
        double b = myObj.nextDouble();
        System.out.println("O valor de 'b' é: " + b);
        
        System.out.print("\nEntre com o valor de 'c': ");
        double c = myObj.nextDouble();
        System.out.println("O valor de 'c' é: " + c);
        
        if (a == 0) {
            if (b != 0) {
                double r = -c / b;
                System.out.println("\nEsta equação é linear. A raiz é: " + r);
            } else {
                System.out.println("\nA equação não é válida.");
            }
        } else {
            double delta = (Math.pow(b, 2) - 4 * a * c);

            if (delta < 0) {
                System.out.println("\nImpossível calcular a raiz (delta < 0).");
            } else if (delta == 0) {
                double r = -b / (2 * a);
                DecimalFormat df = new DecimalFormat("#.#####");
                String rFormatado = df.format(r).replace('.', ',');
                System.out.println("\nA equação tem uma única raiz: " + r);
            } else {
                double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                double r2 = (-b - Math.sqrt(delta)) / (2 * a);

                DecimalFormat df = new DecimalFormat("#.#####");

                String r1Formatado = df.format(r1).replace('.', ',');
                String r2Formatado = df.format(r2).replace('.', ',');

                System.out.println("\nA primeira resposta é: " + r1Formatado);
                System.out.println("\nA segunda resposta é: " + r2Formatado);
            }
        }
        
        System.out.println("\nPrograma finalizado");
        myObj.close();
        System.exit(0);
    }
}
