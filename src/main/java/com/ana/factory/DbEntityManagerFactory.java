package com.ana.factory;

import jakarta.persistence.EntityManagerFactory;

public class DbEntityManagerFactory {
   private static EntityManagerFactory emf;

    private DbEntityManagerFactory() {
    }
    public static EntityManagerFactory getManagerFactory() {
        if(emf == null) {
            emf = jakarta.persistence.Persistence.createEntityManagerFactory("my-ana");
            return emf;
        }
        return emf;
    }
}
