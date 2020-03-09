package NewPackage;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        TestFile testFile = new TestFile();
        testFile.readFromFile_BufferReader();
    }
}
