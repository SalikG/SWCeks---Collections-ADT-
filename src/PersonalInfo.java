import java.util.ArrayList;

public class PersonalInfo {
    private Employee employee;
    private ArrayList<Employee> employees = new ArrayList<>(){{add(new Employee("Bo", "maegårdsvej 4", 12341232, 991234));
        add(new Employee("Ip", "fishermansvej 123", 12342352, 12312));
        add(new Employee("Kolera", "Halelujagade 666", 12345678, 242323));}};

    private String name;
    private String address;
    private int salary;
    private ArrayList<PersonalInfo> personalInfos = new ArrayList<>();

    public PersonalInfo (String name, String address, int salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public PersonalInfo(){
    }

    public ArrayList<PersonalInfo> getAllPersonalInfo(){
        PersonalInfo personalInfo = new PersonalInfo();
        for(Employee e : employees){
            personalInfos.add(new PersonalInfo(e.getName(), e.getAddress(), e.getSalary()));
        }
        return personalInfos;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<PersonalInfo> getPersonalInfos() {
        return personalInfos;
    }

    public void setPersonalInfos(ArrayList<PersonalInfo> personalInfos) {
        this.personalInfos = personalInfos;
    }
}
