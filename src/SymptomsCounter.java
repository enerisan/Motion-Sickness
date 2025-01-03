
import javax.sound.sampled.spi.AudioFileWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class SymptomsCounter {
    public static void main(String[] args) {
        ComputeData computeData = new ComputeData("./symptoms.txt");
        ArrayList<String> unsortedSymptoms = computeData.readSymptoms();
        TreeMap<String, Integer> sortedSymptoms = computeData.computeSymptoms(unsortedSymptoms);
        computeData.writeToFile("./resultsFile.txt", sortedSymptoms);
    }
}



