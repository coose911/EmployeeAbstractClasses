package Staff;

public abstract class Employee {

    private int NI;
    private int salary;


    public Employee(int NI, int salary){
        this.NI = NI;
        this.salary = salary;
    }

    public int getNI(){
        return NI;
    }

    public int getSalary(){
        return salary;
    }

    public double raiseSalary(double increment){
        return this.salary + increment;
    }

    public double payBonus(double increment){
        return this.salary + (this.salary * increment);
    }


}
