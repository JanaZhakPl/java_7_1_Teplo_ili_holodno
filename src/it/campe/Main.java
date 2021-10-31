package it.campe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
         Scanner s = new Scanner(System.in);
         double tempreture = s.nextDouble();
         if (tempreture > 0){
             System.out.println(warm);
         } else {
             System.out.println(cold);
         }

    }
}


/*1Ввести с клавиатуры температуру на улице. Если температура меньше 0,
вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".*/