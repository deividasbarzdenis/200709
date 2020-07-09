package com.company.pvz4;

public class Main {
    public static void main(String[] args) throws AccountException{
        Account account = new Account();
        try {
            account.withdraw(40);
            System.out.println("Money withdraw from account");
            account.withdraw(90);
            System.out.println("money withdrawn from account");
        }catch (AccountException e){
            System.out.println("Klaida, likutis: "+ e.getBalance()+ " eur");
        }

    }
}
