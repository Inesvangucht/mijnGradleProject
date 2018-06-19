package Breuken;

import static java.lang.Math.*;

public class Breuk {


    private int teller;
    private int noemer;




    /**
     * Calculates the "greatest common factor" (GCF) or "greatest common divisor" (GCD) of two integers (Z).
     * @param teller First integer.
     * @param noemer Second integer.
     * @return The greatest common factor of the two specified integers.
     */

    public Breuk (int teller, int noemer) {
        this.teller = teller;

        if (noemer == 0) {
            throw new IllegalArgumentException("Noemer mag niet 0 zijn!");
        }
        this.noemer = noemer;

    }

    public int getTeller() {return this.teller;}
    public int getNoemer() {return this.noemer;}




    public static int grootstGemeneDeler(int teller, int noemer) {
        if (teller == 0 || noemer == 0) {
            return 1;
        }

        teller = abs(teller);
        noemer = abs(noemer);
        if(teller < noemer) {
            return grootstGemeneDeler(noemer, teller);
        }

        int delta = teller % noemer;
        if(delta == 0) {
            return noemer;
        } else {
            return grootstGemeneDeler(noemer, delta);
        }
    }

    public Breuk vereenvoudigBreuk () {
        int grootsteDeler = grootstGemeneDeler(this.teller, this.noemer);
        int nieuweTeller = this.teller / grootsteDeler;
        int nieuweNoemer = this.noemer / grootsteDeler;
        return new Breuk (nieuweTeller, nieuweNoemer);
    }
    /**
     * a/b * c/d = ac/bd
     * @return
     */
    public Breuk maal (Breuk that) {
        int nieuweTeller = this.teller * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;

        Breuk uitkomst = new Breuk(nieuweTeller, nieuweNoemer);
        uitkomst.vereenvoudigBreuk();
        return uitkomst;
    }

    /**
     * a/b / c/d = a/b * c/d
     * @return
     */

//    public Breuk deel () {
//
//        uitkomst.vereenvoudigBreuk();
//        return uitkomst;
//    }

    /**
     * a/b + c/d = ad + bc / bd
     *
     * a   c   ad + bc
     * - + - = -------
     * b   d     bd
     *
     */

//    public plus () {
//
//        uitkomst.vereenvoudigBreuk();
//        return uitkomst;
//
//    }

    public Breuk omkering() {
        int nieuweTeller = this.noemer;
        int nieuweNoemer = this.teller;
        return new Breuk(nieuweTeller,nieuweNoemer);
    }





}
