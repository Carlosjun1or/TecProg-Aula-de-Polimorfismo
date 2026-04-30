# 🎭 Polimorfismo em Java

Atividade desenvolvida na **FATEC Praia Grande** para a aula de **Técnicas de Programação** com foco nos conceitos de **Polimorfismo** (Sobrescrita e Sobrecarga) da Programação Orientada a Objetos (POO).

## 📋 Sobre o Projeto

Este projeto reúne **5 exercícios práticos** que exploram as diferentes formas de polimorfismo em Java, permitindo que objetos respondam a uma mesma chamada de método de maneiras distintas.

O objetivo principal é aplicar conceitos como:

*   **Sobrescrita de Métodos (Override):** Redefinição de métodos da classe base em subclasses.
*   **Sobrecarga de Métodos (Overload):** Criação de múltiplas versões de um método com assinaturas diferentes.
*   **Sobrecarga de Construtores:** Flexibilidade na instanciação de objetos com diferentes conjuntos de dados.
*   **Separação entre Model e View:** Organização do código em camadas distintas.
*   **Interação com o usuário via terminal (Scanner):** Implementação de entradas e saídas de dados.

## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)<br>
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

## 📁 Estrutura do Projeto

```
src/
└── br/
    └── edu/
        └── fatecpg/
            └── tecprog/
                └── polimorfismo/           
                    ├── atividade1/
                    │   ├── model/
                    │   │   ├── Veiculo.java
                    │   │   ├── Carro.java
                    │   │   └── Bicicleta.java
                    │   └── view/
                    │       └── Main.java
                    │
                    ├── atividade2/
                    │   ├── model/
                    │   │   └── Calculadora.java
                    │   └── view/
                    │       └── Main.java
                    │
                    ├── atividade3/
                    │   ├── model/
                    │   │   └── Produto.java
                    │   └── view/
                    │       └── Main.java
                    │
                    ├── atividade4/
                    │   ├── model/
                    │   │   ├── Pagamento.java
                    │   │   ├── PagamentoCartao.java
                    │   │   └── PagamentoBoleto.java
                    │   └── view/
                    │       └── Main.java
                    │
                    └── atividade5/
                        ├── model/
                        │   └── Conversor.java
                        └── view/
                            └── Main.java
```

## 🧱 Exercícios e Modelagem Orientada a Objetos

### 🔹 1. Hierarquia de Veículos (Sobrescrita)

**Enunciado:** Implemente uma classe base `Veiculo` com o método `mover()`. Crie subclasses `Carro` e `Bicicleta` que sobrescrevam este método.

| Classe | Método | Comportamento (Output) |
| --- | --- | --- |
| **Carro** | `mover()` | "O carro está dirigindo" |
| **Bicicleta** | `mover()` | "A bicicleta está pedalando" |

---

### 🔹 2. Calculadora (Sobrecarga de Métodos)

**Enunciado:** Crie uma classe `Calculadora` com três versões do método `somar()` para lidar com diferentes tipos e quantidades de parâmetros.

| Versão | Parâmetros | Tipo de Retorno |
| --- | --- | --- |
| **V1** | `int a, int b` | `int` |
| **V2** | `int a, int b, int c` | `int` |
| **V3** | `double a, double b` | `double` |

---

### 🔹 3. Cadastro de Produtos (Sobrecarga de Construtores)

**Enunciado:** Crie uma classe `Produto` com três construtores sobrecarregados para permitir flexibilidade na criação de objetos.

| Construtor | Parâmetros | Finalidade |
| --- | --- | --- |
| **C1** | `String nome` | Apenas identificação |
| **C2** | `String nome, double preco` | Identificação e valor |
| **C3** | `String nome, double preco, int qtd` | Cadastro completo |

---

### 🔹 4. Sistema de Pagamentos (Sobrescrita)

**Enunciado:** Crie uma classe base `Pagamento` e subclasses `PagamentoCartao` e `PagamentoBoleto` para demonstrar o polimorfismo em transações.

| Classe | Método | Comportamento (Output) |
| --- | --- | --- |
| **Pagamento** | `processarPagamento()` | "Processando pagamento genérico" |
| **PagamentoCartao** | `processarPagamento()` | "Processando pagamento via cartão de crédito" |
| **PagamentoBoleto** | `processarPagamento()` | "Processando pagamento via boleto bancário" |

---

### 🔹 5. Conversor Multiuso (Sobrecarga de Métodos)

**Enunciado:** Implemente uma classe `Conversor` com três versões do método `converter()` para diferentes tipos de dados e funcionalidades.

| Versão | Operação | Parâmetros |
| --- | --- | --- |
| **V1** | Celsius para Fahrenheit | `double temp` |
| **V2** | Quilômetros para Milhas | `double km` |
| **V3** | Texto para Maiúsculas | `String texto` |

## 👤 Autor

| Nome |
| --- |
| Carlos Roberto |
