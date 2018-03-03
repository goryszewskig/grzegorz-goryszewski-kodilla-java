package com.kodilla.testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Zadanie {
    public static void main(String[] args) {

        Set<Integer> mojeLiczby = new HashSet<Integer>();


        mojeLiczby.add(1);
        mojeLiczby.add(2);
        mojeLiczby.add(3);
        mojeLiczby.add(4);
        mojeLiczby.add(5);
        mojeLiczby.add(6);

        int iloscWykonan = 0 ;
        Long suma = 0L ;
        while(iloscWykonan<10) {
            suma += maszynaLosujaca(mojeLiczby);
            iloscWykonan++;
        }
        System.out.println("iloscWykonan: " + iloscWykonan + " srednia: " + suma/iloscWykonan);
    }
    public static int maszynaLosujaca(Set<Integer> mojeLiczby){
        Set<Integer> wylosowaneLiczby = new HashSet<Integer>();
        wylosowaneLiczby = generator();
        int counter = 0 ;

        while (!mojeLiczby.equals(wylosowaneLiczby)) {
            counter++;
            wylosowaneLiczby = generator();


        }
        System.out.println("Bingo! after: " + counter);
        return counter;
    }

    public static Set<Integer> generator(){
        Random liczby = new Random();

        Set<Integer> wylosowane = new HashSet<>();

        while(wylosowane.size() < 6 ){
            wylosowane.add(liczby.nextInt(49)+1);

        }
        return wylosowane;
    }

    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }

    public static int solution(int[] A){
        int najmniejsza = 1 ;
        Arrays.sort(A);
        Set<Integer> unikalne = new HashSet<Integer>();

        for(int a:A) {
            unikalne.add(a);
        }

        while(unikalne.contains(najmniejsza)){
          najmniejsza++;
        }

        return najmniejsza;

    }
}
