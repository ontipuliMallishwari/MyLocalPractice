package org.java.operators;

public class Operators {

    public static void main(String[] args) {

        arthematicOperators();
        assignmentOperators();
        relationalOperators();
    }


    static void arthematicOperators() {
        int y = 21;
        int z = 4;
        System.out.println(y + z);
        System.out.println(y - z);
        System.out.println(y * z);
        System.out.println(y / z);
        System.out.println(y % z);

    }

    static void assignmentOperators() {
        int y = 40;
        int a = y;
        System.out.println(y);
        System.out.println(a);
    }

    static void relationalOperators(){
         int a = 20;
         int b= 30;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);


    }
}

