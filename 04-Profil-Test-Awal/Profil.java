
public class Profil
{
    private String nama="Riska Yulia Putri";
    private String nim="1408107010036";
    
    public Profil (){
    
    }
    
    public Profil (String nama, String nim){
        this.nama=nama;
        this.nim= nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
}
