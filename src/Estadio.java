import java.util.Scanner;

public class Estadio {
    public static void main(String[] args) {
        /** Declarar as Variaveis  */
        String nome;
        int idade, corCamisa;

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coletar dados */
        System.out.println("-------------------");
        System.out.print("Qual é o seu nome: ");
        nome = teclado.next();
        System.out.print("Qual é a sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Qual a cor da sua Camisa:\n" +
                "1- Azul\n" +
                "2- Branca\n" +
                "3- Vermelha\n" +
                "4- Preta\n" +
                "5- Amarela\n" +
                "6- Verde\n" +
                "Escolha a opção [1-6]: ");
        corCamisa = teclado.nextInt();

        switch (corCamisa){
            case 1:
                System.out.println("Sua arquibancada é a letra A");
                break;

            case 2:
                System.out.println("Sua arquibancada é a letra B");
                break;

            case 3:
                System.out.println("Sua arquibancada é a letra C");
                break;

            case 4:
                System.out.println("Sua arquibancada é a letra D");
                break;
            case 5:
                System.out.println("Sua arquibancada é a letra E");
                break;
            case 6:
                System.out.println("Sua arquibancada é a letra F");
                break;

            default:
                System.out.println("Não Entra !!!");
        }

    }
}