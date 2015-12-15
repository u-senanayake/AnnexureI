/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINI;

/**
 *
 * @author Udayanga
 */
public class mini {
    String alcohol_dependence_current,alcohol_abuse_current,psychotic_disoeder_current,psychotic_disoeder_lifetime,id;
    public mini(String alcohol_dependence_current,String alcohol_abuse_current,String psychotic_disoeder_current,String psychotic_disoeder_lifetime,String id){
        this.alcohol_dependence_current=alcohol_dependence_current;
        this.alcohol_abuse_current=alcohol_abuse_current;
        this.psychotic_disoeder_current=psychotic_disoeder_current;
        this.psychotic_disoeder_lifetime=psychotic_disoeder_lifetime;
        this.id=id;
    }
    public void setAlcohol_dependence_current(String alcohol_dependence_current) {
        this.alcohol_dependence_current = alcohol_dependence_current;
    }

    public void setAlcohol_abuse_current(String alcohol_abuse_current) {
        this.alcohol_abuse_current = alcohol_abuse_current;
    }

    public void setPsychotic_disoeder_current(String psychotic_disoeder_current) {
        this.psychotic_disoeder_current = psychotic_disoeder_current;
    }

    public void setPsychotic_disoeder_lifetime(String psychotic_disoeder_lifetime) {
        this.psychotic_disoeder_lifetime = psychotic_disoeder_lifetime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlcohol_dependence_current() {
        return alcohol_dependence_current;
    }

    public String getAlcohol_abuse_current() {
        return alcohol_abuse_current;
    }

    public String getPsychotic_disoeder_current() {
        return psychotic_disoeder_current;
    }

    public String getPsychotic_disoeder_lifetime() {
        return psychotic_disoeder_lifetime;
    }

    public String getId() {
        return id;
    }
   
    
}
