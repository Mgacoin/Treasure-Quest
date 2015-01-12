/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.quest;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     /**
     * Create all the items.
     */
    
        Item net, cat, map, glasses, cleaningProduct, money, key;
        net = new Item ("net", "I used to catch animals" );
        cat = new Item ("cat", "I'm lost and I search my mistress" );
        map = new Item ("map", "I point the way for the people lost");
        glasses = new Item ("glasses", "I am useful for the old people" );
        cleaningProduct = new Item ("cleaningProduct", "I clean surfaces");
        money = new Item ("money", "I can buy products in a store");   
        key = new Item ("key", "I open a old door");
    
    
     /**
     * Create all the NPC.
     */
    
        NPC Elyana, Jack, MagiCarpe, MotherMichelle, Unknown, Lustucru;
        Elyana = new NPC ("Elyana", "I am sad because I have no friends", money, null, "princess");
        Jack = new NPC ("Jack", "I never tired of cleaning product but I can redeem against a map.", map, cleaningProduct, "janitor");
        MagiCarpe = new NPC ("Magicarpe", "I have many nets, do you want?", net, map, "fisherman");
        MotherMichelle = new NPC ("MotherMichelle", "I lost my cat", null, cat, "old woman");
        Unknown = new NPC ("Unknow", "BOOOOOOO", null, null, "ghost");
        Lustucru = new NPC ("Lustucru", "I can not find the key in my pocket because I lost my glasses.", key, glasses,  "old man");  
    
    
    
     /**
     * Create all the rooms and link their exits together.
     */
   
        Room first, start, room1, room2, store, room3, window1, roomGhost, room4, lake1, lake2, castleDoor, roomJanitor, room5, roomKey, 
        room6, roomTrap, roomLaBoule, room7, roomRoof, room8, roofTop, window2, roomMichelle, roomCave, roomJewels;
      
        // create the rooms
        first = new Room (null, null, "Treasure quest/Images Zuul/castle_first_page.jpeg", null);
        start = new Room ("start","the main entrance of the castle","Treasure quest/Images Zuul/start_castle_hall.jpeg", Elyana);
        room1 = new Room ("room1","the near entrance","Treasure quest/Images Zuul/Room1.jpeg", null);
        room3 = new Room ("room3","the near entrance","Treasure quest/Images Zuul/Room3.jpeg", null);
        store = new Room ("store","store","Treasure quest/Images Zuul/store.jpeg", null);
        room2 = new Room ("room2","the room who near room 1 and 2","Treasure quest/Images Zuul/room2.jpeg", null);
        window1 = new Room ("window1","room with window to the lake","Treasure quest/Images Zuul/window_lake.jpeg", null);
        roomGhost = new Room ("roomGhost","room with the ghost","Treasure quest/Images Zuul/ghost_room.jpeg" ,Unknown);
        room4 = new Room ("room4","room where the princess cry", "Treasure quest/Images Zuul/Room4.jpeg",Elyana);
        lake1 = new Room ("lake1","One part of the lake","Treasure quest/Images Zuul/lake1.jpeg", MagiCarpe);
        lake2 = new Room ("lake2","the second part of the lake","Treasure quest/Images Zuul/lake2.jpeg", null);
        castleDoor = new Room ("castleDoor","the door of the castle","Treasure quest/Images Zuul/castle_door.jpeg", null);
        roomJanitor = new Room ("roomJanitor","the room where is the janitor","Treasure quest/Images Zuul/janitor_room.jpeg", Jack);
        room5 = new Room ("room5","The room enter the sart and the room where is the janitor","Treasure quest/Images Zuul/room5.jpeg", null);
        roomKey = new Room ("roomKey","the room where is Lustucru who have the key of the jewels","Treasure quest/Images Zuul/lustucru_room.jpeg", Lustucru);
        room6 = new Room ("room6","where the princess gives money to Robert","Treasure quest/Images Zuul/room6.jpeg", Elyana);
        roomTrap = new Room ("roomTrap","where Robert gets trapped and meets LaBoule","Treasure quest/Images Zuul/laboule.jpeg", null);
        //roomLaBoule = new Room ("roomLaBoule","where LaBoule asks questions to Robert","Treasure quest/Images Zuul/laboule.jpeg", LaBoule);
        room7 = new Room ("room7","where Robert is sent when he answers fine to LaBoule questions","Treasure quest/Images Zuul/room7.jpeg", null);
        roomRoof = new Room ("roomRoof","first part of the roof","Treasure quest/Images Zuul/roof1.jpeg", null);
        room8 = new Room ("room8","corridor to the roof","Treasure quest/Images Zuul/room8.jpeg", null);
        roofTop = new Room ("roofTop","where the cat is","Treasure quest/Images Zuul/roof_cat.jpeg", null);
        window2 = new Room ("window2","where we can see the cat","Treasure quest/Images Zuul/window_roof.jpeg",null);
        roomMichelle = new Room ("roomMichelle","where we meet motherMichelle","Treasure quest/Images Zuul/mother_michelle.jpeg", MotherMichelle);
        roomCave = new Room ("roomCave","where lustucru's glasses are","Treasure quest/Images Zuul/locked_door.jpeg", null);
        roomJewels = new Room ("roomJewels","end of the game","Treasure quest/Images Zuul/jewels.jpeg", null);

        
        // initialise room exits
        
       first.setExits (start, start, start, start);
       start.setExits(room3, room1, null, null);
       room1.setExits (room2, store, null, null);
       room3.setExits (roomGhost, room2, null, null);
       store.setExits (null, null, null, room1);
       room2.setExits (room4, window1, room1, room3);
       window1.setExits (null, null, null, room2);
       roomGhost.setExits (lake1, null, null, null);
       room4.setExits (null, null, room2, null);
       lake1.setExits (castleDoor, null, lake2, null);
       lake2.setExits (lake1, null, null, null);
       castleDoor.setExits (roomJanitor, null, lake1, null);
       roomJanitor.setExits (null, null, castleDoor, room5);
       room5.setExits (roomKey, null, null, start);
       roomKey.setExits (roomTrap, room6, null, null);
       room6.setExits(null, null, room5, null);
       //roomTrap.setExits (null, null, null, roomLaBoule);
       //roomLaBoule.setExits(room7, null, null, start);
       room7.setExits (room8, null, null, roomKey);
       roomRoof.setExits (roofTop, room8, null, null);
       room8.setExits (window2, roomMichelle, room7, roomRoof);
       roofTop.setExits (null, null, roomRoof, null);
       window2.setExits(start, null, room8, null);
       roomMichelle.setExits(roomCave, null, room8, null);
       roomCave.setExits(roomJewels, null, null, null);
       roomJewels.setExits(null, null, null, null);
}
}
