/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.randomnumber.ejb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.view.ViewScoped;

/**
 *
 * @author robin
 */
@Named(value = "numberGenerator")
@ViewScoped
public class NumberGenerator implements Serializable {

    private double number = Math.random();

    /**
     * Creates a new instance of NumberGenerator
     */
    public NumberGenerator() {
    }

    public double getNumber() {
        return (number);
    }

    public String randomize() {
        number = Math.random();
        return (null);
    }
}
