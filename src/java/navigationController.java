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
@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class navigationController {
   public String moveToNews() {
      return "news?faces-redirect=true";
   }
   
   public String home(){
       return "index?faces-redirect=true";
   }
}
