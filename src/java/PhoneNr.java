/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Berthold
 */

public class PhoneNr {
    
    private List<Numbers> numbers = new ArrayList<>();
    private static PhoneNr instance = new PhoneNr();
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Intranet");
    
    /**
     * Creates a new instance of phone
     */
    public PhoneNr() {
        
        /*
        numbers.add(new Numbers("Jannik Berthold","039452/4711"));
        numbers.add(new Numbers("Maxi Mustermann","039452/4712"));
        numbers.add(new Numbers("Maxi Musterfrau","039452/4713"));
        */
    }
    
    public List<Numbers> getNumbers(){
        EntityManager em = EMF.createEntityManager();
        
        Query q;
        q = em.createQuery("select a from Numbers a");
        List<Numbers> numbersResult = q.getResultList();
        
        return numbersResult;
    }
    
    
}