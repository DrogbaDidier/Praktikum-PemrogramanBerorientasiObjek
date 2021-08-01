/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.awt.*;

/**
 *
 * @author kevin
 */
public abstract class animal {

    Image gambar;
    String picture;
    String food;
    int hunger;
    int[] lokasi;
    double bound;

    public abstract void setvalue();

    public abstract void makenoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("Rutinitas tidur : tidur seperti makhluk hidup pada umumnya");
    }
    public abstract void roam();
}
