import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.format;

public class Player extends Hero{
    //item defulat yang dimiliki player
    private ItemBarang objCincin = new ItemBarang("Cincin Emas");
    private Ruangan ruanganAktif;  //ruangan tempat player saat ini berada

    public void setObjGameInfo(GameInfo objGameInfo) {
        super.setObjGameInfo(objGameInfo);
        objCincin.setObjGameInfo(objGameInfo);
    }
    public Player() {
        ArrayList<Item>arrItem = new ArrayList<>();
        objCincin.setDeskripsi("Cincin emas bertuliskan suatu kalimat..");
        arrItem.add(objCincin);
        super.setArrItem(arrItem);
    }
    public void setRuanganAktif(Ruangan ruanganAktif) {
        this.ruanganAktif = ruanganAktif;
    }
    public Ruangan getRuanganAktif() {
        return ruanganAktif;
    }

}
