package template;

public class VeiculoComercial extends Veiculo {
    @Override
    public float calcularIPVA() {
        return getValorVenal() * 0.015f; // 1,5%
    }

    @Override
    public String getTipo() {
        return "Comercial";
    }
}
