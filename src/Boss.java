import java.util.ArrayList;

public class Boss{
	
        
        ArrayList<Player> players=new ArrayList<Player>();      
        Save save=new Save();
       
    public static void main(String[] args){
    	
        Boss boss=new Boss();
        
        boss.revolution(3,0);
        boss.revolution(0,2);
        
        
    }
    void revolution(int lvl,int slot){
    	 players.clear();
    	 players.add(new Player());
    	 players.add(new Player());
    	 players.get(0).lvl=lvl;
    	 players.get(1).lvl=lvl;
    	 
    	 
    	save.save(players,slot);
    }
    
    
 
}

class Player{
	int lvl;
}

class Save{
	ArrayList<ArrayList<Player>> slots=new ArrayList<>();;
	Player player;
	
	Save(){
		for(int i = 0; i<5; i++)
            slots.add(new ArrayList<Player>());        
	}
	
	
	void save(ArrayList players,int slot){
		      	
        	slots.get(slot).clear();
        	slots.get(slot).addAll(players);        
        
        System.out.println("slots "+slots);  
        
        for(int s = 0; s<slots.size(); s++){
        	System.out.println(" ");
        	 for(int p = 0; p<slots.get(s).size(); p++){
        		 player=slots.get(s).get(p);
        		 System.out.print("slots"+s+"."+p+"="+player.lvl+" ");
        	 }
        }
	}
}