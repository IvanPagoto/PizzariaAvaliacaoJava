package com.mba.pizzaria.model.entity;


/**
 * @author Ivan Pagoto
 */

public enum TamanhoPizzaEnum {
	
	PEQUENA(1,"Pequeno"),
	MEDIA(2, "Médio"),
	GRANDE(3, "Grande");
	
	 
    public int codigo;
    public String descricao;
    
    TamanhoPizzaEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

}
