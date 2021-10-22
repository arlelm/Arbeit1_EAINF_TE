public class Verkaeufe {
    Haeuser _haus;
    Wohnungen _wohnung;
    Kaeufer _kaeufer;
    Markler _markler;
    int _preis;

    public Verkaeufe(Wohnungen _wohnung, Markler _markler, Kaeufer _kaeufer, int _preis){
        this.set_wohnung(_wohnung);
        this.set_markler(_markler);
        this.set_kaeufer(_kaeufer);
        this.set_preis(_preis);
    }

    public Verkaeufe(Haeuser _haus, Markler _markler, Kaeufer _kaeufer, int _preis){
        this.set_haus(_haus);
        this.set_markler(_markler);
        this.set_kaeufer(_kaeufer);
        this.set_preis(_preis);
    }



    public void set_haus(Haeuser _haus) {
        this._haus = _haus;
    }
    public void set_wohnung(Wohnungen _wohnung) {
        this._wohnung = _wohnung;
    }
    public void set_kaeufer(Kaeufer _kaeufer) {
        this._kaeufer = _kaeufer;
    }
    public void set_markler(Markler _markler) {
        this._markler = _markler;
    }
    public void set_preis(int _preis) {
        this._preis = _preis;
    }

    public Haeuser get_haus() {
        return _haus;
    }
    public Wohnungen get_wohnung() {
        return _wohnung;
    }
    public Markler get_markler() {
        return _markler;
    }
    public Kaeufer get_kaeufer() {
        return _kaeufer;
    }
    public int get_preis() {
        return _preis;
    }
}
