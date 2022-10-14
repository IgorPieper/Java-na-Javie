package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        System.out.println(skorowidzLiterowy(tekst));
    }

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        String[] literki = tekst.split("");
        Map<String, Set<Integer>> skorowidz = new TreeMap<>();
        for (int i=0; i<literki.length;i++){
            if(skorowidz.containsKey(literki[i])){
                Set<Integer> indeksy = skorowidz.get(literki[i]);
                indeksy.add(i);
            } else{
                skorowidz.put(literki[i], new TreeSet<>(Arrays.asList(i)));
            }
        }
        return skorowidz;
    }
}
