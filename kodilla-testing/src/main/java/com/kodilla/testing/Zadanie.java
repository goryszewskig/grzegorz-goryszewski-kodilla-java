package com.kodilla.testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Zadanie {
    public static void main(String[] args) {
        int[] lista = new int[] {1, 2, 4, 5};
        int result = solution(lista);
        wyswietlWynik(lista, result);

        int[] lista2 = new int[] {1, 4, 8, 3, 2};
        int result2 = solution(lista2);
        wyswietlWynik(lista2, result2);

        int[] lista3 = new int[] {-3, -1};
        int result3 = solution(lista3);
        wyswietlWynik(lista3, result3);

        int[] lista4 = new int[] {1, 3, 6, 4, 1, 2};
        int result4 = solution(lista4);
        wyswietlWynik(lista4, result4);
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
