/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

import treasure.quest.NPC;

/**
 *
 * @author UTILISATEUR
 */
public class Room {
    public String name=null;
    public String description=null;
    public String picture=null;
    public Room northExit=null;
    public Room southExit=null;
    public Room eastExit=null;
    public Room westExit=null;
    public NPC Ch;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String name, String description, String picture, NPC Ch) 
    {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.Ch = Ch;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * @return The name of the room.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The picture of the room
     */
    public String getPicture()
    {
        return picture;
    }
    
     public NPC getCharacter()
    {
        return Ch;
    }
     
     
}
