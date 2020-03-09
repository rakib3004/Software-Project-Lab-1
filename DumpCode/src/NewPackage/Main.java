package NewPackage;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        TestFile testFile = new TestFile();
        ArrayList<String > arrayList = testFile.readFromFile_BufferReader();
        ArrayList<Circle> circleArrayList = null;
        for(String  string : arrayList){
            double original_radius = Double.parseDouble(string);
            System.out.println("Radius is : "+original_radius);
            Circle circle = new Circle(original_radius);
            circleArrayList.add(circle);
        }
    }
}
