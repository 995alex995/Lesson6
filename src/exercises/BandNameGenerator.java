package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.sun.tools.javac.util.List;

/* 
	 * Make 2 ArrayLists; 
	 *      1 full of adjectives (e.g. slimy, blind)
	 *      1 full of plural nouns (e.g. pants, bones)
	 *      
	 * When the program is run, one word is randomly selected from each list to generate a band name.
	*/
	public class BandNameGenerator {
		public static void main(String[] args) {
			
		
		
		Random RAN = new Random();
		String[] adjectives = { "Slimy" , "Blind" ,"Black", "Metal", "Uncreative", "Fruity", "Magical", "Hairy" , "Murdered" };
		int random1 = RAN.nextInt(adjectives.length);		
		
		String[] pnouns = { "Pants" , "Bones", "Unicorns", "Cheerios", "Mommas", "Broncos", "Billy Ray Cyrus", "Naz","Creations" };
		int random2 = RAN.nextInt(pnouns.length);
		
		
		System.out.println(adjectives[random1]+" "+pnouns[random2]);	
		
		}}
	
	

