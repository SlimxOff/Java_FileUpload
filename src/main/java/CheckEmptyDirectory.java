import java.io.File;

public class CheckEmptyDirectory {
    public boolean isEmpty(File directory){
        return directory.list().length==0;
        //true - directory is empty
        //false - directory is not empty
    }
}
