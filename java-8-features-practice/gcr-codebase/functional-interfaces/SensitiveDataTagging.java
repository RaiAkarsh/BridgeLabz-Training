interface SensitiveData{}

class PatientRecord implements SensitiveData{}

public class SensitiveDataTagging{
    public static void main(String[] args){
        PatientRecord r=new PatientRecord();
        System.out.println(r instanceof SensitiveData);
    }
}
