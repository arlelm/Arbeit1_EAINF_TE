/*Gib in der App.java als Kommentar an, welche Klassen mit welchen Eigenschaften erstellt werden
müssen. Beschreibe zusätzlich, welche Klassen untereinander verbunden sein werden und warum.
Nutze dazu die Begriffe Objekt, Klasse und Eigenschaft und erläutere das OOP-Paradigma.

In diesem Projekt geht es darum die zu verkaufenden Wohnungen anzubieten, wie auch die Verkäufe der Hauser oder Wohnungen anzuzeigen. Das geschieht indem wir gucken was verkauft wird ==> Häuser und Wohnungen. Wer verkauft diese ==> ein Markler und wer kauft das Haus/Wohnung ==> ein Käufer. Da das alles erstellbare Dinge mit eigenen Eigenschaften sind, können wir sie in der Informatik als Objekte bezeichnen, diese Objekte werden innerhalb einer Klasser erstellt. Somit müssen wir für alle diese Klassen erstellen und ihnen Eigenschaften geben. In der Objekt Orientierten Programmierung ist es nähmlich so, dass man probiert so nah wie möglich an der Wirklichkeit zu arbeiten, so dass es einem leichter fällt sich den Code vorzustellen. 
*/
public class App {
   static Markler[] _Marklers;
    static Kaeufer[] _Kaeufers;
   static Haeuser[] _haeuser;
   static Wohnungen[] _wohnungen;
   static Verkaeufe[] _Verkaeufes;



    public static void main(String[] args) throws Exception {
        
        _Marklers = new Markler[2];
        _Kaeufers = new Kaeufer[2];
        _haeuser = new Haeuser[2];
        _wohnungen = new Wohnungen[2];
        _Verkaeufes = new Verkaeufe[2];


        _Marklers[0] = new Markler("Hans", "Walter");
        _Kaeufers[0] = new Kaeufer("Alex", "Oloughlin");
        _Kaeufers[1] = new Kaeufer("Nils","Hasendorf");
        _haeuser[0] = new Haeuser(3, 200, "THE ONE","Big baba Haus", 200000);
        _wohnungen[0] = new Wohnungen(50,"Student", "Kleines Appartemnet für studierende", 75000);
      
        _Verkaeufes[0] = new Verkaeufe(_haeuser[0],_Marklers[0],_Kaeufers[0], 200000);
        _Verkaeufes[1] = new Verkaeufe(_wohnungen[0], _Marklers[0], _Kaeufers[1], 75000);

        System.out.println(_Verkaeufes[0]);
        
        System.out.println(_Verkaeufes[1]);

   
    }






}

