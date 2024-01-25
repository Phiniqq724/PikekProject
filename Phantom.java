public class Phantom extends Senjata{
    @Override
    String tipeSenjata(String namaSenjata) {
        namaSenjata = "Phantom";
        super.tembakan = "Brust & Spray";
        super.peluru = 90;
        super.reloadSpeed = 2.5;
        return namaSenjata;
    }
}
