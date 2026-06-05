/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;
import java.util.Scanner;
/**
 *
 * @author arthur
 */
public class Medico {
    
    Scanner scan = new Scanner(System.in);
    
    public void gerenciaDadosAdicionais(Paciente paciente){
        System.out.println("Alergias: ");
        String alergia = scan.nextLine();
        paciente.getAdicionais().setAlergias(alergia);
    }
}
