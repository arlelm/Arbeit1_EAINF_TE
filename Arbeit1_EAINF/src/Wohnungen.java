public class Wohnungen {
    int _quadratmeter;
    String _titel;
    String _beschreibung;
    int _preis;

    public Wohnungen(int _quadratmeter, String _titel, String _beschreibung, int _preis){
        set_quadratmeter(_quadratmeter);
        set_titel(_titel);
        set_beschreibung(_beschreibung);
        set_Preis(_preis);
    }




    public void set_titel(String _titel) {
        this._titel = _titel;
    }
    public void set_quadratmeter(int _quadratmeter) {
        this._quadratmeter = _quadratmeter;
    }
    public void set_beschreibung(String _beschreibung) {
        this._beschreibung = _beschreibung;
    }
    public void set_Preis(int _Preis) {
        this._preis = _Preis;
    }

    public String get_titel() {
        return _titel;
    }
    public int get_quadratmeter() {
        return _quadratmeter;
    }
    public String get_beschreibung() {
        return _beschreibung;
    }
    public int get_Preis() {
        return _preis;
    }


}
