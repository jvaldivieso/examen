package com.bluepartner.repo;

import org.springframework.stereotype.Repository;

import com.bluepartner.model.Resultado;

@Repository
public class RetoRepoImpl implements IRetoRepo {

	@Override
	public Resultado valida(String texto) {
		// TODO Auto-generated method stub
		Resultado resultado = new Resultado();
	    String sopaletras ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    int    contador = 0, indice =0, diferencia = 0;
	    int    cuenta[] = new int[100];
	    char   alfanumerico[] = new char[100];
	    boolean bregla = false, breglauno = false;
        
        for (int j = 0; j < sopaletras.length(); j++) {
	        for (int i = 0; i < texto.length(); i++) {
	        	if(texto.charAt(i)== sopaletras.charAt(j) ){
	        		contador++;
	        	}
	        }
	        if (contador != 0) {
	        	cuenta[indice] = contador;
	        	alfanumerico[indice] = sopaletras.charAt(j);
	        	indice++;		
	        	System.out.println("El caracter "+sopaletras.charAt(j)+ " se repite " + contador + " veces");
	        } 
	        contador = 0;
        }
        
    	for(int k=0; k < indice ; k++){   //cuenta.length
			  System.out.print("[" + alfanumerico[k] + "]");	
			  System.out.println("[" + cuenta[k] + "]");
			  
			  if( (k < (indice - 1))  && indice > 0 )  { 
			    diferencia = Math.abs(cuenta[k] - cuenta[k + 1]) ;
			    if (diferencia == 0) {
			    	bregla    = true;
			    } else if(diferencia == 1) {
			    	breglauno = true;
			    } else if(diferencia > 1) {
			    	bregla    = false;
			    }
			  } else {
				diferencia = 0;
				bregla = true;
			  }
    	}
        if (bregla && !breglauno) {
        	System.out.println("-> Todos los caracteres aparecen la misma cantidad de veces");
        	resultado.setValid(true);
        	resultado.setMensaje("Todos los caracteres aparecen la misma cantidad de veces");
        } else if (bregla && breglauno) {
        	System.out.println("-> Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece una vez mas o una vez menos.");
        	resultado.setValid(false);
        	resultado.setMensaje("Todos los caracteres aparecen la misma cantidad de veces, a excepcion de 1, que aparece una vez mas o una vez menos");        
        } else {
        	System.out.println("-> No Todos los caracteres aparecen la misma cantidad de veces");
        	resultado.setValid(false);
        	resultado.setMensaje("No Todos los caracteres aparecen la misma cantidad de veces");        
        }      
        return resultado;
	}
}
