/package DPCRHMOZ2023;

import java.util.Scanner;

public class DPCRHMOZ2023 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nomeFuncionario;
            String categoria;
            String funcoes;
            int anoNascimento;
            int anoIngressoFuncaoPublica;
            int idade;
            int anoAtual;
            int tempoServico;
            
            System.out.print("Digite Nome_funcionario: ");
            nomeFuncionario = scanner.nextLine();
            
            System.out.print("Digite Categoria: ");
            categoria = scanner.nextLine();
            
            System.out.print("Funcoes: ");
            funcoes = scanner.nextLine();
            
            System.out.print("Ano_nascimento: ");
            anoNascimento = scanner.nextInt();
            
            System.out.print("Ano_ingresso_funcao_publica: ");
            anoIngressoFuncaoPublica = scanner.nextInt();
            
            System.out.print("Ano_atual: ");
            anoAtual = scanner.nextInt();
            
            // Processamento
            idade = anoAtual - anoNascimento;
            System.out.println("Idade: " + idade);
            
            tempoServico = anoAtual - anoIngressoFuncaoPublica;
            System.out.println("Tempo servico:" + tempoServico);
            
            // Saída
            if (idade >= 60) {
                System.out.println("Esta legível para aposentadoria Obrigatória");
            } else if (tempoServico >= 35) {
                System.out.println("Esta legível para aposentadoria Opcional");
            } else {
                System.out.println("Ainda não está legível para aposentadoria");
            }
        }
    }
}
