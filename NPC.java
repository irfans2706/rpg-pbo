import java.util.ArrayList;

public class NPC extends Hero {
    private ItemBarang  objBarang;
    private ArrayList<String> arrAksi = new ArrayList<>();
    private boolean isKenal = false;

    public NPC() {
        //init kunci untuk attribut child
        objBarang = new ItemBarang("Kunci");
        objBarang.setDeskripsi("Sebuah kunci kecil yang sudah agak berkarat");

        //aksi npc untuk attribut child
        arrAksi.add("Perkenalan dgn NPC");
        arrAksi.add("Minta kunci");

    }

    public void prosesAksi(int subPil) {
        //1: perkenalan dengan npc
        //2: buka pintu
        if (subPil == 1) {
            System.out.println("Halo saya "+super.getNama());
            isKenal = true;
        } else if (subPil == 2) {
            if (isKenal) {
                //berikan kunci pada player
                if (objBarang==null) {
                    System.out.println("Masa lupa, kunci kan sudah saya berikan!");
                } else
                {
                    System.out.println("Kunci diberikan pada player");
                    super.getObjGameInfo().getObjPlayer().addItem(objBarang);     //tambahkan  objek ini pada player
                    objBarang = null;
                }

            } else {
                System.out.println("Siapa anda? kenalan dulu dong");
            }
        }
    }

    @Override //Override setObjGameInfo untuk child npc ditambahkan objBarang di set game infonya
    public void setObjGameInfo(GameInfo objGameInfo) {
        super.setObjGameInfo(objGameInfo);
        objBarang.setObjGameInfo(objGameInfo);
    }
    public ArrayList<String> getAksi() {
        return arrAksi;
    }
}

// NIM  : 1901117
// Nama : Irfan Sholeh
// NIM  : 1901321
// Nama : Rival Swandy Irawan