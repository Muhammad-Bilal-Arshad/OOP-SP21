/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author B1LITE
 */
public class Complex {
    private double real;
    private double imag;
    public Complex(){
    real = 0.0;
    imag = 0.0;
    }
    public Complex(double r, double im){
    real = r;
    imag = im;
    }
    public Complex Add(Complex b){
    Complex c_new = new Complex(real+b.real,imag+b.imag);
    return c_new;
    }
    public void Show(){
        System.out.println(real+imag);
    }
    
}
