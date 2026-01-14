package zad0;

public class KierownikWycieczki {
    private Biletomat biletomat;

    public KierownikWycieczki(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    public Biletomat getBiletomat() {
        return biletomat;
    }

    public void setBiletomat(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    public void zobaczBilet(){
        biletomat.wydajBilet();
    }
}
