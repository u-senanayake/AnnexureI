/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodTest;

/**
 *
 * @author Udayanga
 */
public class BloodTestDB {
    String is,alt_sgpt,gamma,mcv;

    public BloodTestDB(String is, String alt_sgpt, String gamma, String mcv) {
        this.is = is;
        this.alt_sgpt = alt_sgpt;
        this.gamma = gamma;
        this.mcv = mcv;
    }

    public String getIs() {
        return is;
    }

    public String getAlt_sgpt() {
        return alt_sgpt;
    }

    public String getGamma() {
        return gamma;
    }

    public String getMcv() {
        return mcv;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public void setAlt_sgpt(String alt_sgpt) {
        this.alt_sgpt = alt_sgpt;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public void setMcv(String mcv) {
        this.mcv = mcv;
    }
    
}
