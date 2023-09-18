package org.example;

import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Calcolatrice {
    public static void main(String[] args) {

        System.out.println("Calcolatrice in CLI!");
        Calcolatrice m = new Calcolatrice();
        m.start();

    }

    public void start(){
        Calcolatrice m = new Calcolatrice();
        int num1=0;
        int num2=0;
        float risultato=0;
        System.out.println("Quale operazione vuoi effettuare?\n1) +\n2) -\n3) *\n4) /\n5) sqrt\n6) log10");
        Scanner scanner = new Scanner(System.in);
        boolean validInput = FALSE;
        while (!validInput) {
            System.out.println("inserisci l'opzione:");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("è una stringa. riprova");
                continue;
            }
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    validInput = TRUE;
                    System.out.println("inserisci il primo numero");
                    num1=scanner.nextInt();
                    System.out.println("inserisci il secondo numero");
                    num2=scanner.nextInt();
                    risultato=num1+num2;
                    System.out.println("risultato:\n"+num1+"+"+num2+"="+risultato);
                    m.start();
                    break;
                case 2:
                    validInput = TRUE;
                    System.out.println("inserisci il primo numero");
                    num1=scanner.nextInt();
                    System.out.println("inserisci il secondo numero");
                    num2=scanner.nextInt();
                    risultato=num1-num2;
                    System.out.println("risultato:\n"+num1+"-"+num2+"="+risultato);
                    m.start();
                    break;
                case 3:
                    validInput = TRUE;
                    System.out.println("inserisci il primo numero");
                    num1=scanner.nextInt();
                    System.out.println("inserisci il secondo numero");
                    num2=scanner.nextInt();
                    risultato=num1*num2;
                    System.out.println("risultato:\n"+num1+"*"+num2+"="+risultato);
                    m.start();
                    break;
                case 4:
                    validInput = TRUE;
                    System.out.println("inserisci il primo numero");
                    num1=scanner.nextInt();
                    System.out.println("inserisci il secondo numero");
                    num2=scanner.nextInt();
                    risultato=num1/num2;
                    System.out.println("risultato:\n"+num1+"/"+num2+"="+risultato);
                    m.start();
                    break;
                case 5:
                    validInput = TRUE;
                    System.out.println("inserisci il numero");
                    num1=scanner.nextInt();
                    risultato= (float) Math.sqrt((float)num1);
                    System.out.println("risultato:\nsqrt("+num1+")"+"="+risultato);
                    m.start();
                    break;
                case 6:
                    validInput = TRUE;
                    System.out.println("inserisci il numero");
                    num1=scanner.nextInt();
                    risultato= (float) Math.log10(num1);
                    System.out.println("risultato:\nlog10("+num1+")"+"="+risultato);
                    m.start();
                    break;

                default:
                    System.out.println("numero invalido,riprova");
                    scanner.nextLine();
            }
        }
    }
}