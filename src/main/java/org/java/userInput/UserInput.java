package org.java.userInput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Integer");
        Integer intData=scanner.nextInt();
        System.out.println("Input long");
        Long longData= scanner.nextLong();
        System.out.println("Input float");
        Float floatData= scanner.nextFloat();
        System.out.println("Input double");
        Double doubleData= scanner.nextDouble();
        System.out.println("Input boolean");
        Boolean booleanFlag= scanner.nextBoolean();
        System.out.println("Input string");
        String stringData = scanner.next();
        System.out.println("Input char");
        Character charData= scanner.next().charAt(0);
        System.out.println("Input byte");
        Byte byteData= scanner.nextByte();

        System.out.printf(
                "integer %d\nlong %d\nfloat %.2f\ndouble %.2f\nboolean %b\nstring %s\ncharacter %c\nbyte data %d\n",
                intData, longData, floatData, doubleData, booleanFlag, stringData, charData, byteData
        );
    }
}
