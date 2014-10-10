/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabpoo3.util;

import java.lang.reflect.Field;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tauame
 */
public abstract class Utils {

    private static EntityManagerFactory emf;

    public static EntityManager getEM() {
        emf = Persistence.createEntityManagerFactory("TrabPOOIIIPU");
        return emf.createEntityManager();
    }

    public static void clone(Object origem, Object destino) {
        
        if(!origem.getClass().getName().equals(destino.getClass().getName())){
            throw new ClassCastException("Both objects must be members of the same class!");
        }
        
        Object clone = destino;

        // Walk up the superclass hierarchy
        for (Class obj = origem.getClass();
                !obj.equals(Object.class);
                obj = obj.getSuperclass()) {
            Field[] fields = obj.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                try {
        // for each class/suerclass, copy all fields
                    // from this object to the clone
                    fields[i].set(clone, fields[i].get(origem));
                } catch (IllegalArgumentException e) {
                } catch (IllegalAccessException e) {
                }
            }
        }
    }
}
