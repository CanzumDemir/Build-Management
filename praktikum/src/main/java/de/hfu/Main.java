package de.hfu;

import java.lang.String;
import java.util.Scanner;

public class Main {
    static void kleinZuGross(){
        System.out.println("Bitte geben Sie eine Zeichenkette aus Kleinbuchstaben ein, welches dann zu Großbuchstaben geändert wird.\n");
        System.out.print("Zeichenkette: ");

        Scanner zeichenKetteEingabe = new Scanner(System.in);
        String zeichenKette = zeichenKetteEingabe.next();

        char[] zeichenKetteEinzeln = new char[zeichenKette.length()];

        for(int i = 0; i< zeichenKette.length(); i++){
            if(zeichenKette.charAt(i) > 96 && zeichenKette.charAt(i) < 123){
                zeichenKetteEinzeln[i] = zeichenKette.charAt(i);
                zeichenKetteEinzeln[i] = (char) (zeichenKetteEinzeln[i] - 32);
                System.out.print(zeichenKetteEinzeln[i]);
            }
            else {
                throw new IllegalArgumentException("Zeichenkette besteht aus nicht zugelassenen Zeichen!");
            }
        }
    }
    public static void main(String[] args) {
        kleinZuGross();
    }
}
