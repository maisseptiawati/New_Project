package polymorphism;

public class Burung extends Binatang {

    @Override
    public void melihat() {
       System.out.println("Burung melihat"); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void terbang() {
        System.out.println("Burung terbang"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mendengar() {
        System.out.println("Burung mendengar"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bernafas() {
        System.out.println("Burung bernafas"); //To change body of generated methods, choose Tools | Templates.
    }
    
   
 }
