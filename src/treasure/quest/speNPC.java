/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

import treasure.quest.Item;
import treasure.quest.NPC;

/**
 *
 * @Maëva F
 */
public class speNPC extends NPC {
    
    private Enigma enigma;

    	public speNPC(String name, String words, Item itemN, Item itemP, String myFunction, String question, String a, String b, String c, String ans)	
    	
    	{
    		super(name, words, itemN, itemP, myFunction);
    		enigma = new Enigma (question, a, b, c, ans);	
    	
    	}
     
    	public Enigma getEnigma() {
    		return enigma;
    	}
    
}
