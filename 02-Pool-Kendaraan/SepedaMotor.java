//import java.util.tipe;
public class SepedaMotor implements Kendaraan
{
    // instance variables - replace the example below with your own
    private String plat;
    String tipe;

    public SepedaMotor(String plat)
    {
        // initialise instance variables
        this.plat=plat;
    }
    
    public String plat(){
    
        return plat;
    }
    
    public String tipe(){
    
        tipe = "SepedaMotor";
        return tipe;
    }
}

    