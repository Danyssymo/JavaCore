package les3practika;

import java.util.Scanner;

public class Four {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        int x = sc.nextInt();
        if (x % 4 == 0) {

            if ( ( (x % 100) !=0) ) {

                System.out.println("Ваш год Высокосный");
               } else if (x % 400 == 0){
                System.out.println("Ваш год Высокосный");
               } else System.out.println("Ваш год не высокосный");

        } else {System.out.println("Ваш год не высокосный");}
    }
}