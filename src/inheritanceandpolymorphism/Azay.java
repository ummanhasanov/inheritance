/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author Umman
 */
public class Azay extends X
{
    int a; // default variable, package variable. Yalniz paketin icindeki classlar gore biler
    protected int a2; // protected variable . Paketin icindeki classlar ve basqa paketlerde Azay classi extends olunan classlar gore biler
    public int a3; // her yerde gormek olar
    
    
    
    public void methodInAzay1(){
        System.out.println("Azay 1");
    }
}
