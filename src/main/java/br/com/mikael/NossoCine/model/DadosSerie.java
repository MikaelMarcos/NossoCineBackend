package br.com.mikael.NossoCine.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAlias;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosSerie(@JsonAlias("Title")String titulo,
                         @JsonAlias("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {

}
