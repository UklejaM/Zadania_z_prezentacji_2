package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

////////Pętle - for

        //1.
        //Wewnątrz pętli for (np. 10 razy) pobieraj produkt do kupienia i wyświetlaj go na ekran w
        //postaci : „Dodałem do koszyka <nazwa>, to nasz <numer iteracji> produkt!”


//        Scanner scanner = new Scanner(System.in);
//        String produkt;
//
//        for (int i = 1; i<11; i++) {
//        produkt = scanner.nextLine();
//            System.out.println("Dodałem do koszyka " + produkt + ", to nasz " + i + " produkt!");
//        }

        //2.
        //Stwórz pętle for, która wykona 5 iteracji. Wewnątrz pętli pobieraj z konsoli dowolną
        //wartość typu int . Po wyjściu z pętli zwróć sumę tych

//        Scanner scanner = new Scanner(System.in);
//
//        int suma = 0;
//
//        for (int i = 1; i<6; i++) {
//            System.out.println("Podaj " + i + ". liczbę:" );
//            int x = scanner.nextInt();
//            suma = suma + x;
//        }
//        System.out.println("Suma wprowadzonych liczb to: " + suma);

        //3.
        //3.*Stwórz pętle wewnątrz pętli (pamiętaj o różnych nazwach zmiennych iterujących!).
        //Wyświetl wartości iteratorów w postaci: „< iterator nr 1> : < iterator nr 2>”.

//        for (int i = 0; i<5; i++) {
//            for (int x = 0; x<5; x++) {
//                System.out.println(i + " : " + x);
//            }
//        }

        //4.
        //4.**Wyświetl kwadrat składający się z samych gwiazdek „*”, których liczba (długość boku
        //kwadratu) będzie równa podanej z konsoli wartości.

//        Scanner scanner = new Scanner(System.in);
//        int bok = scanner.nextInt();
//        String linia = "*  ".repeat(bok);
//
//        for (int i = 0; i < bok; i++) {
//            System.out.println(linia);
//        }

        //5.
        //5.**Jak wyżej, ale znak, z którego będzie składał się kwadrat, również pobierz z

//        Scanner scanner = new Scanner(System.in);
//        String znak = scanner.nextLine();
//        int bok = scanner.nextInt();
//        String linia = (" " + znak + " ").repeat(bok);
//
//        for (int i = 0; i < bok; i++) {
//            System.out.println(linia);
//        }

    }
}
