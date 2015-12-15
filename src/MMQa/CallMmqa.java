/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMQa;

/**
 *
 * @author Udayanga
 */
public class CallMmqa {
    String id,name,t;
    public CallMmqa(String id,String name,String t){
        this.id=id;
        this.name=name;
        this.t=t;
    }

    public String getId() {
        return id;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getT() {
        return t;
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
