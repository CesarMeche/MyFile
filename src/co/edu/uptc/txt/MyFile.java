package co.edu.uptc.txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
    File f;
    FileWriter fw;
    FileReader fr;
    BufferedWriter bw = null;
    BufferedReader br = null;

    public MyFile(String nameFile) {
        f = new File(nameFile);
    }

    public void openFile(char modo) {
        try {
            if (modo == 'w') {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
            } else {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recordFile(String cad) {
        if (bw != null) {
            try {
                bw.write(cad);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    public void recordFileNewLine(String cad) {
        if (bw != null) {
            try {
                bw.newLine();
                bw.write(cad);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    public String readFile() {
        String cad = "";
        try {
            cad = br.readLine();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return cad;
    }

    public String readAllFile() {
        StringBuilder content = new StringBuilder();
        String line;

        try {
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    public void closeFIle() {
        try {
            if (br != null)
                br.close();
            if (bw != null)
                bw.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}