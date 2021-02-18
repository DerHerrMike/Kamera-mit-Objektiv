public class Kamera {

    private String herstellerName;
    private String modellName;
    public Objektiv objektiv;

    public Kamera(String herstellerName, String modellName) {
        this.herstellerName = herstellerName;
        this.modellName = modellName;
    }

    // Methoden
    public void KameraInfo() {
        System.out.printf(" Diese Kamera ist eine %s mit der Modellbezeichnung %s und dem Objektiv von %s", herstellerName, modellName,  objektiv.getErzeuger());
    }

    public void fotografieren() {
        System.out.println();
        System.out.println(" Es wurde ein Foto gemacht mit folgenden Spezifikationen: ");
        KameraInfo();
    }

    // Getter
    public String getHerstellerName() {
        return herstellerName;
    }

    public String getModellName() {
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

}




