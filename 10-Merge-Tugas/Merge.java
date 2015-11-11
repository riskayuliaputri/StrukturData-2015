import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 

public class Merge {
    
    /**
     * Membaca suatu berkas dan menampilkan isinya.
     *
     * Parameter:
     *   namaBerkas = Nama berkas yang akan dibaca
     */
    public void merge(String file1, String file2, String file3, String sasaran) throws IOException {
        FileInputStream file_1 = null;
        FileInputStream file_2 = null;
        FileInputStream file_3 = null;
        FileOutputStream keluaran= null;
        // Deklarasi variabel
        try {
            // Object stream untuk masukkan
            file_1 = new FileInputStream(file1);
            file_2 = new FileInputStream(file2);
            file_3 = new FileInputStream(file3);
            keluaran = new FileOutputStream (sasaran);

            // Coba baca  dari stream
            int karakter = file_1.read();

            // Selama masih ada data yang masih bisa dibaca
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write (karakter);
                // Coba baca lagi dari stream
                karakter = file_1.read();

            }
            
            karakter = file_2.read();
            
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write (karakter);
                // Coba baca lagi dari stream
                karakter = file_2.read();

            }
            
            karakter = file_3.read();
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write (karakter);
                // Coba baca lagi dari stream
                karakter = file_3.read();

            }
            keluaran.flush();
        }

        catch (IOException kesalahan){
            System.out.printf ("terjadi kesalahan: %s", kesalahan);
        }
        finally { // salah atau gaknya pasti dijalankan
            // Tutup stream masukan
            if (file_1 != null)
                file_1.close();
                
            if (file_2 != null)
                file_2.close();
                
            if (file_3 != null)
                file_3.close();

            if (keluaran != null)
                keluaran.close();

        }
    }
}

    

