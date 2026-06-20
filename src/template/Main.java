package template;

public class Main {
    static void main(String[] args) {
        template.Veiculo carro = new VeiculoParticular();
        carro.setPlaca("ABC-1234");
        carro.setModelo("Sedan");
        carro.setValorVenal(50000f);

        Veiculo caminhão = new VeiculoComercial();
        caminhão.setPlaca("XYZ-9876");
        caminhão.setModelo("Caminhão");
        caminhão.setValorVenal(120000f);

        System.out.println(carro.getInfo());
        System.out.println(caminhão.getInfo());
    }
}
