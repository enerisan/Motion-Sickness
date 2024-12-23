import Interfaces.SymptomsReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ComputeData implements SymptomsReader {

    // Attribute
    private String filePath;

    //Constructor
    public ComputeData(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public ArrayList<String> readSymptoms() {
        ArrayList<String> result = new ArrayList<>();
        if (filePath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line = reader.readLine();
                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public ArrayList<String>
}


