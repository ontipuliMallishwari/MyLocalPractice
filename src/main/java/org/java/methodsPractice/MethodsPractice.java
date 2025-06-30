package org.java.methodsPractice;

public class MethodsPractice {


    public static void main(String[] args) {

        String dataValues = "hrtejrkf";
        int number = 5465;
        methodsTest(dataValues,number);

//        System.out.println("string" + (1 + dataValues));
//        int[] data = {1, 2};
//        main(data);
    }


    static  void  methodsTest(String data,int number){
        System.out.println("data is there:"+data);
        System.out.println("data is" +data +"there");
        System.out.printf(" %d data %s printed %s",number,data,"jfjhf");
    }

    public static void main(int[] args) {

        System.out.println("main int has reached"+args.length);
    }
}
