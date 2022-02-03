/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc2;

import Calc2.Calc2;

/**
 *
 * @author 100152067
 */
public class Main 
{
    public static void main(String[] args)
    {
        Calc2 c1 = new Calc2();
        Calc2 c2 = new Calc2();
        
        c1.name="Fred";
        c2.name="Bill";
        
        System.out.println(c1.name + " Calculated " + c1.add(3, 4));
        System.out.println(c2.name + " Calculated " + c2.modulus(29, 5));
    }
}