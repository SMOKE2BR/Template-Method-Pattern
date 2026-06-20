package template;

public class VeiculoParticular extends Veiculo {
    @Override
    public float calcularIPVA() {
        return getValorVenal() * 0.03f; // 3%
    }

    @Override
    public String getTipo() {
        return "Particular";
    }
}
