/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan48;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class TesterKalkulator {
    private static double val1, val2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(2);
        
        val1 = kalkulator.getValue1();
        val2 = kalkulator.getValue2();
        
        System.out.println("VALUE 1 = " + val1);
        System.out.println("VALUE 2 = " + val2);
        
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage "
                + "method in java");
        
        System.out.println("Result Add is = " +kalkulator.add(val1, val2));
        System.out.println("Result Minus is = " +kalkulator.minus(val1, val2));
        System.out.println("Result Multiplication is = " 
                            + kalkulator.multiplication(val1, val2));
        System.out.println("Result Division is = " +kalkulator.division(val1, val2));
    }
    
}
