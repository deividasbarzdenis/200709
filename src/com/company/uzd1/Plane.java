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
            System.out.println("OK: vaziuokle sekmingai isskleista");

        } catch (SvarbiKlaida e){
            System.out.println("ERROR: nepavyko isskleisti vaziuokles "+ e.getPriezastis()+" SVARBI");
        }catch (LaikinaKlaida e){
            System.out.println("ERROR: nepavyko isskleisti vaziuokles "+ e.getPriezastis()+" LAIKINA");
        }catch (VaziuoklesIsskleidimoKlaida e){
            System.out.println("ERROR: nepavyko isskleisti vaziuokles "+ e.getPriezastis()+" NEAISKI");
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
                throw new SvarbiKlaida("Nuleido rata");
            case 1:
                throw new SvarbiKlaida("Nuluzo ratas");

            case 3:
                throw new LaikinaKlaida("Neveikia vairas");
        }
    }
}
