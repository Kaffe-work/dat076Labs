/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labb4.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author axelb
 */
@Stateless
public class MicroMarketFacade extends AbstractFacade<MicroMarket> {

    @PersistenceContext(unitName = "Labb4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MicroMarketFacade() {
        super(MicroMarket.class);
    }
    
}
