package unifacear.edu.br.jogodavelha.entity;

public class Resultado {
    private Integer id;
    private Boolean ganhador;

    public Resultado(){}

    @Override
    public String toString() {
        return id + " " + (ganhador ? "Círculo ganhou!" : "X ganhou!");
    }

    public Resultado(Integer id, Boolean ganhador) {
        this.id = id;
        this.ganhador = ganhador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGanhador() {
        return ganhador;
    }

    public void setGanhador(Boolean ganhador) {
        this.ganhador = ganhador;
    }


}
