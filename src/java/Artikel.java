/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Berthold
 */
@ManagedBean
@RequestScoped
public class Artikel {
    
    public String ueberschrift;
    public String author;
    public String message;
    public Calendar createDate;    

    /**
     * Creates a new instance of Artikel
     */
    public Artikel(String ueberschrift, String author, String message, Calendar createDate) {
        this.ueberschrift=ueberschrift;
        this.author=author;
        this.message=message;
        this.createDate=createDate;
    }
    
        public String getUeberschrift(){
        return this.ueberschrift;
    }  
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public Calendar getCreateDate(){
        return this.createDate;
    }   
    
}
