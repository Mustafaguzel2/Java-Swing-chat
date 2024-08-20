package aoopproje;

import java.util.List;
import java.util.Vector;

public class Grup {
    private String isim;
    private String tür;
    public static Vector<String> tümGruplar = new Vector<>();

    public Grup() {
    }

    public Grup(String isim, String tür) {
        this.isim = isim;
        this.tür = tür;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public static List<String> getTümGruplar() {
        return tümGruplar;
    }

    public static void setTümGruplar(Vector<String> tümGruplar) {
        Grup.tümGruplar = tümGruplar;
    }
}
