package cat.institutmvm.application.entities;

import java.time.LocalDate;

public class SalesEmployee extends Employee{
    //<editor-fold desc="Estat: Atributs/Camps">
    private double comission;
    private static int counter = 0;
    public static final double DEFAULT_COMMISSION = 1_500D;
    //</editor-fold>


    //<editor-fold desc="Constructores">
    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary, int payments, double comission) {
        super(code, firstname, lastname, birthDate, hireDate, monthlySalary, payments);
        this.setComission(comission);
        counter++;
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary, double commission) {
        this(code, firstname, lastname, birthDate, hireDate, monthlySalary, DEFAULT_PAYMENTS, commission);
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, double monthlySalary, int payments, double commission) {
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, payments, commission);
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate,double monthlySalary, double commission) {
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, DEFAULT_PAYMENTS, commission);
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary) {
        this(code, firstname, lastname, birthDate, hireDate, monthlySalary, DEFAULT_PAYMENTS, DEFAULT_COMMISSION);
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, double monthlySalary, int payments) {
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, payments, DEFAULT_COMMISSION);
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate,double monthlySalary) {
        //----------->[]code:null | firstname:null | lastname:null | birthDate:null | hireDate:null | monthlySalary:0  | payments:0
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, DEFAULT_PAYMENTS, DEFAULT_COMMISSION);
    }
    
    /** 
     * @return double
     */
    //</editor-fold>

    //<editor-fold desc="Getters/Setters">
    public double getComission() {
        return comission;
    }

    
    /** 
     * @param comission
     */
    public void setComission(double comission) {
        this.comission = comission;
    }
    
    /** 
     * @return double
     */
    //</editor-fold>

    //<editor-fold desc="Override: Sobreescriptura de mètodes">
    @Override
    public double getAnnualSalary(){
        return super.getAnnualSalary() * this.getComission();
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString(){
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Commission:   %.2f %n", this.getComission()));
        return sb.toString();
    }
    
    /** 
     * @return int
     */
    //</editor-fold>

    //<editor-fold desc="Mètodes estàtics">
    public static int getCounter() {
        return counter;
    }
    //</editor-fold>
}
