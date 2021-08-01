/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemlan.tugas;

/**
 *
 * @author USER
 */
public class Octogon extends GeometricObject implements Cloneable, Comparable<Octogon> {
  private double sisi;
  private String warna;
  
  public Octogon(double sisi,String warna) {
    this.sisi = sisi;
    this.warna = warna;
  }

  public double getSisi() {
    return sisi;
  }
  public String getWarna(){
      return warna;
  }
  public double getArea() {
    return (2 + 4 / Math.sqrt(2)) * sisi * sisi;
  }

  public double getPerimeter() {
    return 8 * sisi;
  }
  
  public void setSisi(double side) {
    this.sisi = sisi;
  }

  @Override
  public int compareTo(Octogon a) {
    if (getArea() > a.getArea()) {
      return 1;
    } else if (getArea() < a.getArea()) {
      return -1;
    }
    return 0;
  }
   @Override
  public Object clone() throws CloneNotSupportedException {
    return (Octogon)super.clone();
  }
}
