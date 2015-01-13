package treasure.quest;

import treasure.quest.Item;
import treasure.quest.NPC;
import treasure.quest.Player;
import treasure.quest.Room;
import treasure.quest.Command;


public class Game {
    private Player myPlayer;
    public Room currentRoom;
    public Item item;
    public NPC character;
    
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
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
       
     //   NPC LaBoule;
        speNPC LaBoule;
        LaBoule = new speNPC("LaBoule", "Before I worked in a ford and wanted replaced the father Fourad", null, null, "I ask questions",
        "If a TGV goes to the south and a north wind breath , where does the smoke ?", "Heading South", "Eastward", "TGV does not smoke", "TGV does not smoke");
       /* String nameLaBoule = "LaBoule";
        String wordsLaBoule = "Before I worked in a ford and wanted replaced the father Fourad";
        Item itemNLaBoule = null;
        Item itemPLaboule = null;
        String myFunctionLaBoule = "I ask questions";
        String questionLaBoule="If a TGV goes to the south and a north wind breath , where does the smoke ?";
        String aquestionLaBoule="Heading South";
	String bquestionLaBoule="Eastward";
        String cquestionLaBoule="TGV does not smoke";
	String answerquestionLaBoule=cquestionLaBoule; */
    
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
 
        roomLaBoule = new Room ("roomLaBoule","where LaBoule asks questions to Robert","Treasure quest/Images Zuul/laboule.jpeg", LaBoule);
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
       roomTrap.setExits (null, null, null, roomLaBoule);
       roomLaBoule.setExits(room7, null, null, start);
       room7.setExits (room8, null, null, roomKey);
       roomRoof.setExits (roofTop, room8, null, null);
       room8.setExits (window2, roomMichelle, room7, roomRoof);
       roofTop.setExits (null, null, roomRoof, null);
       window2.setExits(start, null, room8, null);
       roomMichelle.setExits(roomCave, null, room8, null);
       roomCave.setExits(roomJewels, null, null, null);
       roomJewels.setExits(null, null, null, null);

    }  
    


    
        
//    /**
//     *  Main play routine.  Loops until end of play.
//     *  Modify it to know which palyer is using the command
//     */
//    public void play() 
//    {            
//        printWelcome();
//
//        // Enter the main command loop.  Here we repeatedly read commands and
//        // execute them until the game is over.
//                
//        boolean finished = false;
//        while (! finished) {
//            Command command = parser.getCommand();
//            finished = processCommand(command);
//        }
//        System.out.println("Thank you for playing.  Good bye.");
//    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are " + getcurrentRoom().getDescription());
        System.out.print("Exits: ");
        if(currentRoom.northExit != null)
            System.out.print("north ");
        if(currentRoom.eastExit != null)
            System.out.print("east ");
        if(currentRoom.southExit != null)
            System.out.print("south ");
        if(currentRoom.westExit != null)
            System.out.print("west ");
        System.out.println();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("quit"))
            wantToQuit = quit(command);

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     * Add something to print the description of he player and the description of a room
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("   go quit help");
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    public void goRoom(Command command) 
    {
       if(!command.hasSecondWord()) {
        //    if there is no second word, we don't know where to go...
            System.out.println("Go where?");
           return;
      }

       String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if(direction.equals("north")) {
            nextRoom = currentRoom.northExit;
        }
        if(direction.equals("east")) {
            nextRoom = currentRoom.eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = currentRoom.southExit;
        }
        if(direction.equals("west")) {
            nextRoom = currentRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println("You are " + currentRoom.getDescription());
            System.out.print("Exits: ");
            if(currentRoom.northExit != null)
                System.out.print("north ");
            if(currentRoom.eastExit != null)
                System.out.print("east ");
            if(currentRoom.southExit != null)
                System.out.print("south ");
            if(currentRoom.westExit != null)
                System.out.print("west ");
            System.out.println();
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    public Room getcurrentRoom()
    {
        return currentRoom;
    }
    
        
}