package oop;

public class Persona {
protected String nome;
protected int eta;

public Persona(String nome, int eta) {
    
    this.nome=nome;
    this.eta=eta;
}
public int getEta() {
    return eta;
}

public void setEta(int neweta) {
    if(neweta>0) {
        eta=neweta;
    }else {
        System.out.println("Hai inserito un etá non valida!");
    }
}

public void descrizione() {
    System.out.println("Mi chiamo "+nome+" e ho "+ eta+" anni.");
}
}
