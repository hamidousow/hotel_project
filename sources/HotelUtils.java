import java.util.*;

public class HotelUtils {	
	
	int cptChambreLibres;
	int cptChambreOccupees;
	
	/* 
	* initialise l'etat de l'hotel au demarrage de l'application, retourne un tableau contenant *l'etat des chambres
	*/
	public static int [] init(Random ran) {		
		
		int [] totalChambres = new int[20];
		
		cptChambreLibres = 0;
		cptChambreOccupees = 0;
		
		for(int i = 0; i < totalChambres.length; i++) {
			totalChambres[i] = ran.nextInt(2);
			
			if(totalChambres[i] == 0) {
				cptChambreLibres += 1;
				
			} else {
				cptChambreOccupees += 1;
			}			
		}
		
		return totalChambres;
	}
	
	public static void close() {
		System.out.println();
		System.out.print("\t --- Fermeture de l'application, Aurevoir ! --- \t");
		System.out.println();
		System.exit(0);
	}
	
	public static void afficherEtat(Scanner sc) {
		
		System.out.println();
				
		for(int i = 0; i < totalChambres.length; i++) {					
			System.out.println("Etat chambre " + "["+ i +"] : " + totalChambres[i]);
		}
		
		System.out.println();
		System.out.println("\t Appuyer sur une touche pour continuer");			
		System.out.println();
		choice = sc.nextLine();
	}
}