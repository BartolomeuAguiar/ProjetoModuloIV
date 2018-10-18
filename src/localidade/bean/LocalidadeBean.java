/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localidade.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import setor.bean.SetorBean;
import servidor.bean.ServidorBean;

/**
 *
 * @author barto
 */
@Entity
public class LocalidadeBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @ManyToOne
    private SetorBean setorResponsavel;
    @OneToOne
    private ServidorBean responsavel;
    private Boolean ativo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SetorBean getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(SetorBean setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public ServidorBean getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ServidorBean responsavel) {
        this.responsavel = responsavel;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
