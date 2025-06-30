package org.java.classTest;

public class Animal {
    public String name = "indianPig";
    public int height = 10;
    public String place = " drainage";
    public String food = "garbage";
    public int weight = 10000;

//    Object

    public static void main(String[] args) {

        creatingPig();
        createElephant();
        createRabbit();


    }

    private static void creatingPig() {
        Animal pig = new Animal();
        System.out.println(pig.toString());


    }

    private static void createElephant() {
        Animal elephant = new Animal();
        elephant.height = 300;
        elephant.weight = 10000;
        elephant.name = "prashant";
        System.out.println(elephant.toString());
    }

    private static void createRabbit(){
        Animal rabbit= new Animal();
        rabbit.height= 2;
        rabbit.weight =100;
        rabbit.name= "milli";
        System.out.println(rabbit.toString());
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", place='" + place + '\'' +
                ", food='" + food + '\'' +
                ", weight=" + weight +
                '}';
    }
}
