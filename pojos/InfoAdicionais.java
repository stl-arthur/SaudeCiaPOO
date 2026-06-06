/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;
/**

 * Classe de informações adicionais, separada do cliente para melhor controle de acesso por parte do médico e também 
 * para que a classe de Paciente fique mais limpa
 */
public class InfoAdicionais {
    private Paciente paciente;
    private boolean fuma,bebe,colesterol,doencaCardiaca;
    private String cirurgias;
    private String alergias;
    
    
    public InfoAdicionais(){
    }

    public InfoAdicionais(Paciente paciente, String condSaude, String alergias) {
        this.paciente = paciente;
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
