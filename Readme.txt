Tratamento de Exceção

Neste exemplo, a aplicação irá tentar acessar um índice inexistente,
indice=74, no array de no máximo 50 alunos, causando uma exceção.
Para isso foi implementado o tratamento de exceção.
Dentro do bloco try, tenta executar o comando
System.out.println(alunos[indice]), causando um erro nesse bloco,
será encaminhado para o catch e o comando dentro
do bloco catch será executado, nesse caso
System.out.println ("Aluno inexistente");




