import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        Operacoes calculo = new Operacoes();
        System.out.println("Iniciado o programa...\n Digite a opção desejada:");
        System.out.println("\n 1- somar\n 2- subtrair\n 3- dividir\n 4- multiplicar\n 5- sair\n SUA ESCOLHA:");
        Scanner opc = new Scanner(System.in);
        int num = opc.nextInt();
        switch (num){
            case 1:
                System.out.println("Vamos somar!");
                calculo.soma();
        }
        }
    }

