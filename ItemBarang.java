import java.util.ArrayList;

public class ItemBarang extends Item {
    public ItemBarang(String nama) {
        super.setNama(nama);
    }

    @Override //penginisialisasi fungsi getAksi khusus untuk item child ItemBarang
    public ArrayList<String> getAksi() {
        //aksi dinamik tergantung ada di ruangan atau dipegang player/npc
        ArrayList<String> arrOut = new ArrayList<>();
        if (super.getObjRuangan()==null) {
            //ada di player, ada opsi buang
            arrOut.add("Deskripsi Item");
            arrOut.add("Buang item");
        } else {
            //ada di ruangan ada opsi ambil
            arrOut.add("Deskripsi Item");
            arrOut.add("Ambil item");
        }
        return(arrOut);
    }
}

// NIM  : 1901117
// Nama : Irfan Sholeh
// NIM  : 1901321
// Nama : Rival Swandy Irawan