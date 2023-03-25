import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //world();
    method(new int[]{18,19,22}, "Aidai", "Dilnaz", "Dasha");
    String word = "  I like Java!!!";
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.endsWith("!!!"));
        System.out.println(word.startsWith("I like"));
        System.out.println(word.contains("Java"));
        System.out.println(word.replace('a','o'));
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.length());
        String a = word.substring(8,13);
        System.out.println(a.toUpperCase(  ));
        System.out.println(word.trim());





    }


   /* static void world(){
        Scanner scanner= new Scanner(System.in);
        String world= scanner.nextLine();
        System.out.println(world.toUpperCase());
        System.out.println(world.trim());
        if (world.contains("a")){
            System.out.println(world.substring(world.indexOf("a")));
        }else{
            System.out.println("jok");
        }
    }*/


    static void method(int [] a, String ... varargs){
        for (int i = 0; i < a.length; i++) {
            System.out.println(varargs[i]+"  " +a[i]+"let");
        }
    }


}