class EmployeeMain{
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computatio Program");
        EmpWageBuilder ew = new EmpWageBuilder();
        ew.addCompany("Dmart", 20, 100, 20);
        ew.addCompany("Reliance", 25, 120, 22);
        ew.addCompany("Big Bazaar", 30, 110, 25);
        ew.addCompany("Amazon", 35, 130, 28);
        ew.computewages();
        System.out.println("Total wages for Dmart: " + ew.getTotalWages("Dmart"));
    }        
}