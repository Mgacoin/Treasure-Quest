/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;


public class lockedDoor extends Exit {
     private boolean locked=true;
    
     public lockedDoor (Room room) {
        super(room);
    }
     
      /**
     * Open door
     */
    public void open() {
        this.locked=false;
    }
    
    /**
     * @return if the door is close ( true = close, false = open )
     */
    public boolean isLocked() {
        return this.locked;
    }
    
}
