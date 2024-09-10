import java.io.IOException;

import co.edu.uptc.txt.MyFile;
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Porfilio\\Desktop\\TxtManager\\xd.txt";

        MyFile file = new MyFile(filePath);
        file.openFile('w');
        file.recordFileNewLine("Nueva linea");
        file.recordFile("No nuieva");
        file.closeFIle();
        file.openFile('r');
        
        System.out.println(file.readAllFile());
        file.closeFIle();

    }
}