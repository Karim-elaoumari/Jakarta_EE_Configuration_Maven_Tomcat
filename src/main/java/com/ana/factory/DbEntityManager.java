package com.ana.factory;

import jakarta.persistence.EntityManager;

public class DbEntityManager {
    private static EntityManager em;

    private DbEntityManager() {
    }
    public static EntityManager getEntityManager() {
        if(em == null) {
            em = DbEntityManagerFactory.getManagerFactory().createEntityManager();
            return em;
        }
        return em;
    }
}
