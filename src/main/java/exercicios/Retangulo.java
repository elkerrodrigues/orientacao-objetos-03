package exercicios;

public class Retangulo {
    private Double base=0.0;
    private Double altura=0.0;


    public Retangulo(Double base,Double altura){
        setBase(base);
        setAltura(altura);
    }


    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura) {
        if (altura<=0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        else this.altura = altura;
    }

    public void setBase(Double base) {
        if (base<=0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        else this.base = base;
    }

    public Double calcularArea(){
        return base * altura;
    }

    public Double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
