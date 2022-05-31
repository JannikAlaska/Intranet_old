/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Berthold
 */
@ManagedBean
@RequestScoped
public class Numbers {

    public String mitarbeiter;
    public String number;
    
    /**
     * Creates a new instance of Numbers
     */
    public Numbers(String mitarbeiter, String number) {
        this.mitarbeiter=mitarbeiter;
        this.number=number;
    }
    
    public String getMitarbeiter(){
        return mitarbeiter;
    }
    public String getNumber(){
        return number;
    }
    
    public void setMitarbeiter(String mitarbeiter){
        this.mitarbeiter=mitarbeiter;
    }
    public void setNumber(String number){
        this.number=number;
    }
    
}
