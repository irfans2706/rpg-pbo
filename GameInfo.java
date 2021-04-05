//variabel2 global
public class GameInfo {
    private Boolean isGameOver = false;
    private Player objPlayer;
    private RuanganDenganNPC objRuangan; //ruangan aktif dari ruangan dengan NPC

    public Ruangan getObjRuangan() {
        return objRuangan;
    }

    public void setObjRuangan(RuanganDenganNPC objRuangan) {
        this.objRuangan = objRuangan;
    }

    public Player getObjPlayer() {
        return objPlayer;
    }

    public void setObjPlayer(Player objPlayer) {
        this.objPlayer = objPlayer;
    }

    public Boolean getGameOver() {
        return isGameOver;
    }

    public void setGameOver(Boolean gameOver) {
        isGameOver = gameOver;
    }
}

// NIM  : 1901117
// Nama : Irfan Sholeh
// NIM  : 1901321
// Nama : Rival Swandy Irawan