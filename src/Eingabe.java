import java.util.Scanner;

public class Eingabe {

    public int wahlKamera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wähle ein Kamera!");
        System.out.print(" '1' für die Leica oder '2' für die Canon: ");
        int wahlK = scanner.nextInt();
        return wahlK;
    }

    public int wahlObjektiv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wähle ein Objektiv!");
        System.out.print(" '1' für die Zeiss, '2' für Canon oder '3' für Sigma: ");
        int wahlO = scanner.nextInt();
        return wahlO;

    }




}

