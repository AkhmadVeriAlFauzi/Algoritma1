import java.util.ArrayList;

public class Studio {
    private String IDSTUDIO;
    private String NAMASTUDIO;
    private int KAPASITAS;
    private ArrayList<Film>FILMSTUDIO;

    public Studio(String IDStudio, String NAMASTUDIO, int KAPASITAS, ArrayList<Film> FILMSTUDIO) {
        this.IDSTUDIO = IDSTUDIO;
        this.NAMASTUDIO = NAMASTUDIO;
        this.KAPASITAS = KAPASITAS;
        this.FILMSTUDIO = FILMSTUDIO;
    }
    public Studio(){}

    public String getIDSTUDIO() {
        return IDSTUDIO;
    }

    public void setIDSTUDIO(String IDSTUDIO) {
        this.IDSTUDIO = IDSTUDIO;
    }

    public String getNAMASTUDIO() {
        return NAMASTUDIO;
    }

    public void setNAMASTUDIO(String NAMASTUDIO) {
        this.NAMASTUDIO = NAMASTUDIO;
    }

    public int getKAPASITAS() {
        return KAPASITAS;
    }

    public void setKAPASITAS(int KAPASITAS) {
        this.KAPASITAS = KAPASITAS;
    }

    public ArrayList<Film> getFILMSTUDIO() {
        return FILMSTUDIO;
    }

    public void setFILMSTUDIO(ArrayList<Film> FILMSTUDIO) {
        this.FILMSTUDIO = FILMSTUDIO;
    }
}
