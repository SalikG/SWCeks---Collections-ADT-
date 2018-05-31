import java.util.Collection;

public class Employee {
    private Collection<String> bigData;
    private String name;
    private String address;
    private int tlf;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String address, int tlf, int salary) {
        this.name = name;
        this.address = address;
        this.tlf = tlf;
        this.salary = salary;
    }

    //Denne metode skal forestille at være en af mange metoder der kræver en masse data
    public int bigMethod(int number){
        int i = 124235236/number;
        return i;
    }

    public Collection<String> getBigData() {
        return bigData;
    }

    public void setBigData(Collection<String> bigData) {
        this.bigData = bigData;
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

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tlf=" + tlf +
                ", salary=" + salary +
                '}';
    }
}
