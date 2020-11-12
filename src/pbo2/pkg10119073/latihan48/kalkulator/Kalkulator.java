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

public class Kalkulator {
    private double value1, value2;
    
    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }
    
    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject() {
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note) {
        System.out.println("This project shown you how to manage method in java");
    }
    
    public double add(double val1, double val2){
        return val1 + val2;
    }
    
    public double minus(double val1, double val2){
        return val1 - val2;
    }
    
    public double multiplication(double val1, double val2){
        return val1 * val2;
    }
    
    public double division(double val1, double val2){
        return val1 / val2;
    }
}
