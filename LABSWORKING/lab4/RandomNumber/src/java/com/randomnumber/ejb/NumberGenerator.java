/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randomnumber.ejb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author robin
 */
@Named(value = "numberGenerator")
@ViewScoped
public class NumberGenerator implements Serializable {

    private double min =0.0;
    private double max = 1.0;
    private double number = Math.random();

    /**
     * Creates a new instance of NumberGenerator
     */
    public NumberGenerator() {
    }
    
    public void setMin(String x){
        this.min = Double.parseDouble(x);
    }
    
    public String getMin(){
        String mini = ""+ min;
        return mini;
    }
    public String getMax(){
        String maxi = ""+ max;
        return maxi;
    }
    
    public void setMax(String x){
        this.max = Double.parseDouble(x);
    }

    public double getNumber() {
        return (number);
    }

    public String randomize() {
        number = (Math.random() * (this.max - this.min)) + this.min;
        return (null);
    }
}
