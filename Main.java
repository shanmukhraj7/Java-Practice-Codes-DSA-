import java.util.Scanner;

class FrequencyCounter<T>{
    public int countFrequencies(T[] arr, int size, T[] unique, int[] frequencies) {
        int uniqueCount = 0;
        for (int i = 0; i < size; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i].equals(unique[j])) {
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[uniqueCount] = arr[i];
                frequencies[uniqueCount] = 1;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] words = inputLine.split("\\s+");
        int size = words.length;
        String[] uniqueWords = new String[size];
        int[] frequencies = new int[size];
        FrequencyCounter<String> counter = new FrequencyCounter<>();
        int uniqueCount = counter.countFrequencies(words, size, uniqueWords, frequencies);
        for(int i = 0; i < uniqueCount; i++){
            System.out.println(uniqueWords[i] + ": " + frequencies[i]);
        }
        scanner.close();
    }
}