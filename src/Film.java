public class Film {
    private String setID;
    private String NAMAFILM;
    private String KATEGORI;
    private String setHARGA;

    public String getsetID() {
        return setID;
    }

    public void setSetID(String setID) {
        setID = setID;
    }

    public String getNAMAFILM() {
        return NAMAFILM;
    }

    public void setNAMAFILM(String NAMAFILM) {
        this.NAMAFILM = NAMAFILM;
    }

    public String getKATEGORI() {
        return KATEGORI;
    }

    public void setKATEGORI(String KATEGORI) {
        this.KATEGORI = KATEGORI;
    }

    public int getHARGA() {
        return setHARGA;
    }

    public void setHARGA(String setHARGA) {
        this.setHARGA = setHARGA;
    }

    public String getFILMSTUDIO() {
        return FILMSTUDIO;
    }

    public void setFILMSTUDIO(String FILMSTUDIO) {
        this.FILMSTUDIO = FILMSTUDIO;
    }

    private String FILMSTUDIO;

    public Film(String setID, String NAMAFILM, String KATEGORI, String setHARGA, String FILMSTUDIO) {
        setID = setID;
        this.NAMAFILM = NAMAFILM;
        this.KATEGORI = KATEGORI;
        this.setHARGA = setHARGA;
        this.FILMSTUDIO = FILMSTUDIO;
    }
}
