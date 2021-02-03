import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Operacoes {


    public void soma() {
        boolean continua = true;
        while (continua) {
            List<Double> numeros = new LinkedList<>();
            System.out.println("Digite o número ou 0 para sair: \n");
            Scanner soma1 = new Scanner(System.in);
            double n = soma1.nextDouble();
            if(n == 0){
                continua = false;
                System.out.println("Fim do programa");
            }
            else{
            numeros.add(n);
            System.out.println(numeros);
            }



        }}}
/*
        public void subtrai () {

        }

        public void mult () {

        }

        public void div () {

        }
    }
}
*/
