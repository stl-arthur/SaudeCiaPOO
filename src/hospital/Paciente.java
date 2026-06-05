/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author arthur
 * 
 * Classe relacionada ao Paciente, aqui guardaremos todas suas informações, e também, seu prontuário e informações adicionais,
 * essas, tem suas classes em específico
 */
public class Paciente {
    private String nome;
    private String sexo;
    private String dtNascimento;
    private String endereco;
    private String contato;
    private String convenio;
    private Prontuario prontuario;
    private InfoAdicionais adicionais;

    public Paciente() {
    }

    public Paciente(String nome, String sexo, String dtNascimento, String endereco, String contato, String convenio, Prontuario prontuario, InfoAdicionais adicionais) {
        this.nome = nome;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.convenio = convenio;
        this.prontuario = prontuario;
        this.adicionais = adicionais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    protected Prontuario getProntuario() {
        return prontuario;
    }

    protected void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    protected InfoAdicionais getAdicionais() {
        return adicionais;
    }

    protected void setAdicionais(InfoAdicionais adicionais) {
        this.adicionais = adicionais;
    }
    
    
    
}
