/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.editora.ctr;

/**
 *
 * @author evelyn
 */
import br.com.editora.dao.ConexaoDAO;
import java.sql.ResultSet;
import br.com.editora.dto.LivroDTO;
import br.com.editora.dao.LivroDAO;

public class LivroCTR {
    LivroDAO livroDAO = new LivroDAO();
    
    public LivroCTR(){
    
    }
    
    public String inserirLivro(LivroDTO livroDTO){
        try{
            if(livroDAO.inserirLivro(livroDTO)){
                return "Livro cadastrado com sucesso!";
            }else{
                return "Livro não cadastrado.";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Livro não cadastrado. ";
        }
    }
    
    public ResultSet consultarLivro(LivroDTO livroDTO, int opcao){
        
        ResultSet rs = null;
        
        rs = livroDAO.consultarLivro(livroDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}

