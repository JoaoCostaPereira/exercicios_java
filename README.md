# exercicios_java
Exercícios java
Exercise 1 - Sorting Balls

Objetivo do exercício:

-Desenvolver um programa em Java para ordenar um conjunto indeterminado de bolas saidas de um total de 60 bolas, numeradas de 0 a 59.

Solução encontrada:

- O programa que desenvolvi ordena um conjunto de bolas por ordem crescente. Como pedido no exercício, não foi usado nenhum método de ordenação presento no Java Develepment Kit

- Como o número de bolas que poderão sair é indeterminado, optei por usar um ArrayList em vez de um array uma vez que o array tem um tamanho fixo. Neste caso o tamanho máximo é 60, no entanto usando um array com tamanho 60 e percorrendo-o para o preencher (simbolizando as bolas saidas) o número de bolas saídas já não seria indeterminado.

- Criei um método que tem como parametro um ArrayList de inteiros, com o nome de sortRack. É neste método que é feita a ordenação das bolas saidas por ordem crescente. O que o método faz é percorrer o ArrayList, fazendo duas iterações para comparar cada bola com as restantes. Caso encontre uma bola de valor mais pequeno será feita a troca de posição no rack.

Solução mais optimizada/correta:

- O ideal seria permitir que o utilizador introduzisse as bolas, lendo o input do teclado e preenchendo um array com os valores introduzidos, fazendo a validação do valor das bolas, ou seja, garantir que os valores introduzidos se encontram entre 0 e 59. Neste caso o tamanho do array seria determinado.
A minha dúvida nesta abordagem está na interrupção do ciclo usado para permitir a introdução das bolas. Poderia ser feito usando uma variável de contagem (começando em 1) e usando um ciclo que termina até a variável atingir o valor 60 ou até um determinado caracter especial ser introduzido pelo utilizador. Dentro do ciclo seria preenchido o array (correspondente ao rack) com os valores introduzidos.
