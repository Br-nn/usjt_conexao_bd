/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bruno._usjt_crud_pessoas;

/**
 *
 * @author 82311358
 */
public class TestConexao {
    public static void main(String[] args) throws Exception {
        var factory = new ConnectionFactory();
        var minhaConexao = factory.conectar();
        System.out.println("Conectou!!");
    }
}
