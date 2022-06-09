/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Berthold
 */

@ManagedBean
@ApplicationScoped
public class PhoneNr {
    
    public List<Numbers> numbers = new ArrayList<>();
    private static PhoneNr instance = new PhoneNr();
    private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Intranet2");
    
    /**
     * Creates a new instance of phone
     */
    public PhoneNr() {
        
    }
    
    /*
    public List<Numbers> getNumbersLst(){
        EntityManager em = emf.createEntityManager();
        
        Query q;
        q = em.createQuery("select a from Numbers a");
        List<Numbers> numbersResult = q.getResultList();
        em.close();
        
        return numbersResult;
    }
    */
    
}