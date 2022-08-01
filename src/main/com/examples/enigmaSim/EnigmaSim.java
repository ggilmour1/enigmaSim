package com.examples.enigmaSim;

import java.util.HashMap;
import java.util.Map;
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
        String encChar = inToPlugboard(clrChr);
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

    public static String inToPlugboard(String chr) {
        String in = plugBoard(chr);
        return in;
    }

    public static String outToPlugboard(String chr) {
        String out = plugBoard(chr);
        return out;
    }

    public static String inToRotor1(String chr) {
        String[] rotor1 = {"L","P","G","S","Z","M","H","A","E","O","Q","K","V","X","R","F","Y","B","U","T","N","I","C","J","D","W"};
        Integer indexChar = getIndex(chr);
        String rotChar = rotor1[(indexChar)];
        return rotChar;
    }

    public static String outFromRotor1(String chr) {
        String[] rotor1 = {"L","P","G","S","Z","M","H","A","E","O","Q","K","V","X","R","F","Y","B","U","T","N","I","C","J","D","W"};
        Integer indexChar = getIndex(chr);
        String rotChar = rotor1[(indexChar)];

        System.out.println("Received " + chr + " from reflector. " + chr + " has ASCII " + indexChar + " and maps to " + rotChar);
        return rotChar;
    }

    public static String inToRotor2(String chr) {
        return inToRotor3(chr);
    }

    public static String outFromRotor2(String chr) {
        return outFromRotor1(chr);
    }

    public static String inToRotor3(String chr) {
        return getReflectedChar(chr);
    }

    public static String outFromRotor3(String chr) {
        return outFromRotor2(chr);
    }

    public static String getReflectedChar(String chr) {

        String[] ukwa = {"E", "J", "M", "Z", "A", "L", "Y", "X", "V", "B", "W", "F", "C", "R", "Q", "U", "O", "N", "T", "S", "P", "I", "K", "H", "G", "D"};
        Integer indexChar = getIndex(chr);

        String refChar = ukwa[(indexChar)];
        return refChar;
    }

    public static String plugBoard(String chr) {
        Map<String, String> plugs = new HashMap<>();
        plugs.put("A", "N");
        plugs.put("C", "K");
        plugs.put("E", "B");
        plugs.put("H", "N");
        plugs.put("V", "R");

        boolean resultKey = plugs.containsKey(chr);
        boolean resultVal = plugs.containsValue(chr);
        if (resultKey) {
            chr = plugs.get(chr);
        } else if (resultVal) {

            for (Map.Entry<String, String> entry : plugs.entrySet()) {
                if (entry.getValue().equals(chr)) {
                    chr = entry.getKey();
                }
            }
        }
        return chr;
    }

    public static Integer getIndex(String chr) {
        char x = chr.toUpperCase().charAt(0);
        int y = (int) (x);

        return (y-65);
    }

}
