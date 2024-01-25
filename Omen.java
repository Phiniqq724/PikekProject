import java.util.Scanner;

public class Omen implements Ability{
    Scanner in = new Scanner(System.in);
    @Override
    public String player(String playerName) {
        System.out.print("Insert Player name = ");
        playerName = in.nextLine();
        return playerName;
    }
    @Override
    public void smoke() {
        
    }
    @Override
    public void blind() {
        
    }
    @Override
    public void teleport() {
        
    }
    @Override
    public void stunt() {
        // Gaada
    }
    @Override
    public void flash() {
        // Gaada
    }
}
