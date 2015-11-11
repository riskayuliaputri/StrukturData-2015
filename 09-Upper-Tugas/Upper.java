import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 

public class Upper {
    
       public void upper(String sumber, String sasaran) throws IOException {
        FileInputStream masukan = null;
        FileOutputStream keluaran= null;
        // Deklarasi variabel
        try {
            // Object stream untuk masukkan
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream (sasaran);

            // Coba baca  dari stream
            int karakter = masukan.read();

            // Selama masih ada data yang masih bisa dibaca
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                karakter = Character.toUpperCase(karakter);
                keluaran.write (karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();

            }
            keluaran.flush();
        }

        catch (IOException kesalahan){
            System.out.printf ("terjadi kesalahan: %s", kesalahan);
        }
        finally { // salah atau gaknya pasti dijalankan
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();

            if (keluaran != null)
                keluaran.close();

        }
    }
}

    

