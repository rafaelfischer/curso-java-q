# /curso-c-q
Treinamento de Linguagem Java contendo diversos exercícios afim de treinar programação/codificação do básico.

<details open>
  <summary>
   Instalação e Uso do Git (essencial)
  </summary>
  
## Primeiro passo (Git):
Instalar o [Github desktop](https://github.com/apps/desktop) \
Seguir o passo a passo de instalação.

## Fluxo básico
### Novos projetos:
1. Fazer o clone de um repositório
2. Pull (baixar a versão mais recente)
3. Comece a produzir alterações, incluir diretórios e arquivos ao projeto.
4. Após o passo acima, 'Add to Stage' (adicionar a área de stage/pré-commit)
5. Uma vez adicionado ao Stage e concluindo o trabalho do momento, realizar o 'Commit' (dizer ao git que se quer fechar uma versão e subir ao controlador de versão)
6. Concluída a versão ou o 'Commit', realizar o Push (subir para o repositório remoto - Github)

### Projeto existente
Mesmo fluxo anterior, pulando o passo 1.

## Conhecendo o Git
Separe um tempo e conheça mais sobre o Git, é muito interessante e necessário para quem é desenvolvedor de software, assim como você está buscando ser ou se aperfeiçoando para.
Veja mais detalhes em vídeos no youtube ou me pergunte que fornecer mais [informações](https://docs.github.com/pt/get-started/using-git/about-git).
Tem o [básico do Git](https://git-scm.com/book/pt-br/v2/Come%C3%A7ando-O-B%C3%A1sico-do-Git) que é bem interessante também. Tem opções de vídeo também, porém em inglês - [Link](https://git-scm.com/videos).

</details>

## Desenvolvendo em Linguagem Java
- Instale o JDK
- Instale o VSCode
- Instale o Extension Java Package

Estrutura de diretórios:
- exercicios/
  - Grupo de Exercícios 1:
    (Tipos, Variáveis e Constantes)
    - Escrever na tela Ola Mundo
    - Perguntar o nome de quem está usando o programa e sua idade. Faça duas perguntas.
    - Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética(média simples), exibindo no final.
    - Calcule o quadrado de um número. Pergunte o número, calcule e exiba no final o resultado.
    - Calcule a área de um quadrado. Como calcular: Area = lado * lado
    - Calcule a área de um círculo com base no raio informado. Como calcular: A = PI . R ao quadrado
    - Calcule a área de um retângulo. Area = comprimento * altura
    - (DESAFIO DA SEMANA): Você está montando um cadastro para uma empresa de vendas na internet, e precisa fornecer este "formulário de dados de clientes". Não se preocupe neste momento se irá ou não guardar
    este dado em algum lugar. Pergunte e obtenha os seguintes dados e depois exiba todos na tela:
      - Nome Completo
      - Data de Nascimento
      - Cidade/País de Origem(Nascimento)
      - Endereço completo de onde mora
      - País onde reside
      - Data do Cadastro
      - Escolaridade: (Ensino Básico/Ensino Fundamental/Ensino Superior)

  - Grupo de Exercícios 2:
    (Condicionais)
    - Pergunte um número. Diga se este numero é par ou ímpar, escrevendo na tela.
    - Pergunte um número. Diga se este numero é primo ou não, escrevendo na tela.
    - Pergunte um número. Diga se este numero faz parte da tabuada do 3, escrevendo na tela.
    - Pergunte a data de nascimento e verifique se a data atual é a data de aniversário. Se for, printe a mensagem de Feliz Aniversário, senão printe a mensagem hoje e dia X de Y de ZZZZ.
    - Pergunte dados de um produto (Nome, Fabricante, Preço). Caso o mesmo inicie com uma vogal, acrescente *** (3 asteriscos) ao nome do produto. Ao final exiba todos os dados do produto.

  - Grupo de Exercícios 3:
    (Loops)
    - Faça um programa que mostra os números de 0 a 100.
    - Faça um programa que pergunte um número. Exiba os números de 0 até o número digitado, separados por um espaço, exibindo o resultado.
    - Faça um programa que exiba de 0 a 100, somente os números pares, e exiba o resultado.
    - Faça um programa que exiba de 0 a 100, somente os números ímpares e não divísiveis por 5, e exiba o resultado.
    - Faça um programa que exiba de 0 a 100, somente os números primos, e exiba o resultado.
    - Faça um programa que some de 0 a 100 os números pares, e exiba o resultado.
    - Faça um programa que some de 0 a 100 somente os números primos, e exiba o resultado.
    - Calcule o fatorial de um número. Pergunte o número, faça o loop e exiba o resultado no final.
    - (DESAFIO DA SEMANA): Faça um programa que pergunte os dados de X produtos (Nome, Fabricante, preço). O programa deve perguntar até que o programa perceba que não é necessário mais perguntar.
    Pense em uma válvula de escape, após perguntar os dados de um produto se deseja cadastrar um próximo. Se sim cadastre os produtos e fique com esta opcao até que não se deseje mais cadastrar um.
    Ao final, exiba todo o catálogo de produtos criado.
      
  - Grupo de Exercícios 4:
    (Array e Matrizes)
    - Faça um programa que guarde os números de 0 a 100 somente divisíveis por 2.
    - Faça um programa que pergunte um número. Guarde os números de 0 até o número digitado em um array. Crie a somatória para os números pares e ímpares deste grupo, e exiba a somatória.
    - Faça um programa que some de 200 a 500, somente os números pares, e exiba o resultado.
    - Faça um programa que pergunte o valor de 4 produtos. Agora aplique um desconto de 10% ao valor de cada produto. Ao final, exiba o valor de cada produto, o valor do desconto e o valor de cada produto com o desconto aplicado. 
    - Faça um programa que exiba de 0 a 100, somente os números primos, e exiba o resultado.
    - Faça um programa que some de 0 a 100 os números pares, e exiba o resultado.
    - (DESAFIO DA SEMANA): Faça um programa que pergunte os dados de X produtos (Nome, Fabricante, preço, Categoria - crie um grupo de categorias como: Comida, Roupas, Eletrônicos, Livros). O programa deve perguntar até que o programa perceba que não é necessário mais perguntar.
    Pense em uma válvula de escape, após perguntar os dados de um produto se deseja cadastrar um próximo. Se sim cadastre os produtos e fique com esta opcao até que não se deseje mais cadastrar um.
    Ao final, exiba todo o catálogo de produtos criado, exibindo por categoria.

  
> [!NOTE]
> Estrutura de um programa em C\
> O nome do programa neste exemplo é: nome_do_programa, e o nome do arquivo a ser salvo é: nome_do_programa.java\
> Deve ser utilizado palavras em minúsculo, de preferência sem números, e obrigatoriamente sem caractéres especiais, acentos e espaços.


```C
/*
  Bloco de comentarios
  Objetivo do programa: Programa generico
  Data da criacao: 2025-08-28
  Criado por: @programacaomentoria
*/
//inclusao da principal biblioteca para manipulacao de entrada e saida (I/O)
// caso o arquivo esteja dentro de pastas, use a estrutura dentro do codigo abaixo:
// package exercicios.grupo_1.exercicio1;

//declaracao da rotina main
int main() {

    //duas barras, sinal de comentario
    //para comentarios como blocos, utilizar /* */

    //definindo constante PI
    const float PI = 3.141592654;

    //variavel inteiro
    int idade;

    //variavel float, já atribuindo valores para a variável
    float percentualDesconto = 10.5;

    //chamada de funcao para escrever algo na saída padrão / tela
    System.out.printf("Hello World!");
}

```
Exemplo de programa, escrevendo na tela e perguntando uma informação para ser digitada pelo usuário
```c
// use a biblioteca Scanner para entrada de dados
import java.util.Scanner;

int main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Voce tem " + idade + " anos.");
}
```

