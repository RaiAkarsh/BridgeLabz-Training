interface Backupable{}

class UserData implements Backupable{}

public class DataSerializationForBackup{
    public static void main(String[] args){
        UserData u=new UserData();
        System.out.println(u instanceof Backupable);
    }
}
