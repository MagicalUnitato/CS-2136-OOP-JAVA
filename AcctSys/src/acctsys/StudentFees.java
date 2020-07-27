/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acctsys;

/**
 *
 * @author bpmsalvador
 */
public class StudentFees {
    static double TuitionFee = 1500.00;
    static double registration = 100.00;
    static double athletic = 150.00;
    static double medical = 80.00;
    static double library = 1000.00;
    static double energy = 550.00;
    static double internet = 500.00;
    static double cultural = 70.00;
    static double labfee = 5000.00;
    static double publication = 70.00;
    static double communityfee = 50.00;
    static double studcouncil = 100.00;
    
    double totlabfee = 0;
    double totaltuition = 0;
    double totalunits = 0;
    double numlab = 0;

    public StudentFees() {
        
    }
    public StudentFees(double tf) {
        TuitionFee = tf;
    }
    public StudentFees(double reg, double at, double med, double lib, double en, double net, double cult){
        registration = reg;
        athletic = at;
        medical = med;
        library = lib;
        energy = en;
        internet = net;
        cultural = cult;
    }
    public StudentFees(int lf) {
        labfee = lf;
    } 
    public StudentFees(double pub, double com, double sc) {
        publication = pub;
        communityfee = com;
        studcouncil = sc;
    }
    public double TuitionFees(int units){
        totaltuition = TuitionFee * units;
        return totaltuition;
    }
    public double MiscFees(){
        double total;
        total = registration + athletic + medical + library + energy + internet + cultural;
        
        return total;
    }
    public double LabFees(int numlab){
        totlabfee = labfee * numlab;
        return totlabfee;
    }
    public double OtherFees(){
        double total;
        total = publication + communityfee + studcouncil;
        return total;
    }
    
}
