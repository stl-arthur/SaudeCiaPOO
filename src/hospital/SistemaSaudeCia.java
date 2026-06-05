/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;
import java.util.Scanner;
/**
 *
 * @author arthur
 * 
 * Classe Principal, aqui serão feitas todas as operações
 * 
 * --} *REMOVER ESSA PARTE POSTERIORMENTE, PASSOS A SEGUIR SERVEM SOMENTE PARA NOSSO MAPEAMENTO E IDEAÇÃO DURANTE DESENVOLVIMENTO
 * DO CÓDIGO*
 * A ideia na classe principal é deixar uma estrutura onde tudo seja inserido pelo usuário assim que o código estiver rodando
 * serão necessários laços de repetição, a ideia é fazer algo assim:
 * 
 * enquanto continuar programa:
 *  escolha de acesso -> secretaria ou medico
 *  se secretaria:
 *      enquanto opção != 4:
 *          menu com as possibilidades de ação da secretária:
 *          1 gerenciar pacientes
 *          2 gerar relatorio de consulta
 *          3 gerenciar consultas
 *          4 alterar usuario
 * 
 *  se medico:
 *      enquanto opção != 4 :
 *          menu com as possibilidades de ação do medico:
 *          1 gerenciar dados adicionais
 *          2 gerenciar prontuario
 *          3 gerar relatorio medico
 *          4 alterar usuario
 * 
 * {--
 */
public class SistemaSaudeCia {
        
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Paciente pac = new Paciente();
        Medico med = new Medico();
        
        System.out.println("paciente nome: " + pac.getNome());
        System.out.println("Qual o nome do paciente?");
        String nome = scan.nextLine();
        pac.setNome(nome);
        System.out.println("paciente nome: " + pac.getNome());
        pac.setAdicionais();
        //System.out.println("paciente alergias: " + pac.getAdicionais().getAlergias());
        med.gerenciaDadosAdicionais(pac);
        System.out.println("paciente alergias: " + pac.getAdicionais().getAlergias());
        
    }
    
}
