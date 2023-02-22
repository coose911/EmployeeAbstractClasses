package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;


    public Manager(String deptName, int NI, int salary){
        super(NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }
}
