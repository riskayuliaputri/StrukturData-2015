import java.util.Scanner;
import java.util.ArrayList;

public class Pohonku {


   public static void main(String[] args) {
        int input;
        ArrayList<Integer> UV = new ArrayList <>();      // arraylist hrg
        ArrayList<Integer> Nitrogen = new ArrayList <>();       // arraylist parameter atas
        ArrayList<Integer> Suhu = new ArrayList <>();       // arraylist parameter bawah
        Scanner uv= new Scanner (System.in);
        Scanner n = new Scanner (System.in);
        Scanner s = new Scanner (System.in);     
            
           
            System.out.print("Masukkan nilai UV\t: ");
            input= uv.nextInt();
           
            System.out.print("Masukkan nilai Nitrogen\t: ");
            input= n.nextInt();
           
            System.out.print("Masukkan nilai Suhu\t: ");
            input= s.nextInt();
        
       
   }
}
