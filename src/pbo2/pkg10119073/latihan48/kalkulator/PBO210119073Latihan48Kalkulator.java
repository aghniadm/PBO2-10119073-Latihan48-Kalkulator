package pbo2.pkg10119073.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk melakukan penghitungan
 * menggunakan kalkulator
 *
 */

public class PBO210119073Latihan48Kalkulator {

    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        
        calc.setValue1(7);
        calc.setValue2(5);
        
        System.out.println("VALUE 1 = "+calc.getValue1());
        System.out.println("VALUE 2 = "+calc.getValue2());
        calc.setNameProject();
        calc.setNoteProject("");
        System.out.println("Result Add is = "+calc.add(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Minus is = "+calc.minus(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Multiple is = "+calc.multiplication(calc.getValue1(), calc.getValue2()));
        System.out.println("Result DIvision is = "+calc.division(calc.getValue1(), calc.getValue2()));
    }
    
}
