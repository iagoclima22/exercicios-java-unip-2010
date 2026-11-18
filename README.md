# Exercícios Java: lista UNIP 2010

Resolução em Java dos 64 exercícios de uma lista de lógica de programação da UNIP (Ciência da Computação e Sistemas de Informação, 2010). A lista original foi escrita para C#, e aqui eu resolvo todos os exercícios em Java.

Uso este repositório para praticar os fundamentos da linguagem todos os dias: entrada e saída com `Scanner`, estruturas condicionais, laços de repetição, vetores e métodos. Cada exercício virou um commit próprio, então o histórico mostra a evolução da lista.

**Status:** 64 de 64 exercícios resolvidos ✅

## Conteúdo

Os exercícios estão separados em pacotes, um para cada nível da lista:

| Nível | Exercícios | Pacote |
|---|:--:|---|
| Nível 1: Entrada, processamento e saída | 01 a 10 | `src/nivel1` |
| Nível 2: Estruturas condicionais | 11 a 22 | `src/nivel2` |
| Nível 3: Estrutura de seleção | 23 a 25 | `src/nivel3` |
| Nível 4: Estruturas de repetição | 26 a 44 | `src/nivel4` |
| Nível 5: Vetores e matrizes | 45 a 59 | `src/nivel5` |
| Nível 6: Métodos | 60 a 64 | `src/nivel6` |

## Tecnologias

* Java 25
* IntelliJ IDEA

## Estrutura do projeto

```
exercicios-java-unip-2010/
├── src/
│   ├── nivel1/
│   ├── nivel2/
│   ├── nivel3/
│   ├── nivel4/
│   ├── nivel5/
│   └── nivel6/
├── Lista - 64 Exercicios.pdf
└── Lista_64_Exercicios_Simulacoes.pdf
```

* [Lista - 64 Exercicios.pdf](Lista%20-%2064%20Exercicios.pdf): enunciados originais da lista.
* [Lista_64_Exercicios_Simulacoes.pdf](Lista_64_Exercicios_Simulacoes.pdf): exemplos de entrada e saída de cada exercício, usados para conferir as resoluções.

## Como executar

**Pelo IntelliJ IDEA**

1. Clone o repositório:
   ```bash
   git clone https://github.com/iagoclima22/exercicios-java-unip-2010.git
   ```
2. Abra a pasta do projeto no IntelliJ IDEA.
3. Abra o exercício desejado em `src/nivelX` e execute o método `main`.

**Pelo terminal**

Na pasta do projeto, compile e execute informando o pacote e o nome da classe. Exemplo com o exercício 01:

```bash
javac -d out src/nivel1/Ex01EstoqueMedio.java
java -cp out nivel1.Ex01EstoqueMedio
```

## Lista de exercícios

### Nível 1: Entrada, processamento e saída

| Nº | Exercício | Código |
|:--:|---|---|
| 01 | Estoque médio | [Ex01EstoqueMedio.java](src/nivel1/Ex01EstoqueMedio.java) |
| 02 | Cotação do dólar | [Ex02CotacaoDolar.java](src/nivel1/Ex02CotacaoDolar.java) |
| 03 | Comissão de vendedor | [Ex03Comissao.java](src/nivel1/Ex03Comissao.java) |
| 04 | Propriedade distributiva | [Ex04PropriedadeDistributiva.java](src/nivel1/Ex04PropriedadeDistributiva.java) |
| 05 | Consumo de combustível | [Ex05Combustivel.java](src/nivel1/Ex05Combustivel.java) |
| 06 | Celsius para Fahrenheit | [Ex06CelsiusParaFahrenheit.java](src/nivel1/Ex06CelsiusParaFahrenheit.java) |
| 07 | Fahrenheit para Celsius | [Ex07FahrenheitParaCelsius.java](src/nivel1/Ex07FahrenheitParaCelsius.java) |
| 08 | Volume de uma lata de óleo | [Ex08VolumeLata.java](src/nivel1/Ex08VolumeLata.java) |
| 09 | Idade em dias | [Ex09IdadeEmDias.java](src/nivel1/Ex09IdadeEmDias.java) |
| 10 | Relacionamentos de ordem | [Ex10Relacionamentos.java](src/nivel1/Ex10Relacionamentos.java) |

