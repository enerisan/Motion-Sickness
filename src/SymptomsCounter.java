
import java.util.ArrayList;

public class SymptomsCounter {
    public static void main(String[] args) {
        ComputeData computeData = new ComputeData("./symptoms.txt");
 ArrayList<String> unsortedSymptoms = computeData.readSymptoms();

        int counter =0;
        ArrayList<String> unrepeatedSymptoms = new ArrayList<>();
      for(int i=0; i<unsortedSymptoms.size();i++){

          if (!unrepeatedSymptoms.contains(unsortedSymptoms.get(i) {
              unrepeatedSymptoms.add(unsortedSymptoms.get(i));

          }

}
        }
    }


}