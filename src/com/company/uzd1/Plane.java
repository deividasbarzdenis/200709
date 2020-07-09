package com.company.uzd1;

import java.util.Random;

public class Plane extends  Exception {
    public void unfoldChassis() {
        try {
            vaziuokle();

            /*Random random = new Random();
            int number = random.nextInt(10);
            int i = 4 / number;
            System.out.println("Vaziuokle isskleista sekmingai");
            if (number == 5) {
                "skrendu".charAt(20);*/

        } catch (VaziuoklesIsskleidimoKlaida e){
            System.out.println("ERROR: nepavyko isskleisti vaziuokles "+ e.getPriezastis());
        }
        /*catch (ArithmeticException ex) {
            System.out.println("Vaziuokle neissiskleide");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Vaziuokle neissiskleide del kitu priezasciu");
        } catch (VaziuoklesIsskleidimoKlaida vaziuoklesIsskleidimoKlaida) {
            vaziuoklesIsskleidimoKlaida.printStackTrace();
        } finally {
            System.out.println("Lektuvas skrenda");
        }*/
    }

    public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random random = new Random();
        int number = random.nextInt(10);
        switch (number) {
            case 0:
                throw new VaziuoklesIsskleidimoKlaida("Nuleido rata");
            case 1:
                throw new VaziuoklesIsskleidimoKlaida("Nuluzo ratas");

            case 3:
                throw new VaziuoklesIsskleidimoKlaida("Neveikia vairas");
        }
    }
}
