package com.br.gui.estoqueapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {

    private Integer id;
    private String nomecategoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomecategoria() {
        return nomecategoria;
    }

    public void setNomecategoria(String nomecategoria) {
        this.nomecategoria = nomecategoria;
    }
}
