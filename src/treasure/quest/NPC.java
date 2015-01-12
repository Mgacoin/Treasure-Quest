/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

/**
 *
 * @author Matthieu
 */
public class NPC {
        private String name;
	private String words;
        private Item itemNeeded;
        private Item itemPossessed;
        private String function;

        public NPC(String name, String words, Item itemN, Item itemP, String myFunction){
            this.name = name;
            this.words = words;
            this.itemNeeded=itemN;
            this.itemPossessed=itemP;
            this.function= myFunction;
	}

    /**
     *Permet de modifier le texte dit par le NPC
     */
        public void setWords(String words) {
            this.words = words;
	}
    /**
     * @return Retourne le texte du Npc
     */
	public String getWords() {
            return this.words;
	}
	
    /**
     * @return Retourne le nom du Npc
     */
	public String getName(){
            return this.name;
	}
        
     /**
     * @return Retourne la fonction du Npc
     */
	public String getFunction(){
            return this.function;
	}
    /**
     * @param lePlayer
     * @param item
     */
        public void giveToNpc(Player lePlayer, Item item) {
        if (item==this.itemNeeded) {
            System.out.println("You give "+item.getName()+" to "+this.getName()); 
            lePlayer.removeItem(item);
            /**
             * if(name=="homeless") {
                System.out.println(name+ " : I advise you to go through the pub");
            }
            
            if(name=="baker") {
                System.out.println(name+ " : Taste this delicious croissant !");
            }
            */
        }
        else {
            System.out.println("This item does not interest me "+this.getName());
        }
    
}
        
}

