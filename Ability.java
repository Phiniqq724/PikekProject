public interface Ability {
    void flash(String agent);
    void blind(String agent);
    void smoke(String agent);
    void stunt(String agent);
    void teleport(String agent);
    String player(String playerName);
}
