Construa o programa abaixo e anexe a solução. Anexe em arquivos separados (header e source).
Um aficcionado por música de 50 anos contratou você para organizar sua biblioteca de músicas. Ele possui músicas armazenadas em arquivos mp3, em CDs e, também, alguns LPs de vinil. Ele quer ser capaz de armazenar todas as músicas em um único Banco de Dados  e poder fazer buscas por título da música, compositor, intérprete, período (ano de início, ano de fim).

Implemente um conjunto de classes em C++ para modelar o contexto de músicas. Faça uma classe base para isso.

- Um arquivo MP3 possui título da música, nome do álbum, compositor, intérprete, ano, tamanho em bytes.
- Uma música num LP possui título, nome do álbum, compositor, intérprete, ano e velocidade (33, 45 ou 78 rotações por minuto).
- Uma música em CD possui título, nome do álbum, compositor, intérprete e ano.

Implemente a classe BancoDeDados, que terá apenas uma lista de músicas (utilize vector). Além disso, essa classe deve disponibilizar as seguintes funções:

- Adicionar músicas, baseado no seu tipo (MP3, LP ou CD), nessa biblioteca.
- Remover uma música através do título.
- Realizar busca por músicas através do ano, exiba a relação na tela.
- Realizar busca por músicas através do compositor.

Escreva um programa main() que crie um objeto do tipo banco de dados e, conforme já feito nos exercícios anteriores, crie um menu que permita:

    1. adicionar músicas, baseado no seu tipo (MP3, LP ou CD), nesse banco de dados.
    2. remover uma música através do título.
    3. realizar busca por músicas através do ano, exiba a relação na tela.
    4. realizar busca por músicas através do compositor.
    5. encerrar o programa.
   
A impressão deve mostrar as informações armazenadas em todos os atributos dos objetos. Utilize os conceitos de herança, polimorfismo, ponteiros e construtores.

BÔNUS: Após os testes, você deverá pensar e criar uma nova classe filha do contexto musical - Defina um nome e quais os atributos que essa classe deverá ter (Dica.: qual a forma atual mais consumida de música?). Faça as modificações necessárias no programa principal para considerar essa nova classe criada por você.
