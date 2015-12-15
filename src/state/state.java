/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Udayanga
 */
public class state {
    String id,T0_audit,T0_tlfb,T0_mmqa,T0_mmqb,T0_qles_qsf,T0_blood,
            T6_tlfb,T6_mmqa,T6_mmqb,T6_qles_qsf,T6_blood,
            T12_audit,T12_tlfb,T12_mmqa,T12_mmqb,T12_qles_qsf,T12_blood;
    String field,state;

    public state(String id,String T0_audit,String T0_tlfb,String T0_mmqa,String T0_mmqb,String T0_qles_qsf,String T0_blood,
            String T6_tlfb,String T6_mmqa,String T6_mmqb,String T6_qles_qsf,String T6_blood,
            String T12_audit,String T12_tlfb,String T12_mmqa,String T12_mmqb,String T12_qles_qsf,String T12_blood){
        this.id=id;
        this.T0_audit=T0_audit;
        this.T0_tlfb=T0_tlfb;
        this.T0_mmqa=T0_mmqa;
        this.T0_mmqb=T0_mmqb;
        this.T0_qles_qsf=T0_qles_qsf;
        this.T0_blood=T0_blood;
        this.T6_tlfb=T6_tlfb;
        this.T6_mmqa=T6_mmqa;
        this.T6_mmqb=T6_mmqb;
        this.T6_qles_qsf=T6_qles_qsf;
        this.T6_blood=T6_blood;
        this.T12_audit=T12_audit;
        this.T12_tlfb=T12_tlfb;
        this.T12_mmqa=T12_mmqa;
        this.T12_mmqb=T0_mmqb;
        this.T12_qles_qsf=T12_qles_qsf;
        this.T12_blood=T12_blood ;
            
    }

    public state(String id) {
        this.id=id;
    }
    
    public String getField() {
        return field;
    }

    public String getState() {
        return state;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setT0_audit(String T0_audit) {
        this.T0_audit = T0_audit;
    }

    public void setT0_tlfb(String T0_tlfb) {
        this.T0_tlfb = T0_tlfb;
    }

    public void setT0_mmqa(String T0_mmqa) {
        this.T0_mmqa = T0_mmqa;
    }

    public void setT0_mmqb(String T0_mmqb) {
        this.T0_mmqb = T0_mmqb;
    }

    public void setT0_qles_qsf(String T0_qles_qsf) {
        this.T0_qles_qsf = T0_qles_qsf;
    }

    public void setT0_blood(String T0_blood) {
        this.T0_blood = T0_blood;
    }

    public void setT6_tlfb(String T6_tlfb) {
        this.T6_tlfb = T6_tlfb;
    }

    public void setT6_mmqa(String T6_mmqa) {
        this.T6_mmqa = T6_mmqa;
    }

    public void setT6_mmqb(String T6_mmqb) {
        this.T6_mmqb = T6_mmqb;
    }

    public void setT6_qles_qsf(String T6_qles_qsf) {
        this.T6_qles_qsf = T6_qles_qsf;
    }

    public void setT6_blood(String T6_blood) {
        this.T6_blood = T6_blood;
    }

    public void setT12_audit(String T12_audit) {
        this.T12_audit = T12_audit;
    }

    public void setT12_tlfb(String T12_tlfb) {
        this.T12_tlfb = T12_tlfb;
    }

    public void setT12_mmqa(String T12_mmqa) {
        this.T12_mmqa = T12_mmqa;
    }

    public void setT12_mmqb(String T12_mmqb) {
        this.T12_mmqb = T12_mmqb;
    }

    public void setT12_qles_qsf(String T12_qles_qsf) {
        this.T12_qles_qsf = T12_qles_qsf;
    }

    public void setT12_blood(String T12_blood) {
        this.T12_blood = T12_blood;
    }

    public String getId() {
        return id;
    }

    public String getT0_audit() {
        return T0_audit;
    }

    public String getT0_tlfb() {
        return T0_tlfb;
    }

    public String getT0_mmqa() {
        return T0_mmqa;
    }

    public String getT0_mmqb() {
        return T0_mmqb;
    }

    public String getT0_qles_qsf() {
        return T0_qles_qsf;
    }

    public String getT0_blood() {
        return T0_blood;
    }

    public String getT6_tlfb() {
        return T6_tlfb;
    }

    public String getT6_mmqa() {
        return T6_mmqa;
    }

    public String getT6_mmqb() {
        return T6_mmqb;
    }

    public String getT6_qles_qsf() {
        return T6_qles_qsf;
    }

    public String getT6_blood() {
        return T6_blood;
    }

    public String getT12_audit() {
        return T12_audit;
    }

    public String getT12_tlfb() {
        return T12_tlfb;
    }

    public String getT12_mmqa() {
        return T12_mmqa;
    }

    public String getT12_mmqb() {
        return T12_mmqb;
    }

    public String getT12_qles_qsf() {
        return T12_qles_qsf;
    }

    public String getT12_blood() {
        return T12_blood;
    }
}
