public class Markler {
    String _vorname;
    String _nachname;
    int _verkaeufe;


    public Markler(String vorname, String nachname){
        this.set_vorname(_vorname);
        this.set_nachname(_nachname);
        this.set_verkaeufe(_verkaeufe);

    }



    public void set_vorname(String _vorname) {
        this._vorname = _vorname;
    }
    public void set_nachname(String _nachname) {
        this._nachname = _nachname;
    }
    public void set_verkaeufe(int _verkaeufe) {
        this._verkaeufe = _verkaeufe;
    }
}
