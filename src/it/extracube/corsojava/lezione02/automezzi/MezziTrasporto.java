package it.extracube.corsojava.lezione02.automezzi;

public abstract class MezziTrasporto {

    private int numRuote;
    private String alimentazione;
    private int numPasseggeri;
    private String targa;

    public void setNumRuote(int numRuote) {
        this.numRuote=numRuote;
    }

    public int getNumRuote() {
        return numRuote;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public int getNumPasseggeri() {
        return numPasseggeri;
    }

    public String getTarga() {
        return targa;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setNumPasseggeri(int numPasseggeri) {
        this.numPasseggeri = numPasseggeri;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}