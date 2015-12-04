import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner (System.in);
            ChatTugas tgs = new ChatTugas();
            
            System.out.print("Pesan: ");
            String masuk = in.next();
            tgs.chat(masuk);
            
            
        }
        catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
