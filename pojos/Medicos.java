/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

public class Medicos {
    private String nome;
    private String crm;
    private String especialidade;
    private String infoContato;
    
    public Medicos(){
    }
    
    public Medicos(String nome, String crm, String especialidade, String infoContato){
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.infoContato = infoContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getInfoContato() {
        
        return infoContato;
    }

    public void setInfoContato(String infoContato) {
        this.infoContato = infoContato;
    }
    
    
    
}
