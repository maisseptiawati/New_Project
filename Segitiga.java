package bangundatar;

public class Segitiga implements BangunDatar {
    // Deklarasi atribut
  private final double alas, tinggi;

  // Definisi method
  // Konstruktor
  public Segitiga(double a, double t) {
    alas = a;
    tinggi = t;
  }

  // Selector
  public double getAlas() {
    return alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  // Definisi method dari kelas induk
  @Override
  public double Luas() {
    return (alas*tinggi)/2;
  }

  @Override
  public double Keliling() {
    double d;
    d = (double)Math.sqrt((alas*alas)+(tinggi*tinggi));
    return (alas+tinggi+d);
  }
  
  @Override
  public String displayInfo() {
    return ( "Segitiga"
           + "\no Alas     : " + (float)getAlas()
           + "\no Tinggi   : " + (float)getTinggi()
           + "\no Luas     : " + (float)Luas()
           + "\no Keliling : " + (float)Keliling() );
  }
    
}
