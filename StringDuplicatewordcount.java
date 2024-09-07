package tom;
import java.util.HashMap;
import java.util.Map;


public class StringDuplicatewordcount {

	public static void main(String[] args) {
	
        String input = "Java is great and Java is fun. Programming in Java is great.";
      

        // Normalize the string by converting it to lower case
        String normalizedInput = input.toLowerCase();

        // Split the string into words using a regular expression
        String[] words = normalizedInput.split("\\W+");
        
        // char[] words=str.toCharArray();  //duplicate letter in word
        
        // Use a HashMap to store each word and its count
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
        	//System.out.println("After removeing space:"+ word);
            if (wordCountMap.containsKey(word)) {   //map=0 initially
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Display the duplicate words and their counts
        System.out.println("All words count separately:"+ wordCountMap);//total words individual count
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1)  //if (entry.getValue() == 1) { unique words
            {
            	
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}