package SingleResponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

class NaiveSolution {

    public static void main(String[] args) {
        Hospital employees = new Hospital();
        Doctor doctor = new Doctor();
        doctor.employeeID = 1L;
        doctor.nameSurname = "Joe Doe";

        Doctor doctor2 = new Doctor();
        doctor2.employeeID = 2L;
        doctor2.nameSurname = "Doe Joe";

        employees.addDoctor(doctor);
        employees.addDoctor(doctor2);
        System.out.println(employees);

        try{
            employees.saveToFile("./hospital.txt");
        }
        catch (FileNotFoundException ex){
            System.out.println(ex);
        }
    }

}


// Problem: You asked to design a OOP design architecture to save doctors information permanently.
// Each doctor have ID number, name surname

class Doctor{
    String nameSurname;
    Long employeeID;
}

class Hospital{

    List<Doctor> doctorList = new ArrayList<>();

    public void addDoctor(Doctor d){
        doctorList.add(d);
    }

    // Some other responsibility of the class that can be implemented...
    public void removeDoctor(){};
    public void getDoctorByID(){};

    @Override
    public String toString() {
        String doctors = "";
        for (Doctor doc:
             doctorList) {
            doctors += doc.employeeID+" "+doc.nameSurname+"\n";
        }
        return doctors;
    }

    // Now you need to add a function to store the Doctors permanently
    public void saveToFile(String fileName) throws FileNotFoundException {
        try(PrintStream output = new PrintStream(fileName)){
            output.println(toString());
        }
    }

} // This is a big anti pattern of the Single Responsibility Principle.
// This kind of design makes this class difficult to maintain.
