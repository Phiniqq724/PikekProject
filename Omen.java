import java.util.Scanner;

public class Omen extends Agent implements Ability{
    Scanner in = new Scanner(System.in);
    String agent = "Omen";
    String pilihSenjata;
    @Override
    public String player(String playerName) {
        System.out.print("Insert Player name = ");
        playerName = in.nextLine();
        return playerName;
    }
    @Override
    public void smoke(String agent) {
        this.agent = agent;
        System.out.println("You place " + agent + "smoke!");
    }
    @Override
    public void blind(String agent) {
        this.agent = agent;
        System.out.println("You blind someone with " + agent + "blind!");
    }
    @Override
    public void teleport(String agent) {
        this.agent = agent;
        System.out.println("You ("+ agent+") teleport to safe place");
    }
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





    @Override
    public void stunt(String agent) {
        // Gaada
    }
    @Override
    public void flash(String agent) {
        // Gaada
    }
}
