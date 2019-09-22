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

//////////Pętle - while i do - while

        //1.
        //Wewnątrz pętli while (np. 10 razy) pobieraj produkt do kupienia i wyświetlaj go na ekran
        //w postaci : „Dodałem do koszyka <nazwa>, to nasz <numer iteracji> produkt!”

//        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//
//        while (i < 11) {
//            System.out.println("Podaj nazwę produktu:");
//            String produkt = scanner.nextLine();
//            System.out.println("Dodałem do koszyka " + produkt + ", to nasz " + i + ". produkt");
//            i++;
//        }

        //2.
        //Stwórz pętle while , która wykona 5 iteracji. Wewnątrz pętli pobieraj z konsoli dowolną
        //wartość typu int . Po wyjściu z pętli zwróć sumę tych wartości.

//        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        int suma = 0;
//        while (i < 6) {
//            System.out.println("Podaj " + i + ". liczbę:");
//            int skladnik = scanner.nextInt();
//            suma = suma + skladnik;
//            i++;
//        }
//        System.out.println("Suma podanych liczb to:" + suma);

        //3.
        //Jak wyżej, ale zwróć sumę tylko tych wartości, które były większe od 10;

//        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        int suma = 0;
//        while (i < 6) {
//            System.out.println("Podaj " + i + ". liczbę:");
//            int skladnik = scanner.nextInt();
//            if (skladnik > 10) {
//                suma = suma + skladnik;
//            } else {
//                System.out.println("Podana liczba nie jest większa od 10.");
//            }
//            i++;
//        }
//        System.out.println("Suma podanych liczb większych od 10 to:" + suma);

        //4.
        //4.*Pobieraj i wyświetlaj dowolny ciąg znaków od użytkownika tak długo, aż nie napisze „koniec"

//        Scanner scanner = new Scanner(System.in);
//        String produkt;
//
//        do {
//            System.out.println("Podaj nazwę produktu:");
//            produkt = scanner.nextLine();
//            System.out.println(produkt);
//        } while (!produkt.equals("koniec"));

        //5.
        //5.*Jak wyżej, z i bez wyświetlania słowa „koniec"

        // ^ Tutaj bez, w poprzednim z.


//        Scanner scanner = new Scanner(System.in);
//        String produkt;
//        do {
//            System.out.println("Podaj nazwę produktu:");
//            produkt = scanner.nextLine();
//            if (!produkt.equals("koniec")) {
//                System.out.println(produkt);
//            }
//        } while (!produkt.equals("koniec"));

////////// Tablice jednowymiarowe - petle for each

//        int[] tab = new int[10];
//        System.out.println("Tablica tab ma długość : " + tab.length);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Wartość w tablicy przed wpisaniem tab[" + i + "] : " + tab[i]);
//        }
//        for (int i = 0; i < 10; i++) {
//            tab[i] = i + 50;
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Wartość w tablicy po wpisaniu tab[" + i + "] : " + tab[i]);
//        }

        //1.
        //Wewnątrz pętli while (np. 10 razy) pobieraj produkt do kupienia i wprowadzaj go do
        //utworzonej tablicy typu String. Wyświetl wszystkie produkty z wykorzystaniem pętli for
        //oraz for each

//        Scanner scanner = new Scanner(System.in);
//        String[] produkty = new String[10];
//        int i = 0;
//
//        while (i < 10) {
//            System.out.println("Podaj nazwę produktu:");
//            String produkt = scanner.nextLine();
//            System.out.println("Dodałem do koszyka " + produkt + ", to nasz " + (i + 1) + ". produkt");
//            produkty[i] = produkt;
//            i++;
//        }
//        System.out.println("Lista wprowadzonych produktów (for):");
//
//        for (int x = 0; x < 10; x++) {
//            System.out.println("  - " + produkty[x]);
//        }
//        System.out.println("Lista wprowadzonych produktów (foreach):");
//        for (String produkt : produkty) {
//            System.out.println("  - " + produkt);
//        }


        //2.
        //Utwórz tablicę przechowującą wartości typu int o rozmiarze zadanym z konsoli. Wypełnij
        //ją wartościami wewnątrz pętli for. Zwróć sumę tych wartości.


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj ilość składników w tabeli:");
//        int dlugoscTabeli = scanner.nextInt();
//        int[] tablicaWartosci = new int[dlugoscTabeli];
//        int sumaSkladnikow = 0;
//        int i = 1;
//
//        for (int skladnik : tablicaWartosci) {
//            System.out.println("Podaj " + i + ". składnik:");
//            skladnik = scanner.nextInt();
//            System.out.println(skladnik);
//            sumaSkladnikow = sumaSkladnikow + skladnik;
//            i++;
//        }
//        System.out.println("Suma wprowadzonych skłądników wynosi: " + sumaSkladnikow);


        //3.
        //Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for each dopisuj imiona do zmiennej
        //typu String, oddzielając je przecinkami. Wyświetl utworzony łańcuch znaków. Np.
        //„Małgorzata, Jan,

        Scanner scanner = new Scanner(System.in);
        String[] imiona = new String[5];

        for (int i=0; i<5; i++) {
            imiona[i] = (scanner.nextLine() + ",");
        }
        for (String imie : imiona) {
            System.out.print(imie);
        }



        //4.
        //4.*Jak wyżej, ale dopisuj tylko imiona, które składają się z mniej, niż 5 znaków.


    }
}
