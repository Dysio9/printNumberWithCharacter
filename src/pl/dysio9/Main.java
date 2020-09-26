package pl.dysio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public Main(int num, char ch) {
        printNumber(num, ch);
    }

    public String createFirstLine(char ch) {
        String result = "";

        for (int i = 0; i < 38; i++) {
            result += String.valueOf(ch);
        }
        result += "\n";
        return result;
    }

    public String createSecondLine(char ch) {
        String result = String.valueOf(ch);

        for (int i = 0; i < 36; i++) {
            result += " ";
        }
        result += String.valueOf(ch);
        result +="\n";
        return result;
    }

    public int getNthDigit(int number, int base, int whichDigit) {
        return (int) ((number / Math.pow(base, whichDigit- 1)) % base);
    }

    public String createNumberLines (int num, char ch) {
       String result = "";

        Map<Integer, String> numberCharsMap = new HashMap<>();
        {
        numberCharsMap.put(1, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(2, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(3, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(4, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(5, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(6, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(11, "  " + ch + ch + "  ");
        numberCharsMap.put(12, " " + ch + ch + ch + "  ");
        numberCharsMap.put(13, "" + ch + " " + ch + ch + "  ");
        numberCharsMap.put(14, "  " + ch + ch + "  ");
        numberCharsMap.put(15, "  " + ch + ch + "  ");
        numberCharsMap.put(16, "" + ch + ch + ch + ch + ch + ch);
        numberCharsMap.put(21, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(22, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(23, "   " + ch + ch + " ");
        numberCharsMap.put(24, "  " + ch + ch + "  ");
        numberCharsMap.put(25, " " + ch + ch + "   ");
        numberCharsMap.put(26, "" + ch + ch + ch + ch + ch + ch);
        numberCharsMap.put(31, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(32, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(33, "   " + ch + ch + " ");
        numberCharsMap.put(34, "   " + ch + ch + " ");
        numberCharsMap.put(35, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(36, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(41, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(42, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(43, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(44, " " + ch + ch + ch + ch + ch);
        numberCharsMap.put(45, "    " + ch + ch);
        numberCharsMap.put(46, "    " + ch + ch);
        numberCharsMap.put(51, "" + ch + ch + ch + ch + ch + ch);
        numberCharsMap.put(52, "" + ch + ch + "    ");
        numberCharsMap.put(53, "" + ch + ch + ch + ch + ch + " ");
        numberCharsMap.put(54, "    " + ch + ch);
        numberCharsMap.put(55, "    " + ch + ch);
        numberCharsMap.put(56, "" + ch + ch + ch + ch + ch + " ");
        numberCharsMap.put(61, "   " + ch + ch + " ");
        numberCharsMap.put(62, "  " + ch + ch + "  ");
        numberCharsMap.put(63, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(64, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(65, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(66, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(71, "" + ch + ch + ch + ch + ch + ch);
        numberCharsMap.put(72, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(73, "   " + ch + ch + " ");
        numberCharsMap.put(74, "  " + ch + ch + "  ");
        numberCharsMap.put(75, " " + ch + ch + "   ");
        numberCharsMap.put(76, " " + ch + ch + "   ");
        numberCharsMap.put(81, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(82, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(83, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(84, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(85, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(86, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(91, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(92, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(93, "" + ch + ch + "  " + ch + ch);
        numberCharsMap.put(94, " " + ch + ch + ch + ch + " ");
        numberCharsMap.put(95, "  " + ch + ch + "  ");
        numberCharsMap.put(96, " " + ch + ch + "   ");}


        for (int i = 1; i < 7; i++) {
            //System.out.print(ch + " ");
            result += String.valueOf(ch);
            result += " ";
            for (int j = 5; j > 0; j--) {
                //System.out.print(numberCharsMap.get(getNthDigit(num, 10, j)*10 + i) + " ");
                result += String.valueOf(numberCharsMap.get(getNthDigit(num, 10, j)*10 + i) + " ");
            }
            //System.out.println(ch);
            result += String.valueOf(ch);
            result += "\n";
        }

        return result;
    }

    public void printNumber(int num, char ch) {
        String result = "";

    System.out.print(createFirstLine(ch));
    System.out.print(createSecondLine(ch));
    System.out.print(createNumberLines(num, ch));
    System.out.print(createSecondLine(ch));
    System.out.print(createFirstLine(ch));
    }

    public static void main(String[] args) {
        System.out.println("The number should have exactly 5 digits. The number should be: 0 <= number <= 99999.");
        System.out.println("Type the number: ");

        Scanner input = new Scanner(System.in);

        new Main(input.nextInt(), '#');
    }
}
