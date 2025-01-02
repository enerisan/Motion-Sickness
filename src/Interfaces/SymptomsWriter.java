package Interfaces;

import java.util.TreeMap;

public interface SymptomsWriter {
void writeToFile (String filePath, TreeMap<String, Integer> data);

}
