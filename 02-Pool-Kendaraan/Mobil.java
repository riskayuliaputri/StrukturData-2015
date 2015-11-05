//import java.util.tipe;
public class Mobil implements Kendaraan
{
    // instance variables - replace the example below with your own
    private String plat;
    String tipe;

    public Mobil(String plat)
    {
        // initialise instance variables
        this.plat=plat;
    }
    
    public String plat(){
        return plat;
    }
    
    public String tipe(){
    
        tipe = "Mobil";
        return tipe;
    }
}

    