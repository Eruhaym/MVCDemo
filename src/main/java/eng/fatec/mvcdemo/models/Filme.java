package eng.fatec.mvcdemo.models;

public class Filme {
    private String nome;
    private String genero;
    private String diretor;
    private String lancamento;

    public Filme(String nome, String genero, String diretor, String lancamento) {
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
        this.lancamento = lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }
}