### Nível 2: Estruturas condicionais

| Nº | Exercício | Código |
|:--:|---|---|
| 11 | Troca de valores | [Ex11TrocaValores.java](src/nivel2/Ex11TrocaValores.java) |
| 12 | Módulo de um número | [Ex12Modulo.java](src/nivel2/Ex12Modulo.java) |
| 13 | Ordem decrescente | [Ex13OrdemDecrescente.java](src/nivel2/Ex13OrdemDecrescente.java) |
| 14 | Diferença entre dois números | [Ex14Diferenca.java](src/nivel2/Ex14Diferenca.java) |
| 15 | Média com recuperação | [Ex15MediaRecuperacao.java](src/nivel2/Ex15MediaRecuperacao.java) |
| 16 | Maior e menor | [Ex16MaiorEMenor.java](src/nivel2/Ex16MaiorEMenor.java) |
| 17 | Faixa de 0 a 9 | [Ex17Faixa0A9.java](src/nivel2/Ex17Faixa0A9.java) |
| 18 | Código por extenso | [Ex18CodigoPorExtenso.java](src/nivel2/Ex18CodigoPorExtenso.java) |
| 19 | Triângulo | [Ex19Triangulo.java](src/nivel2/Ex19Triangulo.java) |
| 20 | Menor vezes maior | [Ex20MenorVezesMaior.java](src/nivel2/Ex20MenorVezesMaior.java) |
| 21 | Positivo ou negativo | [Ex21PositivoOuNegativo.java](src/nivel2/Ex21PositivoOuNegativo.java) |
| 22 | Armazena em A ou B | [Ex22ArmazenaAOuB.java](src/nivel2/Ex22ArmazenaAOuB.java) |

### Nível 3: Estrutura de seleção

| Nº | Exercício | Código |
|:--:|---|---|
| 23 | Menu de operações | [Ex23MenuOperacoes.java](src/nivel3/Ex23MenuOperacoes.java) |
| 24 | Menu com dois números | [Ex24MenuDoisNumeros.java](src/nivel3/Ex24MenuDoisNumeros.java) |
| 25 | Peso ideal | [Ex25PesoIdeal.java](src/nivel3/Ex25PesoIdeal.java) |

### Nível 4: Estruturas de repetição

| Nº | Exercício | Código |
|:--:|---|---|
| 26 | Contagem decrescente de 100 a 1 | [Ex26Decrescente100A1.java](src/nivel4/Ex26Decrescente100A1.java) |
| 27 | Fatoriais | [Ex27Fatoriais.java](src/nivel4/Ex27Fatoriais.java) |
| 28 | Ímpares de 100 a 200 | [Ex28Impares100A200.java](src/nivel4/Ex28Impares100A200.java) |
| 29 | Números de 1 a 2000 | [Ex29UmA2000.java](src/nivel4/Ex29UmA2000.java) |
| 30 | Tabuada | [Ex30Tabuada.java](src/nivel4/Ex30Tabuada.java) |
| 31 | Soma de pares e ímpares | [Ex31SomaParesImpares.java](src/nivel4/Ex31SomaParesImpares.java) |
| 32 | Soma dos quadrados dos ímpares | [Ex32SomaQuadradosImpares.java](src/nivel4/Ex32SomaQuadradosImpares.java) |
| 33 | Média da turma | [Ex33MediaTurma.java](src/nivel4/Ex33MediaTurma.java) |
| 34 | Menor e maior entre positivos | [Ex34MenorMaiorPositivos.java](src/nivel4/Ex34MenorMaiorPositivos.java) |
| 35 | Múltiplos de 10 | [Ex35MultiplosDe10.java](src/nivel4/Ex35MultiplosDe10.java) |
| 36 | Dez valores | [Ex36DezValores.java](src/nivel4/Ex36DezValores.java) |
| 37 | Calculadora com menu | [Ex37CalculadoraComMenu.java](src/nivel4/Ex37CalculadoraComMenu.java) |
| 38 | Salário de operário | [Ex38SalarioOperario.java](src/nivel4/Ex38SalarioOperario.java) |
| 39 | Par, ímpar e sinal | [Ex39ParImparSinal.java](src/nivel4/Ex39ParImparSinal.java) |
| 40 | Índice de poluição | [Ex40IndicePoluicao.java](src/nivel4/Ex40IndicePoluicao.java) |
| 41 | Categoria de nadador | [Ex41CategoriaNadador.java](src/nivel4/Ex41CategoriaNadador.java) |
| 42 | Maior e menor até digitar zero | [Ex42MaiorMenorAteZero.java](src/nivel4/Ex42MaiorMenorAteZero.java) |
| 43 | Grãos de trigo no tabuleiro | [Ex43GraosDeTrigo.java](src/nivel4/Ex43GraosDeTrigo.java) |
| 44 | Menu de conversões | [Ex44MenuConversoes.java](src/nivel4/Ex44MenuConversoes.java) |

