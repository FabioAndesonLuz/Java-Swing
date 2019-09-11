/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author fabio
 */
public class DaoPessoa {
    
    public List<Pessoa> getLista(){
        return Dados.listaPessoas;
    }
    
    public boolean savar(Pessoa obj){
        if(obj.getCodigo() == null){
            int codigo = Dados.listaPessoas.size() + 1;
            obj.setCodigo(codigo);
            Dados.listaPessoas.add(obj);
        }
        return true;
    }
    
    public boolean remover(Pessoa obj){
        Dados.listaPessoas.remove(obj);
        return true;
        
    }


}
