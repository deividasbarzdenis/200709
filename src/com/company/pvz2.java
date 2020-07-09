package com.company;

public class pvz2 {
    public static void main(String[] args) {
        try{
            int z=5/0;
            String text = null;
            text.indexOf('A');
            //rasant catch reikia ziureti herarchija exceptions
        }catch (NullPointerException ex){
            System.out.println("No word");
        }catch (ArithmeticException ex){
            System.out.println("division by zero");
        }catch (Exception ex){
            System.out.println("out none foult");
        }finally {
            System.out.println("finally");
        }
    }
}
