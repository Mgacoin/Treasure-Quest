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
public class Item {
    private String name;
    private String description;
    
public Item (String n,String des){
    this.name=n;
    this.description=des;
}

//Retourne le nom de l'item
public String getName()
  {
    return this.name;
  }

//Retourne la description de l'item
public String getDescription()
  {
    return this.description;
  } 
}
