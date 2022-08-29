/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JRM
 * @author BdOC
 */
public class Arquivo {
    
    private List<Classe> arquivo = new ArrayList<>();
    
    
    public Arquivo() {
        
    }
    
    public List<Classe> getArquivo() {
        return arquivo;
    }

    public void setArquivo(List<Classe> arquivo) {
        this.arquivo = arquivo;
    }
           
   @Override
    public String toString() {
        return "Arquivo{" + "arquivo=" + arquivo + '}';
    }  
    
    }

