package oop;

public class Lavoratore extends Persona {
private int stipendio;

public Lavoratore(String nome, int eta, int stipendio) {
    super(nome,eta);
    this.stipendio=stipendio;
}
public void descrizione() {
    System.out.println("Il dipendente si chiama "+nome+" ha "+eta+" anni,e guadagna lordi al mese"+stipendio+"euro.");
}

}
