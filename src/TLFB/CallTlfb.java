/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TLFB;

/**
 *
 * @author Udayanga
 */
public class CallTlfb {
    String id,name,t;
    public CallTlfb(String id,String name,String t){
        this.id=id;
        this.name=name;
        this.t=t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
