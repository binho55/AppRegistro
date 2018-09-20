package br.com.opet.tds.appregistro;

/**
 * Created by Diego on 19/09/2018.
 */

public class Filme {
    private String nomeFilme;
    private String genero;
    private int nota;

    public Filme(){}

    public Filme(String nome, String genero, int nota) {
        this.nomeFilme = nome;
        this.nota = nota;
        this.genero = genero;
    }

    public int getNota(){ return nota; }

    public void setNota(int nota){this.nota = nota;}

    public String getNome() {
        return nomeFilme;
    }

    public void setNome(String nome) {
        this.nomeFilme = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
