package exercises;
import java.util.ArrayList;

public class Decoration {

		ArrayList<Ornament> DecorationBox = new ArrayList<Ornament>();

		void hang(Ornament ornament) {
			
			DecorationBox.add(ornament);
			
			System.out.println("Hanging an ornament that is "+ ornament.getColour() + " colour");
		}

		public static void main(String[] args) {
			String[] ornamentColour = { "Blue", "Red", "Yellow", "Purple", "Green", "Orange", "Black", "White", "Brown" };
			
			Decoration decoration = new Decoration();
			
			for (int i = 0; i < ornamentColour.length; i++) {
				
				Ornament ornament = new Ornament(ornamentColour[i]);
				decoration.hang(ornament);
				
			}

		}}

