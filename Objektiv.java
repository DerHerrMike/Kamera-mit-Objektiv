public class Objektiv {
    private String erzeuger;
    private int brennweiteMin;
    private int brennweiteMax;


    public Objektiv(String erzeuger, int brennweiteMin, int brennweiteMax) {
        this.erzeuger = erzeuger;
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
    }

   // Setter
    public void setErzeuger(String erzeuger) {
        this.erzeuger = erzeuger;
    }

    public void setBrennweiteMin(int brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public void setBrennweiteMax(int brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    // Getter
    public String getErzeuger() {
        return erzeuger;
    }

    public int getbrennweiteMin(){
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    // Methode
    public void printObjektivInfo() {
        System.out.println("Diese Objektiv hat eine Mindestbrennweite von " + getbrennweiteMin() + "mm & eine maximale Brennweite von " + getBrennweiteMax() + "mm.");
    }

}


