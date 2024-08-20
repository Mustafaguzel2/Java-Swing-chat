package aoopproje;

public class GrupFactory {

    // Method to create a new group
    public static Grup createGrup(String isim, String tür) {
        Grup newGrup = new Grup(isim, tür);
        Grup.tümGruplar.add(isim);
        return newGrup;
    }
}
