import java.util.Arrays;

public class tugasArray2 {
    public static String RemoveHurufVocal(String Kalimat){
        String[] KALIMAT = Kalimat.split(" ");
        int[] myKalimat = new int[KALIMAT.length];
        for (int index = 0; index < KALIMAT.length; index++){
            myKalimat[index] = Character.valueOf(KALIMAT[index]);
        }
        Arrays.sort(myKalimat);

        return Kalimat.replaceAll("(?i)[aiueo]", " ");
    }

    public static void main(String[] args) {
        System.out.println(RemoveHurufVocal("Kemarin Saya Pergi Ke Pasar"));

    }
}
