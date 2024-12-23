import Interfaces.SymptomsReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(result);
        return result;
    }

    public TreeMap<String, Integer> computeSymptoms(ArrayList<String> symptoms) {
        TreeMap<String, Integer> result = new TreeMap<String, Integer>();

        for (String symptom : symptoms) {
            if (result.containsKey(symptom)) {
                int i = result.get(symptom) + 1;
                result.put(symptom, i);
            } else {
                result.put(symptom, 1);
            }
        }
        System.out.println(result);
        return result;
    }
}


