import java.util.Scanner;

public class GameEngine {
    // user interface game
    Scanner sc = new Scanner(System.in);
    Player objPlayer = new Player();
    RuanganDenganNPC objRuangan = new RuanganDenganNPC(); //cuma satu ruangan dengan NPC yaitu child dari paren Ruangan
    GameInfo objGameInfo = new GameInfo();

    public static void main(String[] args) {
        GameEngine objGameEngine;
        objGameEngine = new GameEngine();
        objGameEngine.mulai();
    }

    //constructor
    public GameEngine() {
        //init ruangannya
        objRuangan.setObjGameInfo(objGameInfo);
        objRuangan.setDeskripsi("Ruangan kecil, dengan satu pintu dan jendela");

        //set nama dan kesehatan obj player
        objPlayer.setNama("Irfan Sholeh");
        objPlayer.setKesehatan(100);

        objPlayer.setRuanganAktif(objRuangan);  //set ruangan aktif player
        objPlayer.setObjGameInfo(objGameInfo);

        objGameInfo.setObjPlayer(objPlayer);
        objGameInfo.setObjRuangan(objRuangan);
    }


    private void aksi() {
        System.out.println();
        System.out.println("==============================================");
        System.out.println("1. Aksi yang dapat dilakukan di ruangan");
        System.out.println("2. Aksi terhadap player");
        System.out.println("3. Keluar");
        System.out.println("==============================================");
        System.out.print("Pilihan anda?");
        int pil = sc.nextInt();
        System.out.println("--");
        if (pil==3) {
            objGameInfo.setGameOver(true); //keluar
        } else if (pil==1) {
            objRuangan.pilihanAksi(); //aksi dalam ruangan
        } else if (pil==2) {
            objPlayer.pilihanAksi(); //aksi dalam player
        }
    }

    public void mulai() {
        while (!objGameInfo.getGameOver()) {
            aksi();
        }
    }
}


// NIM  : 1901117
// Nama : Irfan Sholeh
// NIM  : 1901321
// Nama : Rival Swandy Irawan