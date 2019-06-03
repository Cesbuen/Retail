/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = -6580012241620579129L;

    @Id
    @SequenceGenerator(name = "PRODUTO_SEQ", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "PRODUTO_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "prod_codigoProduto", nullable = false)
    private Long    codigoProduto;
    @Column(name = "prod_nomeProduto", length = 255, nullable = false)
    private String  nomeProduto;
    @Column(name = "prod_categoriaProduto", length = 55, nullable = false)
    private String  categoriaProduto;
    @Column(name = "prod_quantidadeProduto", nullable = false)
    private int     quantidadeProduto;

    public Produto() {
    }

    public Produto(Long codigoProduto, String nomeProduto, String categoriaProduto, Integer quantidadeProduto) {
        this.codigoProduto      = codigoProduto;
        this.nomeProduto        = nomeProduto;
        this.categoriaProduto   = categoriaProduto;
        this.quantidadeProduto  = quantidadeProduto;
    }
    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
      @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codigoProduto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigoProduto, other.codigoProduto)) {
            return false;
        }
        return true;
    }
    
    /*
    public Produto() {
    }
    
    public Produto(String nomeProduto, String categoriaProduto, Integer quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.categoriaProduto = categoriaProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
     */
}
