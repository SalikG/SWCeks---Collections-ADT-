import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

    public static void main(String[] args){
        //ArrayListen skal forestille data fra en tabel i en database.
        //I virkeligheden skulle den så indeholde mange flere Employees fx en million for at det skulle give mening at bruge Flyweight pattern.
        PersonalInfo personalInfo = new PersonalInfo();


        Employee employee = new Employee();
        //Hvis man for eksempel skal kalde samme metode for hele listen af Employees.
        //Så i stedet for at lave et objekt for hver Employee så laver vi kun et som overskrives hver gang.
        ArrayList<PersonalInfo> personalInfos = personalInfo.getAllPersonalInfo();
        for (int i = 0; i < personalInfos.size(); i++){
            employee.setName(personalInfos.get(i).getName());
            employee.setAddress(personalInfos.get(i).getAddress());
            employee.setSalary(personalInfos.get(i).getSalary());

            System.out.println("Big method: " + employee.bigMethod(employee.getSalary()));
            System.out.println(employee);
        }
    }
}
