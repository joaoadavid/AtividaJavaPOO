package entities;

public class CalculaPesoNoPlaneta {
	
	private String nomeDoPlaneta;
    private double Gravidade;

    public CalculaPesoNoPlaneta(String nomeDoPlaneta, double fatorGravidade) {
        this.nomeDoPlaneta = nomeDoPlaneta;
        this.Gravidade = fatorGravidade;
    }

    public String getNome() {
        return nomeDoPlaneta;
    }

    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * Gravidade;
    }

   
}
