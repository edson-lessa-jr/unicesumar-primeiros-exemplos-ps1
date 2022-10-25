import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        /*Faça um programa em JAVA que solicite dois números ao
         usuário. Calcule a média e exiba o resultado*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número ");
        /*Recupera um valor do tipo double (decimal)*/
        double n1 = scanner.nextDouble();
        System.out.println("Informe o segundo número ");
        double n2 = scanner.nextInt();
        /* calcula a média, importante que aas variáveis n1 e n2 sejam do tipo double também, caso contrário o Java, se forem do tipo inteiro o resultado será inteiro também (será ignorado o valor decimal)*/
        double media = (n1+n2)/2;
        /* exibe o resultado na tela concatenando com os valores de entrada */
        System.out.println("Média entre "+n1+" e "+n2+" é: "+ media);
    }
}
