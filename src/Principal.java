import br.com.estudos.batflix.calculos.CalculadoraTempo;
import br.com.estudos.batflix.modelos.Filme;
import br.com.estudos.batflix.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Enrolados");
        filme.setAnoDeLancamento(2018);
        filme.setDuracaoEmMinutos(190);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());


        filme.exibeFichaTecnica();
        filme.avalia(9);
        filme.avalia(6);
        filme.avalia(10);

        System.out.println("Total de avaliações: " + filme.getTotalAvaliacoes());
        System.out.println("Total da média de avaliações: " + filme.obterMedia());

        //filme.somaDasAvaliacoes = 10;
        //filme.totalAvaliacoes = 1;

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorTemporada(50);
        System.out.println("Duração para maratonar Lost: " + serie.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(100);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.incluir(filme);
        calculadora.incluir(filme2);
        calculadora.incluir(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}