package Management;


public class Director extends Manager {

    private double budget;


    public Director(String deptName, int NI, int salary, double budget){
        super(deptName, NI, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }
}