### Nível 5: Vetores e matrizes

| Nº | Exercício | Código |
|:--:|---|---|
| 45 | Vetor inverso | [Ex45VetorInverso.java](src/nivel5/Ex45VetorInverso.java) |
| 46 | Produto escalar | [Ex46ProdutoEscalar.java](src/nivel5/Ex46ProdutoEscalar.java) |
| 47 | Comparar vetor com X | [Ex47CompararComX.java](src/nivel5/Ex47CompararComX.java) |
| 48 | Candidatas aptas | [Ex48CandidatasAptas.java](src/nivel5/Ex48CandidatasAptas.java) |
| 49 | Posições iguais em dois vetores | [Ex49PosicoesIguais.java](src/nivel5/Ex49PosicoesIguais.java) |
| 50 | Adivinhe o número | [Ex50AdivinheONumero.java](src/nivel5/Ex50AdivinheONumero.java) |
| 51 | Notas da turma | [Ex51NotasDaTurma.java](src/nivel5/Ex51NotasDaTurma.java) |
| 52 | Contagem de 1, 3 e 4 | [Ex52Conta134.java](src/nivel5/Ex52Conta134.java) |
| 53 | Corrida | [Ex53Corrida.java](src/nivel5/Ex53Corrida.java) |
| 54 | Elementos comuns | [Ex54ElementosComuns.java](src/nivel5/Ex54ElementosComuns.java) |
| 55 | Frase sem espaços | [Ex55FraseSemEspacos.java](src/nivel5/Ex55FraseSemEspacos.java) |
| 56 | Pares e múltiplos de 5 | [Ex56ParesEMultiplosDe5.java](src/nivel5/Ex56ParesEMultiplosDe5.java) |
| 57 | Somente vogais | [Ex57SomenteVogais.java](src/nivel5/Ex57SomenteVogais.java) |
| 58 | Média e maior | [Ex58MediaEMaior.java](src/nivel5/Ex58MediaEMaior.java) |
| 59 | Caracteres entre duas letras | [Ex59CaracteresEntre.java](src/nivel5/Ex59CaracteresEntre.java) |

### Nível 6: Métodos

| Nº | Exercício | Código |
|:--:|---|---|
| 60 | Verifica quadrante | [Ex60VerificaQuadrante.java](src/nivel6/Ex60VerificaQuadrante.java) |
| 61 | Reajuste salarial | [Ex61Reajuste.java](src/nivel6/Ex61Reajuste.java) |
| 62 | Hipotenusa | [Ex62Hipotenusa.java](src/nivel6/Ex62Hipotenusa.java) |
| 63 | Par ou ímpar com método | [Ex63ParOuImparMetodo.java](src/nivel6/Ex63ParOuImparMetodo.java) |
| 64 | Menu com vetor | [Ex64MenuVetor.java](src/nivel6/Ex64MenuVetor.java) |

## Autor

Iago Lima

[GitHub](https://github.com/iagoclima22)
