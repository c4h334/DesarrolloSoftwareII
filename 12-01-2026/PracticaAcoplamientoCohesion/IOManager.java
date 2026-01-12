package PracticaAcoplamientoCohesion;

import java.util.Scanner;

public class IOManager {
    private static Scanner sc = new Scanner(System.in);

    static String readString(){
        return String.valueOf(sc.nextLine());
    }

    static void write(Object var){
        System.out.println(var);
    }

}
