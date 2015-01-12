/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import treasure.quest.Room;

 /**
 *
 * @author Matthieu
 */
public class Player {
        
        private String name;
	private final ArrayList<Item> list =new ArrayList<>();
        private Room room;
        private boolean quit= false;
        private int victory=0;

        /**
        * Constructeur du hero
        */ 
        public Player(Room room,String name) {
            this.room=room;
            this.name=name;
        }
        
        /**
        * @return Retourne le nom du hero
        */
        public String getName() {
                    return this.name;
        }
        
        public Room getRoom() {
            return this.room;
        }
        
        /**
        * @return Retourne la description de la pièce
        */
        public String getRoomDescription() {
            return this.room.getDescription();
        }
        
        /**
         * @return Retourne le nom de la pièce
         */
         public String getRoomName() {
            return this.room.getName();
        }
         
        /**
        * @return Retourne l'objet
        */
        public ArrayList<Item> getList() {
            System.out.println("Bag : "+this.list.toString());
            return this.list;
        }
        
    /**
     * Permet l'ajout d'un objet dans l'inventaire du hero
     * @param object
     * @return 
     */
	public boolean gainItem(Item object) {	
		try {
                    this.list.add(object);
                    return true;
                }
		catch (Exception e){
                    System.out.println("Erreur lors de la commande gainItem");
                    return false;
                }
	}
        
        /**
     * Supprime l'objet passé en parametre de l'inventaire du hero
     * @param object
     * @return Retourne true si la supression s'est correctement effectuée
     */
        public boolean removeItem(Item object) {	
		try {
                    this.list.remove(object);
                    return true;
                }
		catch (Exception e){
                    System.out.println("Erreur lors de la commande removeItem");
                    return false;
                } 
	}
        
     /**
     * Affiche les informations générales du Hero (Lieu,Heure...)
     */
        public void displayInformation() {
            if (!this.getQuit()) {
                System.out.println("-----------------------------------------------------");
                System.out.println("You are now on : "+this.getRoomName()); // On regarde le nouveau placement du hero
                System.out.println("Description of "+this.getRoomName()+" : "+this.getRoomDescription());
                if (this.getRoom().getCharacter() != null) {
                System.out.println("There is "+this.getRoom().getCharacter().getName()+" near you");
                }
                System.out.println("-----------------------------------------------------");
            }
        }
            
     /**
     * @return Retourne si les conditions pour que le jeu se ferme sont vérifiées ou non. True = oui, False=  non
     */
       public boolean getQuit() {
           return this.quit;
       }
       
     /**
     *  Definit que les conditions pour que le jeu se ferme sont vérifiées
     * @author Bruno
     * @param b
     */
       public void setQuit(boolean b) {
           this.quit = b;
       }
       
     /**
     * Verifie que l'objet est present dans l'inventaire
     * @param stringItem
     * @return L'objet s'il est trouvé dans l'inventaire, sinon "null"
     */
       public Item isIn (String stringItem) {
            ListIterator itr = this.list.listIterator();
            while (itr.hasNext())
            {
                  Item item = (Item)itr.next();
                  if(stringItem.equals(item.getName())){
                      return item;
                  }
            }
            return null;
       }
        /**
         * Permet l'affiche de tous les items présent dans l'inventaire
         */
       public void displayInventory () {
           String inventory = "";
           int i=0;
           ListIterator itr = this.list.listIterator();
            while (itr.hasNext())
            {
                Item item = (Item)itr.next();
                inventory += item.getName()+" ";
                i++;
                
            }
            if (i == 0) {
                System.out.println("Your bag is empty");
            }
            else {
                System.out.println("In your bag : "+inventory);
            }
       }
       
     /**
     * Definit la fin utilisée. 0 = Game over. 1 = fin traditionnelle.
     * @param victory
     */
       public void setVictory(int victory) {
           this.victory=victory;
       }
       
       public void displayEnd () {
           if (victory == 0) {
            System.out.println("----------------------------------------------------- \n See you later \n----------------------------------------------------- ");
           }
           if (victory == 1) {
            System.out.println("----------------------------------------------------- \n Game Over \n----------------------------------------------------- ");
           }
           if (victory == 2) {
               System.out.println("Finally!! Here you are, I don’t know if you are lucky or courageous but congratulation, you just win this game!");
           }
       }
       
        public static String setName() {
        String heroName = "";
        while ("".equals(heroName) || heroName == null) {
            System.out.println("Enter your name : ");
            Scanner nameScanner = new Scanner(System.in);
            heroName = nameScanner.nextLine();
        }
        return heroName;
        }       
       
       
       }
       
       
        
        
        
        
        
        
        
        
            

