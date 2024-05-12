package br.com.joaocarloslima;



public class Filme {
    private String titulo;
    private Streaming streaming;
    private int nota;

    public Filme(String titulo, Streaming streaming, int nota) throws IllegalAccessException {
        this.titulo = titulo;
        this.streaming = streaming;
        this.nota = nota;
        if(nota<0||nota>10) throw new IllegalArgumentException("Nota maior que 10 ou menor que 0");
        if(streaming==null) throw new IllegalAccessException("Streaming inválido");
        if(titulo.isEmpty()) throw new IllegalAccessException("Título Inválido");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Streaming getStreaming() {
        return streaming;
    }

    public void setStreaming(Streaming streaming) {
        this.streaming = streaming;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
}
