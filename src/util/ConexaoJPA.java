/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author barto
 */
public class ConexaoJPA {
    private static EntityManagerFactory emf;
    
    public static EntityManager getConexao(){
        emf = Persistence.createEntityManagerFactory("testeJPAPU");
        return emf.createEntityManager();
    }
    
    public static void fechar(){
        emf.close();
    }
    
}
