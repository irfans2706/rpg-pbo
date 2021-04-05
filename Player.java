import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.format;

public class Player extends Hero{
    //item defulat yang dimiliki player dari brang child itemBarang berupa cincin emas
    private ItemBarang objCincin = new ItemBarang("Cincin Emas");
    private RuanganDenganNPC ruanganAktif;  //ruangan tempat player saat ini berada

    public void setObjGameInfo(GameInfo objGameInfo) {
        super.setObjGameInfo(objGameInfo);
        objCincin.setObjGameInfo(objGameInfo);
    }
    public Player() {
        //memasukan item kunci ke attribut parentnya
        ArrayList<Item>arrItem = new ArrayList<>();
        objCincin.setDeskripsi("Cincin emas bertuliskan suatu kalimat..");
        arrItem.add(objCincin);
        super.setArrItem(arrItem);
    }
    public void setRuanganAktif(RuanganDenganNPC ruanganAktif) {
        this.ruanganAktif = ruanganAktif;
    }
    public Ruangan getRuanganAktif() {
        return ruanganAktif;
    }

}

// NIM  : 1901117
// Nama : Irfan Sholeh
// NIM  : 1901321
// Nama : Rival Swandy Irawan