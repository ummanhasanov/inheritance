/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author Umman
 */
public class Serxan extends Azay // is-a elaqesi
{
//    public void methodInAzay(){ // bu method extend olunarken var burada amma gorsenmir
//        
//    }

    public void methodInSerxan1() {
        super.methodInAzay1(); // eger Serxan icinde methodInAzay() methodu 
        //yoxdursa o zaman this.methodInBAzay(); 
        //ve ya super.methodInAzay() yazmaq olar 

        methodInSerxan2();
        methodInAzay1();
    }

    public void methodInSerxan2() {

    }

    public void methodInAzay1() {
        System.out.println("Serxan 1");
    }
}
