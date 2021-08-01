/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class cat extends feline {
    @Override
    public void setvalue(){
        picture = "cat";
        food = "ikan, Daging";
        hunger = 50;
        lokasi = new int[]{500,450};
        bound = 23;
        
        System.out.println("Nama hewan : "+picture +"\nFamili :feline" +"\nMakanan : "+food +"\nTingkat Kelaparan"
        +hunger +"\nKoordinat lokasi : "+Arrays.toString(lokasi)+"\nLuas Wilayah : " +bound +"n2");
    }
    @Override
    public void makenoise(){
        System.out.println("suara "+picture +" meow meow meow");
    }
    @Override
    public void eat(){
        System.out.println("suara makan "+picture+" nyam nyam nyam");
    }
}
