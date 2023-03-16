package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishList = new ArrayList<>();

        boolean stop = false;
        while(!stop){
            System.out.print("What's your wish? ");
            String wish = scan.nextLine();
            wishList.add(wish);
            System.out.println("Stop Y/N");
            stop = scan.nextLine().toUpperCase().equalsIgnoreCase("Y");
        }

        Collections.sort(wishList);
        System.out.println(wishList);


    }
}
