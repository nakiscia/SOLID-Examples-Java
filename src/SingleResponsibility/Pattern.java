package SingleResponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        HospitalEmp emp = new HospitalEmp();
        Doc doc = new Doc("Joe Doe",1l);
        emp.addDoctor(doc);
        Persistence persistence = new Persistence();
        try{
            persistence.saveToFile("hospital.txt",emp);
        }
        catch(FileNotFoundException ex){
            System.out.println(ex);
        }
    }
}

class Doc{
    String nameSurname;
    Long employeeId;

    public Doc(String nameSurname, Long employeeId) {
        this.nameSurname = nameSurname;
        this.employeeId = employeeId;
    }
}

class HospitalEmp{
    List<Doc> doctors = new ArrayList<>();

    public void addDoctor(Doc d){
        doctors.add(d);
    }

    // Some other responsibility of the class that can be implemented...
    public void removeDoctor(){};
    public void getDoctorByID(){};

    @Override
    public String toString() {
        String docsString = "";
        for (Doc doc:
                doctors) {
            docsString += doc.employeeId+" "+doc.nameSurname+"\n";
        }
        return docsString;
    }
}

// Now persistence no longer responsibility of SingleResponsibility.Hospital class.
class Persistence {
    public void saveToFile(String fileName,HospitalEmp data) throws FileNotFoundException {
        try(PrintStream output = new PrintStream(fileName)){
            output.println(data.toString());
        }
    }
}

// PS: It's obvious that there are lots of good pattern to design this kind of problem
// For Single responsibility, I would to keep it as simple as possible.
