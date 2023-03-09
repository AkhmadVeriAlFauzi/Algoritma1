public class Bioskop {
    private String Bioskop;
    private String setID;

    public String getBioskop() {
        return Bioskop;
    }

    public void setBioskop(String Bioskop) {
        Bioskop = Bioskop;
    }

    public String getsetID() {
        return setID;
    }

    public void setsetID(String setID) {
        this.setID = setID;
    }

    public String getSetNAMABIOSKOP() {
        return setNAMABIOSKOP;
    }

    public void setsetNAMABIOSKOP(String setNAMABIOSKOP) {
        this.setNAMABIOSKOP = setNAMABIOSKOP;
    }

    private String setNAMABIOSKOP;

    public Bioskop(String Bioskop, String setID, String setNAMABIOSKOP) {
        Bioskop = Bioskop;
        this.setID = setID;
        this.setNAMABIOSKOP = setNAMABIOSKOP;
    }
}
