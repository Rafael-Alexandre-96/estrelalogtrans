package br.com.estrelalogtrans.domain.model.composition;

import java.io.Serializable;
import java.util.Date;

public class CNH implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String numeroRegistro;
    private CategoriaCNH categoriaCNH;
    private String codigoSeguranca;
    private Date validade;
    private Date primeiraHabilitacao;
    private Date dataEmissao;
    private Boolean possuiMopp = false;

    public String getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public CategoriaCNH getCategoriaCNH() {
        return categoriaCNH;
    }
    public void setCategoriaCNH(CategoriaCNH categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }
    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }
    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    public Date getPrimeiraHabilitacao() {
        return primeiraHabilitacao;
    }
    public void setPrimeiraHabilitacao(Date primeiraHabilitacao) {
        this.primeiraHabilitacao = primeiraHabilitacao;
    }
    public Date getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public Boolean getPossuiMopp() {
        return possuiMopp;
    }
    public void setPossuiMopp(Boolean possuiMopp) {
        this.possuiMopp = possuiMopp;
    }


    public enum CategoriaCNH {
        A,
        B,
        C,
        D,
        E,
        AB,
        AC,
        AD,
        AE
    }
}