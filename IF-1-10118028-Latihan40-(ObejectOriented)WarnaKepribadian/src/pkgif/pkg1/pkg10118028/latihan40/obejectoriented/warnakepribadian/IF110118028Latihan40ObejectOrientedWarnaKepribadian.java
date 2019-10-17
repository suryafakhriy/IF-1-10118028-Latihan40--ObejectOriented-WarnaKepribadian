/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan40.obejectoriented.warnakepribadian;
import java.util.Scanner;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : (Obeject Oriented) Warna Kepribadian

 */
public class IF110118028Latihan40ObejectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String warnaDiri;
        String nama;
        
        Scanner scanner = new Scanner(System.in);
        warnakepribadian warnakepribadian = new warnakepribadian();

        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA Favoritmu"+warnakepribadian.RED+warnakepribadian.GREEN+warnakepribadian.YELLOW+warnakepribadian.CYAN+warnakepribadian.PURPLE+warnakepribadian.BLUE+warnakepribadian.RESET);
        System.out.println(warnakepribadian.BGRED +warnakepribadian.WHITE+"       MERAH       ");
        System.out.println(warnakepribadian.BGGREEN+warnakepribadian.WHITE+"       HIJAU       ");
        System.out.println(warnakepribadian.BGYELLOW+warnakepribadian.WHITE+"       KUNING      ");
        System.out.println(warnakepribadian.BGBLUE+warnakepribadian.WHITE+"       BIRU        ");
        System.out.println(warnakepribadian.BGMAGENTA+warnakepribadian.WHITE+"       UNGU        ");
        
        System.out.print(warnakepribadian.RESET+"\nPILIH WARNA FAVORITMU\t: ");
        warnaDiri = scanner.nextLine();
        
        System.out.print("NAMA KAMU\t\t: ");
        nama = scanner.nextLine();
        
        System.out.printf("\n===HASIL TEST KEPRIBADIAN %s===%n",nama.toUpperCase());
        warnakepribadian.warnaPribadi(warnaDiri);
    }
    
}
