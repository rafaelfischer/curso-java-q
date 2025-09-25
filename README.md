# /curso-java-q
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
// package Exercicios.Grupo_1.Exercicio1;

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


=================
=   Exercicios  =
=================
OK  1	 - Pergunte um número. Diga se este numero é par ou ímpar, escrevendo na tela.
OK  2	 - Pergunte um número. Diga se este numero é primo ou não, escrevendo na tela.
OK  3	 - Pergunte um número. Diga se este numero faz parte da tabuada do 3, escrevendo na tela.
OK  4	 - Pergunte a data de nascimento e verifique se a data atual é a data de aniversário. Se for, printe a mensagem de Feliz Aniversário, senão printe a mensagem hoje e dia X de Y de ZZZZ.
OK  5	 - Pergunte um número. Diga se esse número é positivo, negativo ou zero.
OK  6	 - Pergunte a idade de uma pessoa. Diga se essa pessoa é uma criança (até 12 anos), um adolescente (13 a 17 anos), uma adulta (18 a 59 anos) ou idosa (60 anos ou mais)
OK  7	 - Pergunte um número de 1 a 7. Diga a qual dia da semana esse número é correspondente (1 = Domingo, 2 = Segunda, ..., 7 =Sábado). Atenção, utilize a estrutura CASE.
OK  8	 - Pergunte a nota de um aluno (de 0 a 10). Diga se o aluno está reprovado (nota < 5), em recuperação (nota entre 5 e 6.9) ou aprovado (nota ≥ 7)
OK  9  - Pergunte o número do mês (1 a 12). Diga quantos dias ele tem (ano não bissexto). Atenção, utilize a estrutura CASE.
OK  10 - Pergunte três números. Diga qual é o maior entre eles. Atenção, utilize a estrutura IF.
OK  11 - Pergunte uma letra (V, A, B). Diga a cor correspondente (Vermelho, Azul, Branco). Atenção, utilize a estrutura CASE.
OK  12 - Verificar Idade para Votar: Crie um algoritmo que receba a idade de uma pessoa e informe se ela já pode votar (idade igual ou superior a 16 anos).
OK  13 - Sinal do Número: Desenvolva um algoritmo que solicite um número e diga se ele é positivo, negativo ou zero.
OK  14 - Média de Aprovação: Um aluno é aprovado se sua média final for igual ou superior a 7. Peça a nota do aluno e informe se ele foi "Aprovado" ou "Reprovado".
OK  15 - Maior de Dois Números: Dados dois números inteiros, determine qual deles é o maior ou se são iguais.
OK  16 - Faixa Etária Simples: Peça a idade de uma pessoa e classifique-a como "Criança" (até 12 anos), "Adolescente" (13 a 17 anos) ou "Adulto" (18 anos ou mais).
OK  17 - Desconto por Compra: Uma loja oferece 10% de desconto se o valor da compra for superior a R$100,00. Leia o valor da compra e mostre o valor final com ou sem desconto.
OK  18 - Dia da Semana: Peça um número de 1 a 7 e imprima o nome do dia da semana correspondente (1 para Domingo, 2 para Segunda, etc.). Se o número for inválido, informe.
OK  19 - Conceito por Nota: Com base na nota de um aluno (0 a 100), atribua um conceito: 
          90-100: A
          80-89: B
          70-79: C
          60-69: D
          Abaixo de 60: F
OK  20 - Acesso ao Sistema: Um sistema requer que a senha tenha no mínimo 6 caracteres. Peça uma senha e informe se ela é "Válida" ou "Inválida".
OK  21 - Permissão para Dirigir: Uma pessoa pode dirigir se tiver 18 anos ou mais E possuir CNH. Peça a idade e se possui CNH (sim/não) e informe se a pessoa pode ou não dirigir.
OK  22 - Login com Credenciais: Crie um algoritmo que verifique se um nome de usuário (ex: "admin") E uma senha (ex: "1234") estão corretos para conceder acesso.
OK  23 - Condição de Crédito: Um cliente pode obter crédito se tiver renda mensal acima de R$2000,00 OU se tiver um bom histórico de crédito (digite "bom" ou "ruim"). Informe se o crédito é "Aprovado" ou "Negado".
OK  24 - Ano Bissexto: Um ano é bissexto se for divisível por 400 OU se for divisível por 4 E não for divisível por 100. Peça um ano e verifique se ele é bissexto.
OK  25 - Temperatura Ideal para Atividade: Para praticar um esporte ao ar livre, a temperatura deve estar entre 10°C E 30°C (inclusive). Peça a temperatura e informe se é "Ideal para o esporte" ou "Não ideal".
OK  26 - Verificar Vogal: Peça um caractere e verifique se ele é uma vogal (a, e, i, o, u), considerando letras maiúsculas e minúsculas. Use o operador OU.
OK  27 - Número no Intervalo: Verifique se um número inteiro fornecido pelo usuário está entre 1 e 10 (1 e 10 não são contados).
OK  28 - Exclusão de Desconto: Um desconto de 15% é aplicado, EXCETO se o produto for da categoria "Eletrônicos" E o valor for inferior a R$500. Peça a categoria e o valor, e diga se o desconto se aplica. (Use NÃO ou negue a condição do E)
OK  29 - Critério de Doação de Sangue: Uma pessoa pode doar sangue se tiver entre 18 E 69 anos E pesar no mínimo 50 kg. Peça idade e peso e informe se a pessoa pode doar.
OK  30 - Aceitar Convite: Um convite será aceito se a pessoa for "amigo" OU for "familia" E estiver disponível. Peça o tipo de relação e a disponibilidade ("sim"/"não").
OK  31 - Classificação de Triângulos: Dados três valores que representam os lados de um triângulo, determine:
        - Se eles formam um triângulo (a soma de dois lados deve ser sempre maior que o terceiro lado).
        - Se for um triângulo, classifique-o como ""Equilátero"" (todos os lados iguais), ""Isósceles"" (dois lados iguais) ou ""Escaleno"" (todos os lados diferentes)."
OK  32 - Preço de Passagem Aérea: O preço da passagem aérea depende da classe (econômica, executiva) E se há promoção.
        - Econômica: R$ 500 (normal), R$ 300 (promoção)
        - Executiva: R$ 1500 (normal), R$ 1000 (promoção)
        Peça a classe e se há promoção (""sim""/""não"") e informe o preço.
OK  33 - Validação de Data: Crie um algoritmo que verifique se uma data (dia, mês, ano) é válida. Considere meses com 30, 31 dias e fevereiro (29 em ano bissexto, 28 nos outros). Não precisa validar anos negativos ou meses fora de 1-12.
OK  34 - Cálculo de Bônus: Um funcionário recebe bônus se atingir uma meta de vendas (vendas >= 10000) OU se tiver mais de 5 anos de empresa. Se ambas as condições forem verdadeiras, o bônus é dobrado. Peça as vendas e os anos de empresa, e calcule o bônus (bônus base R$500).
OK  35 - Decisão de Compra Online: Um usuário decide comprar um item online se o preço for menor que R$100 OU se o frete for grátis E o estoque for maior que zero. Peça o preço, se o frete é grátis ("sim"/"não") e a quantidade em estoque, e informe se o usuário irá "Comprar" ou "Não comprar".
OK  36 - Pergunte o valor de uma compra. Se for maior que R$ 100, aplique 10% de desconto. Caso contrário, não aplique desconto. Atenção, utilize a estrutura IF.
