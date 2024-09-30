package br.com.estudos.batflix.calculos;

import br.com.estudos.batflix.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme){
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }
    public void incluir(Titulo titulo){
        System.out.println("Adicionando duração de minutos em: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
