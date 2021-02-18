public class Objektiv {
    private String erzeuger;
    private int brennweiteMin;
    private int brennweiteMax;


    public Objektiv(String erzeuger, int brennweiteMin, int brennweiteMax) {
        this.erzeuger = erzeuger;
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
    }

    // Methode
    public void ObjektivInfo() {
        System.out.printf(". Diese Objektiv hat eine Mindestbrennweite von %s mm & eine maximale Brennweite von %s mm.", brennweiteMin, brennweiteMax);
        System.out.println("");
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

    public int getbrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }


}






