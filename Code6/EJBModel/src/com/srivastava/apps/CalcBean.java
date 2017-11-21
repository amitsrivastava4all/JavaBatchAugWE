package com.srivastava.apps;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalcBean
 */
@Stateless
public class CalcBean implements CalcBeanRemote, CalcBeanLocal {

    /**
     * Default constructor. 
     */
    public CalcBean() {
        // TODO Auto-generated constructor stub
    }
    @PostConstruct
    void load(){
    	
    }
    
    @PreDestroy
    void unload(){
    	
    }
    

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

}
