import java.util.ArrayList;
import java.util.Scanner;

public class RuanganDenganNPC extends Ruangan{
    private NPC objNPC;
    private ItemPintu objPintu;
    private ItemBarang  objRoti;
    private Scanner sc = new Scanner(System.in);

    public RuanganDenganNPC() {
        objPintu = new ItemPintu("Pintu");
        objNPC = new NPC();

        objRoti  = new ItemBarang("Roti");
        objRoti.setDeskripsi("Roti rasa coklat dalam bungkusan plastik");
        objRoti.setObjRuangan(this);

        //tambah item ke array item pada parent Hero
        ArrayList<Item> arrItem = new ArrayList<>();
        arrItem.add(objRoti);
        arrItem.add(objPintu);
        super.setArrItem(arrItem);
    }

    @Override //override fungsu setObjGameInfo karena ada keperluan yang berbeda untuk ruanganberNPC
    public void setObjGameInfo(GameInfo objGameInfo) {
        super.setObjGameInfo(objGameInfo);
        objPintu.setObjGameInfo(objGameInfo);
        objNPC.setObjGameInfo(objGameInfo);
        objNPC.setNama("penjaga pintu ini");
        for (Item objItem:super.getArrItem()) {
            objItem.setObjGameInfo(objGameInfo);
        }
    }

    @Override //override aksi dari ruangan bernpc berbeda yang mana ada tambahan dari pertanyaan untuk npcnya itu sendiri
    public void pilihanAksi() {

        System.out.println("==== Pilihan Aksi pada Ruangan ===");
        int urutPil = 0;  //item, pintu
        int subPil;   //aksinya

        //aksi2 item
        System.out.println("Item di ruangan");
        for (Item objItem:super.getArrItem()) {
            urutPil++;
            subPil = 0;   //sistem penomorannya 11  12  13 dst
            System.out.println(objItem.getNama());
            //ambil pilihannya
            ArrayList <String> arrPil = objItem.getAksi();
            //print pilihan
            for (String strPil:arrPil) {
                subPil++;
                System.out.printf("%d%d. %s %n", urutPil, subPil, strPil);
            }
        }

        // aksi2 NPC
        urutPil++;
        subPil = 0;
        int pilNPC  = urutPil; //catat untuk pintu
        System.out.println("NPC");
        for (String strPil:objNPC.getAksi()) {
            subPil++;
            System.out.printf("%d%d. %s %n", urutPil, subPil, strPil);
        }

        System.out.print("Pilihan anda?");
        String strPil = sc.next();
        System.out.println("--");

        //split pilihan dan subpilihan

        int pil    =  Integer.parseInt(strPil.substring(0,1)); //ambil digit pertama, asumsikan jumlah tidak lebih dari 10
        subPil     =  Integer.parseInt(strPil.substring(1,2)); //ambil digit kedua, asumsikan jumlah tidak lebih dari 10

        //tdk perlu if spt ini kalau sudah menggunakan inheritance
        if (pil==pilNPC) {
            objNPC.prosesAksi(subPil);
        } else {
            //item
            Item objItemPilih = super.getArrItem().get(pil-1);
            objItemPilih.prosesAksi(subPil); //aksi item
        }

    }
}

// NIM  : 1901117
// Nama : Irfan Sholeh
// NIM  : 1901321
// Nama : Rival Swandy Irawan