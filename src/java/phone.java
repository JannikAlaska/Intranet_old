/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Berthold
 */
@ManagedBean
@ApplicationScoped
public class phone {
    
    Collection<Numbers> numbers = new ArrayList<>();
    
    /**
     * Creates a new instance of phone
     */
    public phone() {
        numbers.add(new Numbers("Jannik Berthold","039452/4711"));
        numbers.add(new Numbers("Maxi Mustermann","039452/4712"));
        numbers.add(new Numbers("Maxi Musterfrau","039452/4713"));
    }
    
    public Collection<Numbers> getNumbers(){
        return numbers;
    }
    
    
}
