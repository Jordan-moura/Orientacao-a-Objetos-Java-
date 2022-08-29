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
public class Relacionamentos {
    
    private String tipo;
    private String nomeClasse;

    public Relacionamentos() {
    }  
   

    public Relacionamentos(String tipo, String classe) {
        this.tipo = tipo;
        this.nomeClasse = classe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasse() {
        return nomeClasse;
    }

    public void setClasse(String classe) {
        this.nomeClasse = classe;
    }

    @Override
    public String toString() {
        return "Relacionamentos{" + "tipo=" + tipo + ", classe=" + nomeClasse + '}';
    }
    
}

