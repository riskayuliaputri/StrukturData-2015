public class Pool
{
    private Kendaraan[] kendaraan;
    int jumlah;
    Kendaraan[] daftarKendaraan;
    
    public Pool(Kendaraan[] kendaraan)
    {
        if (kendaraan==null)
        kendaraan = new Kendaraan[0];
        this.kendaraan = kendaraan;
    }
    
    public int jumlah(){
        return kendaraan.length;
    }
    
    public Kendaraan[] daftarKendaraan(){
        this.daftarKendaraan= daftarKendaraan;
        return kendaraan;
    }
}

    