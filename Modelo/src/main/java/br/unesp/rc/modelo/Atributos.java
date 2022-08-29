/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.modelo;

/**
 *
* @author JRM
* @author BdOC
 */
public class Atributos {
   
   private String modificador;
   private String tipo;
   private String nome;

    public Atributos() {
    }

    public Atributos(String modificador, String tipo, String nome) {
        this.modificador = modificador;
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getModificador() {
        return modificador;
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Atributos{" + "modificador=" + modificador + ", tipo=" + tipo + ", nome=" + nome + '}';
    }
}