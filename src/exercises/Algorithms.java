
package exercises;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.*;
public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if(egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	public static char[] ourLanguage = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','=','+',
			':',',','.'};

	public static String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--","-...-", ".-.-.",
			".-..-. .-..-.", "---...", "..--..","--..--", ".-.-.-"};
	
	
	
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (Boolean b : oysters)
		{if (b == true) {count++;}}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
   double height = 0.0;
   for (Double h : peeps) 
   {if(h>height) {height = h;}}

		return height;
	}

	public static String findLongestWord(List<String> words) {
		String LongestWord = "";
		for (String l : words) 
		{if (l.length() > LongestWord.length()) {
			LongestWord = l;
		}
		}
		return LongestWord;
	}

	public static Object containsSOS(List<String> message1) {
		for (int i = 0; i< message1.size(); i++)
		{String sos = message1.get(i);
		if(sos.contains("... --- ...")) {return true;}
		
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		results.sort(new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return Double.compare(o1, o2);}});
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		{
			unsortedSequences.sort(new Comparator<String>() {
				@Override
				public int compare(String s, String t1) {
					return (s.length() - t1.length());
				}
			});
			return unsortedSequences;
		}
	}

	
	
	
	
	public static String englishToMorseCode(String string) {
String MorseCode="";
string = string.toLowerCase();
List<String> morToEng = Arrays.asList(string.split("\\s+"));
for (String word : morToEng) {
	char[] wordToChar = word.toCharArray();
	for (int i =0; i<wordToChar.length; i++) {
		for (int a=0; a<ourLanguage.length; a++) {
			if(wordToChar[i] == ourLanguage[a]) {
				MorseCode= MorseCode + morseCode[a];
				if (i != word.length() -1)
					MorseCode= MorseCode+" ";
				
			}
		}
	}
	if((morToEng.indexOf(word) != morToEng.size() -1)&&string.lastIndexOf(" ")!= string.length() -1)
MorseCode = MorseCode+" / ";}
return MorseCode;
			
	
}

	

	public static String morseCodeToEnglish(String string) {
    String transcribe = "";
		List<String> morToEng = Arrays.asList(string.split("/"));
    for(String word : morToEng) {
    	List<String> morToLeters = Arrays.asList(word.split("\\s+"));
    	for (int i = 0; i<morToLeters.size(); i++) {
    		for (int a=0; a<morseCode.length;a++) {
    			if(morToLeters.get(i).equals(morseCode[a])) {
    				transcribe = transcribe+ourLanguage[a];
    			}
    		}
    	}
    	if((morToEng.indexOf(word) != morToEng.size() -1)&&string.contains("/")&&(transcribe.lastIndexOf("\n") != transcribe.length()-1))
    		transcribe=transcribe+" ";}
    if (string.contains("/"))
    	transcribe=transcribe.substring(0,1).toUpperCase() + transcribe.substring(1);
    return transcribe;
    					
    	
    	
    }
	

	public static List<String> sortWords(List<String> words) {
words.sort(new Comparator<String>(){
	@Override
	public int compare(String s, String t1) {
		return s.compareTo(t1);	}});
	return words;
}
	}


