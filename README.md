# Biblioteca de Operações Matemáticas, Financeiras e Geométricas em Java

## Descrição

Este repositório contém uma biblioteca Java para operações matemáticas, financeiras e cálculos geométricos básicos. A biblioteca foi projetada para oferecer métodos que abrangem operações aritméticas simples, cálculos de juros (simples e compostos) e cálculos geométricos de áreas, perímetros e volumes de diversas formas geométricas.

Este projeto foi desenvolvido como desafio final do primeiro módulo do curso de Desenvolvimento Backend Java da Vai na Web.

## Estrutura do Código

A biblioteca está estruturada em diferentes pacotes, cada um contendo classes específicas para tipos de operações:

### Pacote `lib_math.aritimetica`

Contém métodos para operações aritméticas básicas, tais como:
- Divisão (inteira e decimal)
- Multiplicação
- Potenciação
- Raiz
- Resto da divisão
- Soma
- Subtração

### Pacote `lib_math.financeiro`

Fornece métodos para cálculos financeiros, incluindo:
- Cálculo de juros simples e compostos

### Pacote `lib_math.geometria`

Oferece funcionalidades para cálculos geométricos, como:
- Cálculo de áreas (retângulo, quadrado, triângulo, círculo)
- Cálculo de perímetros (retângulo, quadrado, triângulo, círculo)
- Cálculo de volumes (cubo, esfera, cilindro, prisma retangular)

Cada classe dentro dos pacotes contém métodos específicos para realizar as operações desejadas, com sobrecargas para lidar com diferentes tipos de dados, oferecendo flexibilidade no uso das operações.

## Utilização

Para utilizar esta biblioteca em seu projeto Java, siga os passos abaixo:

1. **Importação das classes:**

    Importe as classes necessárias para o seu código Java, conforme a operação matemática ou geométrica desejada.

2. **Chamada dos métodos:**

    Utilize os métodos fornecidos pelas classes importadas para realizar os cálculos desejados. Certifique-se de passar os parâmetros corretos de acordo com a operação desejada e o tipo de dado esperado.

    Exemplo de uso para cálculo de juros compostos:
    ```java
    import lib_math.financeiro.Juros;

    public class Main {
        public static void main(String[] args) {
            double principal = 1000.0;
            double taxa = 0.05;
            int periodos = 3;
            int vezesCapitalizacao = 2;

            double jurosCompostos = Juros.calcularJurosCompostos(principal, taxa, periodos, vezesCapitalizacao);
            System.out.println("Juros Compostos: " + jurosCompostos);
        }
    }
    ```

3. **Observações:**

    - Valide sempre os parâmetros de entrada e verifique os tipos de dados para evitar possíveis erros.
    - Esta biblioteca visa oferecer funcionalidades básicas para operações matemáticas e geométricas, podendo não contemplar todos os cenários ou otimizações necessárias para uso em produção.
    - Caso encontre problemas ou queira contribuir, sinta-se à vontade para abrir issues ou pull requests neste repositório.
