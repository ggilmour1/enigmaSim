package com.examples.enigmaSim;

import java.util.Scanner;

public class EnigmaSim {

    public static void main(String[] args) {
        String x = getClearChar();
        System.out.println("Enc char = " + x);
    }
    public static String getClearChar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter clear character to be encoded");
        String clrChr = scan.nextLine();
        String encChar = plugBoardIn(clrChr);
        return encChar;

    }

/*    public static String getString() {
        // take input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scan.nextLine();
        // reverse the string
        String reverseStr = reverseStringData(str);
        // display result string
        return reverseStr;
    }
    public static String reverseStringData(String s) {
        String rev = new String();
        String chrt = Reflector.reflector(s);
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);

            // On every iteration new string
            // object will be created
            //System.out.println("Address of rev: "+
            //        System.identityHashCode(rev));
        }
        return rev;
    }
*/

    public static String plugBoardIn(String chr) {
        return getRot1CharIn(chr);
    }

    public static String plugBoardOut(String chr) {
        return chr;
    }

    public static String getRot1CharIn(String chr) {
        return getRot2CharIn(chr);
    }

    public static String getRot1CharOut(String chr) {
        return plugBoardOut(chr);
    }

    public static String getRot2CharIn(String chr) {
        return getRot3CharIn(chr);
    }

    public static String getRot2CharOut(String chr) {
        return getRot1CharOut(chr);
    }

    public static String getRot3CharIn(String chr) {
        return getReflectedChar(chr);
    }

    public static String getRot3CharOut(String chr) {
        return getRot2CharOut(chr);
    }

    public static String getReflectedChar(String chr) {

        String[] ukwa = {"E", "J", "M", "Z", "A", "L", "Y", "X", "V", "B", "W", "F", "C", "R", "Q", "U", "O", "N", "T", "S", "P", "I", "K", "H", "G", "D"};
        char x = chr.toUpperCase().charAt(0);
        int y = (int) x;
        System.out.println("The letter " + chr + "has index at " + y);
        String e = ukwa[y - 65];

        return getRot3CharOut(e);
    }



}
