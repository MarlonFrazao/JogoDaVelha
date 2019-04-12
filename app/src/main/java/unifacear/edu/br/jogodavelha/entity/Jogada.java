package unifacear.edu.br.jogodavelha.entity;

public class Jogada {

    private Integer id;
    private Integer posicao;
    private Boolean jogada;

    public Jogada(){}

    public Jogada(Integer id, Integer posicao, Boolean jogada) {
        this.id = id;
        this.posicao = posicao;
        this.jogada = jogada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Boolean getJogada() {
        return jogada;
    }

    public void setJogada(Boolean jogada) {
        this.jogada = jogada;
    }
}
