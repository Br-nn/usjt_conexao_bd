/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bruno._usjt_crud_pessoas;

import javax.swing.JOptionPane;

/**
 *
 * @author 82311358
 */
public class TestConexao {
    public static void main(String[] args) throws Exception {
       try{
        var factory = new ConnectionFactory();
        var minhaConexao = factory.conectar();
        System.out.println("Conectou!!");
    }    
    catch(Exception e) {
    JOptionPane.showMessageDialog(null, "Conexão falhou!  Erro: " + e);   
       }       
    }
}
