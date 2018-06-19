package Breuken;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BreukTest {

    /**
     *
     */

    @Test
    public void deNoemerIsNietNul() {
        Breuk a = new Breuk (1,2);
//        Assert.assertTrue(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deNoemerMagNietNulZijn() {
        Breuk a = new Breuk (1,0);
    }



    @Test
    public void breukVermenigvuldigenVoorVereenvoudiging() {
        Breuk a = new Breuk (3, 8);
        Breuk b = new Breuk (4, 9);

        Breuk c = a.maal(b);

        assertEquals(c.getTeller(), 12);
        assertEquals(c.getNoemer(), 72);

    }

    @Test
    public void deBreukVereenvoudigen() {
        Breuk a = new Breuk (2,4);

        Breuk b = a.vereenvoudigBreuk();

        assertEquals(b.getTeller(),1);
        assertEquals(b.getNoemer(),2);
    }


}
