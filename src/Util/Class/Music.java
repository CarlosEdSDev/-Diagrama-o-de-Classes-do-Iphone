package Util.Class;

import java.util.Objects;

public class Music{
    private String nomeMusica;
    private Boolean estadoMusic;

    public Music(String nomeMusica) {
        this.nomeMusica = nomeMusica;
        estadoMusic = false;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public Boolean getEstadoMusic() {
        return estadoMusic;
    }

    public void setEstadoMusic(Boolean estadoMusic) {
        this.estadoMusic = estadoMusic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Music music)) return false;
        return Objects.equals(getNomeMusica(), music.getNomeMusica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeMusica());
    }

    @Override
    public String toString() {
        String estado;
        if(estadoMusic){
            estado = "Reproduzindo";
        }else{
            estado ="Pausada";
        }
        return "Musica " +  nomeMusica + " está "  + estado;
    }
}
