public class Haeuser {
    int _stockwerke;
    int _quadratmeter;
    String _titel;
    String _beschreibung;
    int _Preis;


    public Haeuser(int _stockwerke, int _quadratmeter, String _titel, String _beschreibung, int _preis){
        this.set_stockwerke(_stockwerke);
        this.set_quadratmeter(_quadratmeter);
        this.set_titel(_titel);
        this.set_beschreibung(_beschreibung);
        this.set_Preis(_Preis);
    }



    public void set_stockwerke(int _stockwerke) {
        this._stockwerke = _stockwerke;
    }
    public void set_quadratmeter(int _quadratmeter) {
        this._quadratmeter = _quadratmeter;
    }
    public void set_beschreibung(String _beschreibung) {
        this._beschreibung = _beschreibung;
    }
    public void set_titel(String _titel) {
        this._titel = _titel;
    }
    public void set_Preis(int _Preis) {
        this._Preis = _Preis;
    }

    public int get_stockwerke() {
        return _stockwerke;
    }
    public int get_quadratmeter() {
        return _quadratmeter;
    }
    public String get_beschreibung() {
        return _beschreibung;
    }  
    public String get_titel() {
        return _titel;
    }
    public int get_Preis() {
        return _Preis;
    }

}
