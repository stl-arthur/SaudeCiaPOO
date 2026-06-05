/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;
/**
 *
 * @author arthur
 * 
 * Classe de informações adicionais, separada do cliente para melhor controle de acesso por parte do médico e também 
 * para que a classe de Paciente fique mais limpa
 */
public class InfoAdicionais {
    private String habitos;
    private String condSaude;
    private String alergias;
    
    
    public InfoAdicionais(){
    }

    public InfoAdicionais(String habitos, String condSaude, String alergias) {
        this.habitos = habitos;
        this.condSaude = condSaude;
        this.alergias = alergias;
    }
    
    public void setHabitos(String habitos){
        this.habitos = habitos;
    }
    
    public String getHabitos(){
        return habitos;
    }
    
    public void setCondSaude(String condSaude){
        this.condSaude = condSaude;
    }
    
    public String getCondSaude(){
        return condSaude;
    }
    
    public void setAlergias(String alergias){
        this.alergias = alergias;
    }
    
    public String getAlergias(){
        return alergias;
    }
}
