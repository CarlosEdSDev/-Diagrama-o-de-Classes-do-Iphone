package Util.Class;

import java.util.Objects;

public class Contats {
    private String nomeContat;
    private Integer numero;

    public Contats(String nomeContato, Integer numero) {
        this.nomeContat = nomeContato;
        this.numero = numero;
    }

    public String getNomeContato() {
        return nomeContat;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContat = nomeContato;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contats contats)) return false;
        return Objects.equals(getNomeContato(), contats.getNomeContato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeContato());
    }

    @Override
    public String toString() {
        return "Contatos " + nomeContat + " de numero: " + numero;
    }
}
