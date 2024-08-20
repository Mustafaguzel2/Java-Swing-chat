
package aoopproje;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

public class User implements Serializable{
    private static final long serialVersionUID = 1L; 
    private String kullanici_adi;
    private String parola;
    private List<String> arkadaslar;
    private List<String> gruplar;
    private boolean evlilik;
    private String isDurumu;
    /*mvc model view controller*/
    

    public User(String kullanici_adi, String parola, boolean EvliDurumu, String Is) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.arkadaslar = new Vector<String>();
        this.gruplar = new Vector<String>();
        this.evlilik = EvliDurumu;
        // İsdurumu için varsayılan değeri atama
        this.isDurumu = (Is != null && !Is.isEmpty()) ? Is : "Bilinmiyor";
    }

    public User(String kullanici_adi, String parola, List<String> arkadaslar, List<String> gruplar, boolean evlilik, String isDurumu) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.arkadaslar = arkadaslar;
        this.gruplar = gruplar;
        this.evlilik = evlilik;
        this.isDurumu = isDurumu;
    }
    public User() {
    }
    

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public List<String> getArkadaslar() {
        return arkadaslar;
    }

    public void setArkadaslar(List<String> arkadaslar) {
        this.arkadaslar = arkadaslar;
    }

    public List<String> getGruplar() {
        return gruplar;
    }

    public void setGruplar(List<String> gruplar) {
        this.gruplar = gruplar;
    }

   

    // Arkadaş ekleme metodu
    public void arkadasEkle(User arkadas) {
        if (!arkadaslar.contains(arkadas)) {
            arkadaslar.add(arkadas.getKullanici_adi());
        }
    }

    // Gruba katılma metodu
    public void grubaKatıl(String grup) {
        if (!gruplar.contains(grup)) {
            gruplar.add(grup);
        }
    }

    public String getUsername() {
        return kullanici_adi;
    }
    public boolean isEvlilik() {
        return evlilik;
    }

    public void setEvlilik(boolean evlilik) {
        this.evlilik = evlilik;
    }

    public String getIsDurumu() {
        return isDurumu;
    }

    public void setIsDurumu(String isDurumu) {
        this.isDurumu = isDurumu;
    }
}
