public class Vandal extends Senjata{
    @Override
    String tipeSenjata(String namaSenjata) {
        namaSenjata = "Vandal";
        super.tembakan = "Brust & Spray";
        super.peluru = 75;
        super.reloadSpeed = 2.5;
        return namaSenjata;
    }
}
