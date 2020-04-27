/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade005;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author yurim
 */
public abstract class Cliente {
    
    /// Variaveis
    protected String nome;
    protected int ID;
    protected String senha;
    protected double saldo;
    protected int tipoconta;

    public Cliente(String nome, int ID, String senha, double saldo, int tipoconta) {
        this.nome = nome;
        this.ID = ID;
        this.senha = senha;
        this.saldo = saldo;
        this.tipoconta = tipoconta;
    }

  
    /// Construtores
    public Cliente(String nome, int ID, String senha, double saldo) {
        this.nome = nome;
        this.ID = ID;
        this.senha = senha;
        this.saldo = saldo;
    }

    public Cliente(String nome, int ID, String senha) {
        this.nome = nome;
        this.ID = ID;
        this.senha = senha;
    }
    
    /// Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }
    
    ///Metodos
    public abstract void sacar(double valor);
    
    public void depositar(double valor){
        if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }else{
            this.saldo += valor;
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
    
    }
    
    public abstract String tipoconta();

    
}
