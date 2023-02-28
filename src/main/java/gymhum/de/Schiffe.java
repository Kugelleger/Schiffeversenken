package gymhum.de;

public class Schiffe {
    //laenge definiert die besetzten Felder
    int laenge;
    
    public Schiffe(int laenge){
        setLaenge(laenge);
    }


    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }
    public int getLaenge() {
        return laenge;
    }



}
