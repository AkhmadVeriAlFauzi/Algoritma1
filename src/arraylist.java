import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        //Deklarasi arraylist
        ArrayList<String> Judul = new ArrayList<>();

        //memasukkan value kedalam arraylist
        Judul.add(0, "Harry Potter");
        Judul.add(1, "Wakanda");
        Judul.add(2,"Black Adam");

        //mengetahui total kapasitas suatu kendaraan
        System.out.println(Judul.size());

        //perusahaan mobil TOYOTA
        mobil veloz = new mobil (4,1500,"biru",7);

        //perusahaan mobil HONDA
        mobil civic = new mobil (5,1500,"ungu",9);

        //perusahaan mobil SUZUKI mau bikin mobil sebanyak 100
        mobil[] ertigaHybrid = new mobil[100];
        for(int index=0;index<ertigaHybrid.length;index++){
            mobil s = new mobil(4,1700,"kuning",8);
            ertigaHybrid[index]=s;
            System.out.println("mobil ertiga hybrid ke - "+index);
            System.out.println("roda : " +ertigaHybrid[index].JumlahRoda+" Mesin : "+
                    ertigaHybrid[index].KapasitasMesin+" warna: "+
                    ertigaHybrid[index].Warna+" kursi: "+
                    ertigaHybrid[index].JumlahJok+"\n");
        }
    }
}
