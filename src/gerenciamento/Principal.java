/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;
import pojos.Paciente;
import pojos.Consulta;
import pojos.Medicos;
import pojos.Prontuario;
import java.util.Scanner;
import relatorios.GerarRelatorioMedico;
/**
 *
 * @author arthur
 */
public class Principal {
    public static void main(String[] args){
        Paciente pac = new Paciente();
        Scanner scan = new Scanner(System.in);
        pac.setNome("teste");
        
        
        GerenciaDadosAdicionais gen = new GerenciaDadosAdicionais();
        int repete = 1;
        
        while (repete == 1){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 Adicionar\n2 Alterar\n3 Excluir\n4 Exibir");
            int opcao = scan.nextInt();
            scan.nextLine(); //limpa o buffer do teclado
            switch(opcao){
                case 1:
                    gen.CadastraDadosAdicionais(pac);
                    break;
                case 2:
                    gen.AtualizaDadosAdicionais(pac);
                    break;
                case 3:
                    System.out.println("not ready");
                case 4:
                    System.out.println("DADOS ADICIONAIS\n" + 
                    pac.getAdicionais().getAlergia() + "\n" +
                    pac.getAdicionais().getCirurgia() + "\n" +
                    pac.getAdicionais().isBebe() + "\n" +
                    pac.getAdicionais().isFuma());
                default:
                    System.out.println("Opção não listada!");
            }
            
            System.out.println("Continuar? (1 ou 0)");
            repete = scan.nextInt();
            scan.nextLine(); //limpa o buffer do teclado
        }
                
    }
        
        
        
}
