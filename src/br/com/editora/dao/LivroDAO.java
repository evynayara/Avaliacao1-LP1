/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.editora.dao;

/**
 *
 * @author evelyn
 */
import java.sql.*;
import br.com.editora.dto.LivroDTO;

public class LivroDAO {
    
    //método construtor da classe
    public LivroDAO(){
    
    }
    
    private ResultSet rs = null;
    
    private Statement stmt = null;
    
    public boolean inserirLivro(LivroDTO livroDTO){
        try{
            ConexaoDAO.ConectDB();;
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into livro (titulo_liv, genero_liv, autor_liv, editora_liv,"
                    + "anopublicacao_liv, numpaginas_liv, email_liv, descricao_liv) values ("
                    + "'" + livroDTO.getTitulo_liv() + "',"
                    + "'" + livroDTO.getGenero_liv() + "',"
                    + "'" + livroDTO.getAutor_liv() + "',"
                    + "'" + livroDTO.getEditora_liv() + "',"
                    + livroDTO.getAnopublicacao_liv() + ","
                    + livroDTO.getNumpaginas_liv() + ","
                    + "'" + livroDTO.getEmail_liv() + "',"
                    + "'" + livroDTO.getDescricao_liv() + "')";
            
            stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }// fecha inserir Livro
    
    
    
    public ResultSet consultarLivro(LivroDTO livroDTO, int opcao){
        try{
            ConexaoDAO.ConectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch(opcao){
                case 1: 
                    comando = "Select l.*" +
                              " from livro l " +
                              "where titulo_liv like '" + livroDTO.getTitulo_liv() + "%'" + 
                              " order by l.titulo_liv";
                break;
                case 2: 
                    comando = "Select l.* " + 
                              "from livro l " +
                              "where l.isbn_liv = " + livroDTO.getIsbn_liv();
                break;
                case 3: 
                    comando = "Select l.isbn_liv, l.titulo_liv " +
                              "from livro l";
                break;
                      
            }
            
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return rs;
        }
    }//fecha consultarLivro
    
}//fecha LivroDAO
