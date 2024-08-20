/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aoopproje;

/**
 *
 * @author uzeyi
 */
public class Singleton {
    private static Singleton instance;
    private User giris_yapan_kullanici;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * @return the giris_yapan_kullanici
     */
    public User getGiris_yapan_kullanici() {
        return giris_yapan_kullanici;
    }

    /**
     * @param giris_yapan_kullanici the giris_yapan_kullanici to set
     */
    public void setGiris_yapan_kullanici(User giris_yapan_kullanici) {
        this.giris_yapan_kullanici = giris_yapan_kullanici;
    }
}

