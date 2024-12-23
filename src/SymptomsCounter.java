
import java.util.ArrayList;
import java.util.TreeMap;

public class SymptomsCounter {
    public static void main(String[] args) {
        ComputeData computeData = new ComputeData("./symptoms.txt");
        ArrayList<String> unsortedSymptoms = computeData.readSymptoms();
        TreeMap<String, Integer> sortedSymptoms = computeData.computeSymptoms(unsortedSymptoms);
    }
}



