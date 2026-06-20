# Template Method Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Template Method** em Java, aplicado ao cálculo de IPVA para diferentes tipos de veículos.

## 📌 Estrutura

- **Classe abstrata**
  - `Veiculo` → define atributos comuns (placa, modelo, valor venal) e o método template `getInfo()`, que organiza a saída chamando métodos abstratos.

- **Subclasses concretas**
  - `VeiculoParticular` → calcula IPVA como 3% do valor venal.
  - `VeiculoComercial` → calcula IPVA como 1,5% do valor venal.

- **Classe de execução**
  - `Main` → instancia veículos de diferentes tipos e imprime suas informações.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/template`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Tipo: Particular, Placa: ABC-1234, Modelo: Sedan, Valor Venal: 50000.0, IPVA: 1500.0
Tipo: Comercial, Placa: XYZ-9876, Modelo: Caminhão, Valor Venal: 120000.0, IPVA: 1800.0


## 🎯 Objetivo

O padrão **Template Method** define a estrutura de um algoritmo em uma classe abstrata, permitindo que subclasses concretas implementem partes específicas.  
Neste exemplo, o cálculo do IPVA varia conforme o tipo de veículo, mas a lógica de exibição (`getInfo()`) permanece consistente.
