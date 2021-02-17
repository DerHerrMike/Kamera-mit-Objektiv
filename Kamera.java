public class Kamera {

    private String herstellerName;
    private String modellName;
    public Objektiv objektiv;

    public Kamera (String herstellerName, String modellName) {
        this.herstellerName = herstellerName;
        this.modellName = modellName;
    }



    // Getter
    public String getHerstellerName() {
        return herstellerName;
    }

    public String getModellName(){
        return modellName;
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    // Setter
    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public void setHerstellerName(String herstellerName) {
        this.herstellerName = herstellerName;
    }

    public void setModellName(String modellName) {
        this.modellName = modellName;
    }

    // Methoden
    public void printKameraInfo() {
        System.out.printf(" Diese Kamera ist eine " + getHerstellerName() + " mit der Modellbezeichnung " + getModellName() + " und dem Objektiv von " + objektiv.getErzeuger() + ". ");
    }

    public void fotografieren() {
        System.out.println(" Es wurde ein Foto gemacht mit folgenden Spezifikationen: ");
        printKameraInfo();
    }

}




