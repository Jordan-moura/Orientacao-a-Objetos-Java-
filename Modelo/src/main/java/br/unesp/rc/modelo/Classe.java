/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author JRM
 * @author BdOC
 */
public class Classe {
    
    private String nomeClasse; 
    private String nomePacote;
    private List<Atributos> atributos = new ArrayList<>();
    private List<Relacionamentos> relacionamentos = new ArrayList<>();

    public Classe() {
    }

    public Classe(String nomeClasse, String nomePacote) {
        this.nomeClasse = nomeClasse;
        this.nomePacote = nomePacote;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getNomePacote() {
        return nomePacote;
    }

    public void setNomePacote(String nomePacote) {
        this.nomePacote = nomePacote;
    }

    public List<Atributos> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributos> atributos) {
        this.atributos = atributos;
    }

    public List<Relacionamentos> getRelacionamentos() {
        return relacionamentos;
    }

    public void setRelacionamentos(List<Relacionamentos> relacionamentos) {
        this.relacionamentos = relacionamentos;
    }

    @Override
    public String toString() {
        return "Classe{" + "nomeClasse=" + nomeClasse + ", nomePacote=" + nomePacote + ", atributos=" + atributos + ", relacionamentos=" + relacionamentos + '}';
    }

    
}