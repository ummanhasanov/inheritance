/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author Umman
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Serxan s = new Serxan();// 111 s. hem Serxan -a hem de Azay -a aid olan methodlari gorur
        Tural t = new Tural(); // 112
        Azay a = s; // upcasting bas verir Azay a = new Serxan(); kimi de yazmaq olar
        // a heqiqetde Serxan obyekti olmagina baxmayaraq ozunu Azay obyekti kimi aparir
        // buna polymorphism deyilir
//
//        System.out.println(s instanceof Serxan); // s aiddir Serxan-a
//        System.out.println(s instanceof Azay);   // s aiddir Azay-a
//        System.out.println(s instanceof X);      // s aiddir X-a
//        System.out.println(s instanceof Object); // s aiddir Object-a
//
//        test(s);
//        test(t);
        method(s);
    }

    public static void test(Azay a) {// 111 hem de 112
        if (a instanceof Serxan) {
            Serxan a2 = (Serxan) a;// down casting bas verir, cast edirik 
            System.out.println("Serxan");
        } else if (a instanceof Tural) {
            Tural a2 = (Tural) a; // down casting bas verir, cast edirik 
            System.out.println("Tural");
        }

    }

    public static void method(Serxan s) {
        System.out.println("Serxan");
    }

    public static void method(Azay a) {
        System.out.println("Azay");

    }

    public static void method(X x) {
        System.out.println("X");

    }

    public static void method(Object o) {
        System.out.println("Object");

    }

}
