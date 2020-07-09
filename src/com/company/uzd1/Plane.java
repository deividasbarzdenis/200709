package com.company.uzd1;

import java.util.Random;

public class Plane extends  Exception{
    public void unfoldChassis(){
        try {
            Random random = new Random();
            int number = random.nextInt(10);
            int i = 4 / number;
            System.out.println("Vaziuokle isskleista sekmingai");
            if (number == 5){
                "skrendu".charAt(20);
            }
        }catch (ArithmeticException ex){
            System.out.println("Vaziuokle neissiskleide");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Vaziuokle neissiskleide del kitu priezasciu");
        }finally {
            System.out.println("Lektuvas skrenda");
        }
    }
}
