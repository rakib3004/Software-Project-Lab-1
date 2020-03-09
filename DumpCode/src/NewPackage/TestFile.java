package NewPackage;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class TestFile {

    private String FILENAME = JOptionPane.showInputDialog("Enter File Name : ");
    public void writeToFile_BufferWriter(String newRadius){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            String content = newRadius;

            fw = new FileWriter(FILENAME,true);
            bw =new BufferedWriter(fw);
            bw.write(content);
            bw.write("\n");
            System.out.println("Write Done !!!\n"+content);

            if(bw !=null){
                bw.close();
            }
            if(fw !=null){
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch(NullPointerException nullPointerException){
            System.out.println("OPPs!!! You Can't Enter Anything");
        }

    }
    public ArrayList<String> readFromFile_BufferReader() throws IOException {
          FILENAME = JOptionPane.showInputDialog("Enter File Name : ");

        BufferedReader br = null;
        FileReader fr =null;
        ArrayList<String >informationList = new ArrayList<>();
        try{
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while((sCurrentLine = br.readLine())!=null){
informationList.add(sCurrentLine);            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(br !=null){
            br.close();
        }
        if(fr !=null){
            fr.close();
        }
        return informationList;
    }


}
