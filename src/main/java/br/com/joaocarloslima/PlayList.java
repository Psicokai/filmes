package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    
    private List<Filme> filmes = new ArrayList<>();
    private static List<Streaming> streamings = new ArrayList<>();

    public PlayList(){
        this.streamings.add(new Streaming("Netflix"));
        this.streamings.add(new Streaming("Disney+"));
        this.streamings.add(new Streaming("HBO"));
        this.streamings.add(new Streaming("Parnamount"));
        this.streamings.add(new Streaming("Amazon Prime Video"));
    }
    public void adicionar(Filme filme){
        filmes.add(filme);
    }
    
    public void remover(Filme filme){
        filmes.remove(filme);
    }

    public List<Filme> pesquisarPorTitulo(String titulo){
        List<Filme> tempFilmes = new ArrayList<>();
        for(int i =0; i<filmes.size();i++){
            filmes.get(i);
            if(filmes.get(i).getTitulo().contains(titulo)){ 
                tempFilmes.add(filmes.get(i));
            }
        }
        
        return tempFilmes;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public static List<Streaming> getStreamings() {
        return streamings;
    }

    

}
