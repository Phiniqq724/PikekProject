import java.util.Scanner;

public class Omen extends Agent implements Ability{
    Scanner in = new Scanner(System.in);
    String agent = "Omen";
    String pilihSenjata;
    int health = super.health;
    String pilihShield;
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
    int buyShield() {
        System.out.println("Pilih Shield : \n a. 25 \n b. 50");
        this.pilihShield = in.nextLine();
        switch (pilihShield) {
            case "a":
                this.health = this.health + 25;
                return this.health;
            case "b":
                this.health = this.health+50;
                return this.health;
            default:
                System.out.println("No Option");
                return this.health;
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
