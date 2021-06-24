package cursoBr.excecao;

import cursoBr.construtor.Aluno;

public class Excecao {

    public static void main(String[] args) {
        System.out.println("Rodando o sistema");

        Aluno[] alunos = new Aluno[50];

        int indice = 74; // definindo o valor do índice que vamos acessar

        // tratamento de exceção
        try {
            // tenta executar esse comando
            System.out.println(alunos[indice]);
        }catch (ArrayIndexOutOfBoundsException erro){
            // se houver algum erro no bloco anterior
            // esse comando será executado
            System.out.println("Aluno inexistente");
        }catch (Exception erro) {
            // pode-se usar um catch para cada tipo de erro
            // possível no bloco try
            System.out.println("exceção inesperada");
        }finally {
            // esse comando será executado sempre
            System.out.println("executou o finally");
        }
    }
}
