package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {
//    ATTRIBUTES
    private String name;
    private String address;
    private List<String> wishList = new ArrayList<>();

//    boolean[] goodOrEvil = new boolean[]{false,true};
    boolean behavior;
    Random randomizer = new Random();
    public ChristmasLetter(String name, String address) {
        this.name = name;
        this.address = address;
        behavior = randomizer.nextBoolean();
    }
//    GETTER E SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

//    METHODS
    public String send() throws RuntimeException{
        if (wishList.size() > 5){
            throw new RuntimeException("The wish list must contain more at least 5 wishes");
        }
        if (!behavior){
            throw new RuntimeException("You behaved bad this year");
        }

        return toString();

    }

    @Override
    public String toString() {
        return "ChristmasLetter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", wishList=" + wishList +
                '}';
    }
}
