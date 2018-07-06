import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import static jdk.nashorn.internal.objects.NativeString.charAt;
import static jdk.nashorn.internal.objects.NativeString.length;
import static sun.text.normalizer.UTF16.charAt;

public class DoubleChar {

    private String snack;
    private String bread1;
    private String spread;
    private String bread2;
    private String input;
    private int a1;
    private int b1;
    private int c1;

    public static void main(String[] args) {
        DoubleChar main = new DoubleChar();
        Scanner input = new Scanner(System.in);

        /* to run, remove '//'
        -------------------------------------------------------------------*/

        // main.Sandwich("","","");
        // main.endsly();
        main.evenlySpaced(2,4,6);
    }


   /* private static String twoChar;

    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.
    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    public void String

    doubleChar(String twoChar) {
        Scanner input = new Scanner(System.in);
        String[] a = getTwoChar().split("");
    }

    private String getTwoChar() {
        return twoChar;
    }

    public void setTwoChar(String twoChar) {
        DoubleChar.twoChar = twoChar;
    } */

    //
    // A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the
    // given string, or return the empty string "" if there are not two pieces
    // of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""
    // getSandwich("xxbreadhoneybreadyy") → "honey"

    public void setSnack(String sandwich) {
        this.snack = snack;
    }

    public void Sandwich(String bread1, String spread, String bread2) {
        Scanner input = new Scanner(System.in);
        this.bread1 = "bread";
        this.spread = "spread";
        this.bread2 = "bread";

        System.out.println("Enter either 'bread', 'bread bread', 'bread jam bread' or 'bread honey bread'");
        String sandwich = input.nextLine();

        if (sandwich.equals("bread")) {
            System.out.println("");
            Sandwich(bread1, spread, bread2);

        } else if (sandwich.equals("bread bread")) {
            System.out.println("");
            Sandwich(bread1, spread, bread2);

        } else if (sandwich.equals("bread jam bread")) {
            System.out.println("jam");
            Sandwich(bread1, spread, bread2);

        } else if (sandwich.equals("bread honey bread")) {
            System.out.println("honey");
            Sandwich(bread1, spread, bread2);

        } else {
            Sandwich(bread1, spread, bread2);
        }

        System.out.println(bread1 + spread + bread2);
    }

    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large.

    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a1, int b1, int c1) {

        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;

        int aResult = Math.incrementExact(a1)+1;
        int bResult = Math.incrementExact(b1)+1;
        int cResult = Math.incrementExact(c1)+1;

        if(aResult == bResult && bResult == cResult){
            System.out.println("true");
        } else if (aResult != bResult && bResult != cResult){
            System.out.println("false");
        }
        return false;
    }

    // Given a string and an int n, return a string made of the first and last n
    // chars from the string. The string length will be at least n.

    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String input, int a) {
        return "";
    }

    // Given a string, return true if it ends in "ly".

    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    // endsLy("l") → false

    public boolean endsly() {
        String result = "";

        Scanner lyCheck = new Scanner(System.in);
        System.out.println("Enter a word that ends with 'ly'");
        String ly = lyCheck.nextLine();

        System.out.println(result);

        String endLy = ly.substring(ly.length() - 2);

        if(endLy.equals("ly")){
            System.out.println(true);
            endsly();
        }

        System.out.println(false);
        endsly();
        return false;
    }

    // Given a string, return recursively a "cleaned" string where adjacent
    // chars that are the same have been reduced to a single char. So "yyzzza"
    // yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"

    public String stringClean(String input) {
        return "";
    }

    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are 0
    // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
    // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1
    // fibonacci(3) → 2
    // fibonacci(4) → 3
    // fibonacci(5) → 5
    // fibonacci(6) → 8
    // fibonacci(25) → 75025

    public int fibonacci(int input) {
        return -1;
    }

    // We have a number of bunnies and each bunny has two big floppy ears. We
    // want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).

    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4
    // bunnyEars(4) → 8
    // bunnyEars(16) → 32

    public int bunnyEars(int input) {
        return -1;
    }

    // Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.

    // superBlock("jeffbert") → 2
    // superBlock("abbCCCddBBBxx") → 3
    // superBlock("") → 0

    public int superBlock(String str) {
        return -1;

    }

    public String getBread1() {
        return bread1;
    }

    public void setBread1(String bread1) {
        this.bread1 = bread1;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getBread2() {
        return bread2;
    }

    public void setBread2(String bread2) {
        this.bread2 = bread2;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }
}