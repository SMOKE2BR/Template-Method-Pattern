package template;

public abstract class Veiculo {
    private String placa;
    protected String modelo;
    private float valorVenal;

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public float getValorVenal() { return valorVenal; }
    public void setValorVenal(float valorVenal) { this.valorVenal = valorVenal; }

    // Template Method
    public final String getInfo() {
        return "Tipo: " + getTipo() +
                ", Placa: " + placa +
                ", Modelo: " + modelo +
                ", Valor Venal: " + valorVenal +
                ", IPVA: " + calcularIPVA();
    }

    // Métodos abstratos que subclasses devem implementar
    public abstract float calcularIPVA();
    public abstract String getTipo();
}
