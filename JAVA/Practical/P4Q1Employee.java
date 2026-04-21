
public class P4Q1Employee{
        private String name;
        private double salary;

        public P4Q1Employee(){
            this.name=" ";
            this.salary=0.0;
        }
        public P4Q1Employee(String employeeName){
            setNameEmployee(employeeName);
            //this.name=employeeName;
            this.salary=0.0;
        }
        public P4Q1Employee(String employeeName,double currentSalary){
            setNameEmployee(employeeName);
            setSalaryEmployee(currentSalary);
            //this.name=employeeName;
            //this.salary=currentSalary;
        }
        //Set the Name Employee
        public void setNameEmployee(String employeeName){
            this.name=employeeName;
        }
        //Set the Salary Employee
        public void setSalaryEmployee(double currentSalary){
            this.salary=currentSalary;
        }
        //Get the Name Employee
        public String getNameEmployee(){
            return name;
        }
        //Get the Salary Employee
        public double getSalaryEmployee(){
            return salary;
        }
        public void raiseSalary(double percent){
            this.salary=salary+(salary*percent/100.00);
        }
}
