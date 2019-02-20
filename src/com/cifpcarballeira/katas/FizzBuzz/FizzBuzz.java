/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author daw111
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int num) {
        if (num%3==0) return "Fizz";
        else if (num%5==0) return "Buzz";
        else if ((num%3==0) && (num%5==0)) return "FizzBuzz";
        else return Integer.toString(num);
        
        
        
        /*
        if (num==1) return "1";
        else if (num==2) return "2";
        else /*if*/ /*(num == 3) return "Fizz";
        */
    }
    
}
