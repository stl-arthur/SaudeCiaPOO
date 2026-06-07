package gerenciamento;

import java.util.Scanner;
import pojos.Paciente;

/**
 * 
 * @author cintiasb
 * Classe responsável por gerenciar as operações de cadastro, atualização e remoção de pacientes
 */
public class GerenciarPacientes {
    Scanner scan = new Scanner();
    
    public GerenciarPacientes() {}
       
    /**
     * Cadastra um novo paciente na lista
     * @param listaDePacientes - lista de pacientes do sistema
     */
    public void cadastrarPaciente(ArrayList<Paciente> listaDePacientes) {
        Paciente paciente = new Paciente();

        System.out.println("Nome do paciente:");
        paciente.setNome(scan.next());

        System.out.println("Identificação:");
        paciente.setIdentificacao(scan.next());

        System.out.println("Data de nascimento (dd/mm/aaaa):");
        paciente.setDtNascimento(scan.next());

        System.out.println("Endereço:");
        paciente.setEndereco(scan.next());

        System.out.println("Informações de Contato:");
        paciente.setContato(scan.next());

        System.out.println("Tipo de convênio:\n0 - Particular\n1 - Plano de Saúde");
        int tipo = scan.nextInt();
        paciente.setTipoConvenio(tipo);

        
        listaDePacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    /**
     * Atualiza os dados editáveis de um paciente já existente na lista
     * @param paciente - paciente a ser atualizado
     */
    public void atualizarPaciente(Paciente paciente) {
        int repete = 1;
        while (repete == 1) {
            System.out.println("""
                    Qual informação deseja alterar?
                    1 - Endereço
                    2 - Contato
                    3 - Tipo de convênio
                    """);
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Novo endereço:");
                    paciente.setEndereco(scan.next());
                    break;
                case 2:
                    System.out.println("Novo Contato:");
                    paciente.setContato(scan.next());
                    break;
                case 3:
                    System.out.println("Tipo de convênio:\n1 - Particular\n2 - Plano de Saúde");
                    int tipo = scan.nextInt();
                    paciente.setTipoConvenio(tipo);
                    break;
                default:
                    System.out.println("Opção não listada");
            }

            System.out.println("Deseja alterar mais alguma informação? \n Se sim, digite 1\n Caso contrário, aperte qualquer tecla.");
            repete = scan.nextInt();
        }
        System.out.println("Paciente atualizado com sucesso!");
    }

    /**
     * Remove um paciente da lista
     * @param listaDePacientes - lista de pacientes do sistema
     * @param paciente - paciente a ser removido
     */
    public void removerPaciente(ArrayList<Paciente> listaDePacientes, Paciente paciente) {
        for (int i = 0; i < listaDePacientes.size(); i++) {
            if (listaDePacientes.get(i).equals(paciente)) {
                listaDePacientes.remove(i);
                System.out.println("Paciente removido com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

}