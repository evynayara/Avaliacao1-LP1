/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.editora.dto;

import javax.swing.JTextField;

/**
 *
 * @author evelyn
 */
public class LivroDTO {
    
    private String titulo_liv, genero_liv, autor_liv, editora_liv, email_liv, descricao_liv;
    private int isbn_liv, anopublicacao_liv, numpaginas_liv;

    public String getTitulo_liv() {
        return titulo_liv;
    }

    public void setTitulo_liv(String titulo_liv) {
        this.titulo_liv = titulo_liv;
    }

    public String getGenero_liv() {
        return genero_liv;
    }

    public void setGenero_liv(String genero_liv) {
        this.genero_liv = genero_liv;
    }

    public String getAutor_liv() {
        return autor_liv;
    }

    public void setAutor_liv(String autor_liv) {
        this.autor_liv = autor_liv;
    }

    public String getEditora_liv() {
        return editora_liv;
    }

    public void setEditora_liv(String editora_liv) {
        this.editora_liv = editora_liv;
    }

    public int getAnopublicacao_liv() {
        return anopublicacao_liv;
    }

    public void setAnopublicacao_liv(int anopublicacao_liv) {
        this.anopublicacao_liv = anopublicacao_liv;
    }

    public String getEmail_liv() {
        return email_liv;
    }

    public void setEmail_liv(String email_liv) {
        this.email_liv = email_liv;
    }

    public String getDescricao_liv() {
        return descricao_liv;
    }

    public void setDescricao_liv(String descricao_liv) {
        this.descricao_liv = descricao_liv;
    }

    public int getIsbn_liv() {
        return isbn_liv;
    }

    public void setIsbn_liv(int isbn_liv) {
        this.isbn_liv = isbn_liv;
    }

    public int getNumpaginas_liv() {
        return numpaginas_liv;
    }

    public void setNumpaginas_liv(int numpaginas_liv) {
        this.numpaginas_liv = numpaginas_liv;
    }

    public void setTitulo_liv(JTextField titulo_liv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
