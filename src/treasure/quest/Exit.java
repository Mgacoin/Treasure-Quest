/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

public class Exit {
    private Room nextRoom;
    
    
    public Exit(Room room) {
        this.nextRoom = room;
    }
    
    /** @return room of exit */
    public Room getNextRoom() {
        return this.nextRoom;
    }
}
