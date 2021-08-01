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
public class lion extends feline{
    @Override
    public void setvalue(){
        picture = "Lion";
        food = "Daging";
        hunger = 100;
        lokasi = new int[] {3,4};
        bound = 2323.032;
        
        System.out.println("Nama Hewan : "+picture +"\nFamili :feline"+"\nMakanan : "+food+"\nTingkat Kelaparan"
        +hunger+"\nKoordinat lokasi : "+Arrays.toString(lokasi)+"\nLuas Wilayah : "+bound+"m2");
    }
    @Override
    public void makenoise(){
        System.out.println("suara "+picture+" : GRRRRRRRR");
    }
    @Override
    public void eat(){
        System.out.println("suara makan "+picture+" : krauk krauk");
    }
}
