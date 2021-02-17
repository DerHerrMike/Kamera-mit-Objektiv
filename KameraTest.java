public class KameraTest {

    public static void main(String[] args) {

        // Objekte erstellen
        Kamera kam1 = new Kamera("Leica", "Q24.2");
        Kamera kam2 = new Kamera("Panasonic", "Lumix G9");

        Objektiv obj1 = new Objektiv("Zeiss", 20, 85);
        Objektiv obj2 = new Objektiv("Canon", 38, 70);
        Objektiv obj3 = new Objektiv("Sigma", 8, 25);

        // Methode aufrufen
        kam1.setObjektiv(obj1);
        kam1.fotografieren();
        kam1.getObjektiv().ObjektivInfo();

        kam2.setObjektiv(obj3);
        kam2.fotografieren();
        kam2.getObjektiv().ObjektivInfo();

        kam1.setObjektiv(obj2);
        kam1.fotografieren();
        kam1.getObjektiv().ObjektivInfo();

    }
}

