# Prova 2025.2 — Papel vs. Código

Resolução da 2ª prova de Programação Imperativa (2025.2): primeiro no papel, depois no computador, com autocorreção comparando as duas versões.

## Enunciado

Implemente em Java as seguintes funções (e suas respectivas funções auxiliares — modularização):

- **a)** `public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u)` — realiza a união dos vetores A e B gerando o vetor U, sem elementos repetidos. Retorna o tamanho de U. *(1,5 pontos)*
- **b)** `public static void ordenar(int[] v, int n)` — ordena o vetor utilizando o algoritmo **Insertion Sort**. *(1,0 ponto)*
- **c)** `public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr)` — preenche VSR com os elementos de V na mesma ordem, porém sem repetição. Retorna o tamanho de VSR. *(1,5 pontos)*
- **d)** `public static void rotacionar(int[] v, int tam, int k)` — rotaciona os elementos do vetor para a esquerda em `k` posições, in-place (`k` negativo = rotação para a direita). *(1,0 ponto)*

## Metodologia

1. Resolução no papel, cronometrada, sem consulta (caneta azul/preta)
2. Resolução no computador, cronometrada
3. Autocorreção da versão em papel comparando com a solução do computador (caneta vermelha), com pontuação proporcional

## Tempos

| Etapa | Tempo |
|---|---|
| Resolução no papel | 1h48min |
| Resolução no computador | 34min |

## Resultado da autocorreção

| Questão | Peso | Nota | Observação |
|---|---|---|---|
| a) `uniao` + `existeNoVetor` | 1,5 | 1,0 | Lógica correta; função auxiliar declarada como `void` em vez de `boolean` |
| b) `ordenar` | 1,0 | 1,0 | Correta |
| c) `gerarVetorSemRepeticao` | 1,5 | 1,5 | Correta |
| d) `rotacionar` | 1,0 | 0,7 | Lógica e estrutura corretas; encaixe final usou `v[j+2]` em vez de `v[tam-1]` |
| **Total** | **5,0** | **4,2** | |
