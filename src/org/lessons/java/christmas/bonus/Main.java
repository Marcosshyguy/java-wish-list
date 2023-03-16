package org.lessons.java.christmas.bonus;

import org.lessons.java.christmas.ChristmasLetter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishList = new ArrayList<>();

        System.out.print("My name is  ");
        String name = scan.nextLine();

        System.out.print("I live in ");
        String address = scan.nextLine();


        boolean stop = false;
        while(!stop){
            System.out.print("What's your wish? ");
            String wish = scan.nextLine();
            wishList.add(wish);
            System.out.println("Stop Y/N");
            stop = scan.nextLine().toUpperCase().equalsIgnoreCase("Y");
        }
        scan.close();
        Collections.sort(wishList);

        System.out.println(wishCounter(wishList));

        org.lessons.java.christmas.ChristmasLetter letter = new ChristmasLetter(name, address);
        letter.getWishList().addAll(wishList);
        System.out.println(letter.toString());

        try {
            letter.send();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static Map<String,Integer> wishCounter(List<String> desideri){
        Map<String,Integer> counterMap = new HashMap<>();
//            metodo che itera la lista passata come parametro
        for (String desiderio : desideri) {

            Integer count = counterMap.get(desiderio);
            if (count == null) {
                count = 0;
            }
            counterMap.put(desiderio, count + 1);
        }

        return counterMap;
    }


}
