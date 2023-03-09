import java.util.ArrayList;
import java.util.Scanner;

public class AdminBioskop {
    public static void main(String[] args) {
        Bioskop CGV = new Bioskop();
        CGV.setID("001");
        CGV.setNAMABIOSKOP("Bioskop CGV");
        //set studios at that Bioskop CGV
        int jumlahStudio = 2;
        ArrayList<Studio> studios = new ArrayList<>();
        for(int index=0; index<jumlahStudio;index++){
            Scanner sc = new Scanner(System.in);
            Studio studio = new Studio();
            System.out.print("ID STUDIO : ");//STU001
            studio.setIDSTUDIO(sc.nextLine());
            System.out.print("NAMA STUDIO : ");
            studio.setNAMASTUDIO(sc.nextLine());//STUDIO 1
            System.out.print("KAPASITAS : "); // 100
            studio.setKAPASITAS(sc.nextInt());
            System.out.println("\n Masukkan Data Film di "
                    + studio.getNAMASTUDIO());
            ArrayList<Film> films = new ArrayList<>();
            for(int index1=0; index1<3;index++){
                Film film = new Film();
                Scanner sc1 = new Scanner(System.in);
                System.out.print("ID FILM : ");
                film.setID(sc.nextLine()); // AV001
                System.out.print("NAMA FILM : ");
                film.setNAMAFILM(sc.nextLine()); //AVATAR
                System.out.print("KATEGORI FILM : ");
                film.setKATEGORI(sc.nextLine()); //ACTION
                System.out.print("HARGA FILM : ");
                film.setHARGA(sc.nextLine()); //40000
                films.add(film);
            }
            studio.setFILMSTUDIO(films);
            studios.add(studio);
        }

        //Penjualan Tiket
        Scanner scpntn = new Scanner(System.in);
        System.out.println("Pilih Studio : ");
        switch (scpntn.nextLine()){
            case "0":

                break;
            case "1":
                break;
            default:
                break;
        }

    }
}
