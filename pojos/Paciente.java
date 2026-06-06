/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

/**

 * Classe relacionada ao Paciente, aqui guardaremos todas suas informações, e também, seu prontuário e informações adicionais,
 * essas, tem suas classes em específico
 */
public class Paciente {
    private String nome;
    private String identificacao;
    private String dtNascimento;
    private String endereco;
    private String infoContato;
    private String tipoConvenio;
    private Prontuario prontuario;
    private InfoAdicionais adicionais;

    public Paciente() {
    }

    public Paciente(String nome, String identificacao, String dtNascimento, String endereco, String infoContato, String tipoConvenio, Prontuario prontuario, InfoAdicionais adicionais) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.infoContato = infoContato;
        this.tipoConvenio = tipoConvenio;
        this.prontuario = prontuario;
        this.adicionais = adicionais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
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

    public String getInfoContato() {
        return infoContato;
    }

    public void setInfoContato(String infoContato) {
        this.infoContato = infoContato;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public InfoAdicionais getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(InfoAdicionais adicionais) {
        this.adicionais = adicionais;
    }

     
    
}
