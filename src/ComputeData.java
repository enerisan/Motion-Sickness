import Interfaces.SymptomsReader;
import Interfaces.SymptomsWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ComputeData implements SymptomsReader,SymptomsWriter {

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


    @Override
    public void writeToFile(String filePath, TreeMap<String, Integer> data) {
       FileWriter file;
        try {
           BufferedWriter myWriter = new BufferedWriter(new FileWriter(filePath));
           for(Map.Entry<String, Integer> symptom : data.entrySet()) {
               myWriter.write (symptom.getKey() + "=" + symptom.getValue());
               myWriter.newLine();
           }

            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();

        }
    }


}


