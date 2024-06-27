package br.com.mikael.NossoCine;

import br.com.mikael.NossoCine.model.DadosSerie;
import br.com.mikael.NossoCine.service.ConsomeApi;
import br.com.mikael.NossoCine.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NossoCineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NossoCineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consomeApi = new ConsomeApi();
		var json = consomeApi.obterDados("https://www.omdbapi.com/?t=the%20flash&Season=1&apikey=b31b74fe");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
