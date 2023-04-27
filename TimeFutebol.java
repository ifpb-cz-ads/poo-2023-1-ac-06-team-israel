import java.util.ArrayList;

public class TimeFutebol {
    private String nome;
    private String tecnico;
    private int quantidadeTitulos;

    public TimeFutebol(String nome, String tecnico, int quantidadeTitulos) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(int quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }
}
