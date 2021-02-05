import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Operacoes {


    public void soma() {
        boolean continua = true;
        
        ArrayList<Double> numeros = new ArrayList<>();
            System.out.println("Digite o número ou 0 para sair: \n");
            Scanner soma1 = new Scanner(System.in);
            double n = soma1.nextDouble();    

            while(continua){
                if(n != 0){
                    numeros.add(n);}
                
            }
            if(n==0){
                System.out.println(numeros);
                continua = false;
            
            
            }



        }}
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
