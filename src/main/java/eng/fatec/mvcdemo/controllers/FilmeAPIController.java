package eng.fatec.mvcdemo.controllers;


import eng.fatec.mvcdemo.models.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/filmes")

public class FilmeAPIController {

        private static final List<Filme> filmes = new ArrayList<Filme>();

        public FilmeAPIController() {
            filmes.add(new Filme("O Exorcista", "Terror", "William Friedkin", "1973"));
            filmes.add(new Filme("Jurassic Park", "Ficcao Cientifica", "Steven Spielberg", "1993"));
            filmes.add(new Filme("Titanic", "Romance", "James Cameron", "1998"));
            filmes.add(new Filme("O Senhor dos Aneis", "Fantasia", "Peter Jackson", "2001"));
            filmes.add(new Filme("Godzilla Minus One", "Terror", "Takashi Yamazaki", "2023"));
            filmes.add(new Filme("A Viagem de Chihiro", "Animacao/Fantasia", "Hayao Miyazaki", "2001"));
            filmes.add(new Filme("Por um Punhado de Dolares", "Faroeste", "Sergio Leone", "1964"));
            filmes.add(new Filme("Clube da Luta", "Drama", "David Fincher", "1999"));
            filmes.add(new Filme("A Lenda do Cavaleiro Verde", "Fantasia", "David Lowery", "2021"));
            filmes.add(new Filme("Estrada da Furia", "Acao", "George Miller", "1979"));
        }

        @GetMapping
        public List<Filme> getFilmes()
        {
            return filmes;
        }
}
