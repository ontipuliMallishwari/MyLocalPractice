package org.java.classTest;

public class Food {
    public String taste = "sweet";
    public int timeToCook = 300;
    public String smell = "sweet smell";

    public Food(){
        System.out.println("myconstructor");
    }
    public static void main(String[] args) {

        prepareKova();

        prepareLaddu();
        preparePulihora();
    }

    static void prepareKova() {
        Food kova = new Food();
        System.out.println(kova.taste);
        System.out.println(kova.timeToCook);
        System.out.println(kova.smell);
    }

    static void prepareLaddu() {
        Food laddu = new Food();
        laddu.timeToCook = 10000;
        System.out.println(laddu.timeToCook);


    }

    static void preparePulihora() {
        Food pulihora = new Food();
        pulihora.taste = "sour";
        pulihora.smell = "spicy";
        System.out.println(pulihora.smell + " " + pulihora.taste + " " + pulihora.timeToCook);
    }

}

