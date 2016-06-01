package bangundatar;

public class Persegi implements BangunDatar {
private final double sisi;

  // Definisi method
  // Konstruktor
  public Persegi (double s) {
    sisi = s;
  }

  // Selector
  public double getSisi() {
    return sisi;
  }

  
  // Definisi method dari kelas induk
  @Override
  public double Luas() {
    return (sisi*sisi);
  }

  @Override
  public double Keliling() {
    return (sisi*sisi*sisi*sisi);
  }

  @Override
  public String displayInfo() {
    return ( "Persegi"
           + "\no Sisi  : " + (float)getSisi()
           + "\no Luas     : " + (float)Luas()
           + "\no Keliling : " + (float)Keliling() );
  }
     
}
