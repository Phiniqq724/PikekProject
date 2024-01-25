import java.util.*;

public class Agent {
    int health = 100;
    Scanner in = new Scanner(System.in);
    String pilihSenjata;
    public String pilihSenjata(){
        System.out.print("Pilih senjata : \n a. Vandal \n b. Phantom\n = ");
        this.pilihSenjata = in.nextLine();
        String pilihSenjata = this.pilihSenjata;
        switch (pilihSenjata) {
            case "a":
                pilihSenjata = "Vandal";
                return pilihSenjata;
            case "b":
                pilihSenjata = "Phantom";
                return pilihSenjata;
            default:
                return null;
        }
    }
}
