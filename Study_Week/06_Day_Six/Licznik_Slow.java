package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        System.out.println(zliczWystapieniaSlow(tekst));
    }

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst){
        String[] slowa = tekst.split(" ");
        Map<String, Integer> mapa = new TreeMap<>();    //Ustawia słowa w kolejności alfabetycznej
        //Map<String, Integer> mapa = new LinkedHashMap<>();   //Nie ustawia słów w kolejności alfabetycznej
        for(String slowo:slowa){
            if(mapa.containsKey(slowo)){
                int wystapienia = mapa.get(slowo);
                mapa.put(slowo, ++wystapienia);
            } else{
                mapa.put(slowo, 1);
            }
        }
        return mapa;
    }
}
