import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcaoEscolhida = escolhaOperacao();
        while (opcaoEscolhida != 0){
            int[] numeros = lerNumeros();
            if(opcaoEscolhida == 1){
                int resultadoSoma = soma(numeros[0], numeros[1]);
                System.out.println("O resultado da soma é :" + resultadoSoma);
                opcaoEscolhida = escolhaOperacao();
            } else if(opcaoEscolhida == 2) {
                int resultadoSub = subtrair(numeros[0], numeros[1]);
                System.out.println("O resultado da subtracao é :" + resultadoSub);
                opcaoEscolhida = escolhaOperacao();
            } else {
                opcaoEscolhida = 0;
            }
        }
    }
    public static int escolhaOperacao(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual operação voce deseja realizar");

        System.out.println("Digite 1 para Soma ou 2 para subtração");
        return entrada.nextInt();
    }
    public static int[] lerNumeros(){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[2];

        System.out.println("Informe o primeiro número: ");
        numeros[0] = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        numeros[1] = entrada.nextInt();
        return numeros;
    }
    public static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }
}