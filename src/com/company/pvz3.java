package com.company;

public class pvz3 {
    public static void main(String[] args) {
        try {
            int z=5/0;
            String text = null;
            text.indexOf('A');
        }catch (NumberFormatException | NullPointerException e){
            System.out.println("klaida");
        }
    }
}
