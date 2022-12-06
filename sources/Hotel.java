import java.util.*;

public class Hotel {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		String choice;
		
		int totalChambres [] = new int [20];
		int cptChambreLibres = 0;
		int cptChambreOccupees = 0;
		
		for(int i = 0; i < totalChambres.length; i++) {
			totalChambres[i] = ran.nextInt(2);
			
			if(totalChambres[i] == 0) {
				cptChambreLibres += 1;
				
			} else {
				cptChambreOccupees += 1;
			}			
		}		
		
		while(true) {
			System.out.println("\t\t --- Menu Hotel ---\t\t");
			System.out.println();
			System.out.println("\t [A] - Afficher l'etat de l'hotel");
			System.out.println("\t [B] - Afficher nombre de chambres occupees");
			System.out.println("\t [C] - Afficher nombre de chambres libres");
			System.out.println("\t [D] - Afficher le numero de la premiere chambre libre");
			System.out.println("\t [E] - Afficher le numero de la derniere chambre libre");
			System.out.println("\t [F] - Reserver une chambre");
			System.out.println("\t [G] - Liberer une chambre libre");
			System.out.println();
			System.out.println("\t [Q] - Quitter l'application \t");
			System.out.println();
			System.out.print("Choix menu : ");
			choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("Q")) {
				System.out.println();
				System.out.print("\t --- Fermeture de l'application, Aurevoir ! --- \t");
				System.out.println();
				break;	
			}
			
			if((choice.trim().equalsIgnoreCase("A"))) {				
				
				System.out.println();
				
				for(int i = 0; i < totalChambres.length; i++) {					
					System.out.println("Etat chambre " + "["+ i +"] : " + totalChambres[i]);
				}
				
				System.out.println();
				System.out.println("\t Appuyer sur une touche pour continuer");			
				System.out.println();
				choice = sc.nextLine();			
			}
			
			if(choice.trim().equalsIgnoreCase("B")) {
				System.out.println();
				System.out.println("Total chambre reservees : " + cptChambreOccupees);
				System.out.println();
				System.out.println("\t Appuyer sur une touche pour continuer");		
				System.out.println();
				choice = sc.nextLine();
				System.out.println();
			}
			
			if(choice.trim().equalsIgnoreCase("C")) {
				System.out.println();
				System.out.println("Total chambre libres : " + cptChambreLibres);
				System.out.print("\t Appuyer sur une touche pour continuer");
				
				System.out.println();
				choice = sc.nextLine();
				System.out.println();
			}
			
			if(choice.trim().equalsIgnoreCase("D")) {
				System.out.println();
				
				for(int i = 0; i < totalChambres.length; i++){
					if(totalChambres[i] == 0) {
						System.out.println("Premiere chambre libre : [" + i + "]");
						break;
					}
				}
			}
			
			if(choice.trim().equalsIgnoreCase("E")) {
				System.out.println();
				
				for(int i = totalChambres.length-1; i > 0; i--){
					if(totalChambres[i] == 0) {
						System.out.println("Derniere chambre libre : [" + i + "]");
						break;
					}
				}
			}
			
			if(choice.trim().equalsIgnoreCase("F")) {
				System.out.println();
				
				for(int i = 0; i < totalChambres.length; i++){
					if(totalChambres[i] == 0) {
						System.out.println(i);
						break;
					}
				}
				
			}
			
			
		}
	}
}