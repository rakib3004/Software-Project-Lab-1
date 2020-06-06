package FilePackage;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeWriter {
    public void dateTimeWriterMethods(){
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a");

String FILENAME,string;

string = "-------------Cache Text-----------------\n";
        FILENAME = "history.txt";
        string = string+ ft.format(dNow);
        string = string+"\n-------------Cache Text-----------------\n\n";


        try {
            FileWriter fileWriter=new FileWriter(FILENAME);
            fileWriter.write(string);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
