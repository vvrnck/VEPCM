package com.uff.br.entities;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
//import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
//@Table(name = "tipo_funcionario")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TipoFuncionario.findAll", query = "SELECT t FROM TipoFuncionario t")
        , @NamedQuery(name = "TipoFuncionario.findById", query = "SELECT t FROM TipoFuncionario t WHERE t.id = :id")
        , @NamedQuery(name = "TipoFuncionario.findByTipo", query = "SELECT t FROM TipoFuncionario t WHERE t.tipo = :tipo")
        , @NamedQuery(name = "TipoFuncionario.findByDescricao", query = "SELECT t FROM TipoFuncionario t WHERE t.descricao = :descricao")})
public class TipoFuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    //@Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    //@Size(min = 1, max = 45)
    //@Column(name = "tipo")
    private String tipo;
    //@Size(max = 45)
    //@Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionario")
    private Collection<Funcionario> funcionarioCollection;

    public TipoFuncionario() {
    }

    public TipoFuncionario(Integer id) {
        this.id = id;
    }

    public TipoFuncionario(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public Collection<Funcionario> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
        this.funcionarioCollection = funcionarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoFuncionario)) {
            return false;
        }
        TipoFuncionario other = (TipoFuncionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TipoFuncionario[ id=" + id + " ]";
    }

}
