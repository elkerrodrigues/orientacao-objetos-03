package exercicios;

public class Circulo {
    private Double raio=0.0;

    public Circulo(Double raio){
        setRaio(raio);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        if (raio<=0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        else this.raio = raio;

    }

    public Double calcularArea(){
        return 3.14 * (raio*raio);
    }

    public Double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}
