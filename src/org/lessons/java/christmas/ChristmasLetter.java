package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {
//    ATTRIBUTES
    private String name;
    private String address;
    private List<String> wishList;

    boolean[] goodOrEvil = new boolean[]{false,true};
    boolean behavior;
    Random randomizer = new Random();
    public ChristmasLetter(String name, String address, List<String> wishList) {
        this.name = name;
        this.address = address;
        this.wishList = wishList;
        int randomNumber = randomizer.nextInt();
        behavior = goodOrEvil[randomNumber];
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
    public String send(){
        if (wishList.size() >= 5){
            throw new RuntimeException("La lista deve contenere menodi 5 desideri");
        }

        if (behavior){
            throw new RuntimeException("Ti sei comportato troppo male quest'anno");
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
