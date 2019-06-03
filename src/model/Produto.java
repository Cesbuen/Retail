/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = -6580012241620579129L;

    @Id
    @SequenceGenerator(name = "PRODUTO_SEQ", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
    @GeneratedValue
    private int codigoProduto;
    private String nomeProduto;
    private String categoriaProduto;
    private int quantidadeProduto;

    public Produto() {
    }

    ;
    
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
}
