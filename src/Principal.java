import java.util.Scanner;

/** Referente ao exercício 1 da aula 3
 * @author Edson Lessa
 * @version 1.0
 */
public class Principal {
    /**
     * Primeiro programa que irá coletar e exibir dados
     * @param args entrada de dados do sistema operacional
     */
    public static void main(String[] args) {
        /* Exibe o nome na tela */
        System.out.println("Informe o nome");

        /** @
         *  na primeira linha está sendo importado o Scanner
        * O scanner é a classe responsável por capturar
        *  os dados que o usuário irá digirar*/
        Scanner scannerNome = new Scanner(System.in);
        /* nextline é responsável por ler a linha para coletar os dados e atribuir em uma variável*/
        String nome = scannerNome.nextLine();

        System.out.println("Informe a matrícula");
        Scanner scannerMatricula = new Scanner(System.in);
        int matricula = scannerMatricula.nextInt();
        System.out.println("Informe o fone");
        Scanner scannerFone = new Scanner(System.in);
        int fone = scannerFone.nextInt();
        /* Saída de dados na tela dos dados*/
        System.out.println("Nome: "+nome+"\n" +
                "Matrícula: "+ matricula+"\n" +
                "fone: "+fone);
    }
}
