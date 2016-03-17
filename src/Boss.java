import java.util.ArrayList;

public class Boss{
	
        ArrayList<ArrayList> slots=new ArrayList<ArrayList>();
        ArrayList<Player> players=new ArrayList<Player>();        
        static Player player;
       
    public static void main(String[] args){
    	
        Boss boss=new Boss();
        
        boss.players.add(new Player());      
        //создание колекцый в слоте
        for(int i = 0; i<5; i++)
            boss.slots.add(new ArrayList<Player>());        
        System.out.println("slots "+boss.slots);
        //закидаем плеерс
        for(int i = 0; i<boss.slots.size(); i++){        	
        	boss.slots.get(i).clear();
        	boss.slots.get(i).addAll(boss.players);        	
        }
        System.out.println("slots0 "+boss.slots);
       //изменяем плеерс
        boss.players.clear();
        for(int i = 0; i<5; i++){
        	boss.players.add(new Player());
        	boss.players.get(i).lvl=(i+1);
        }
        
        boss.slots.get(3).clear();
    	boss.slots.get(3).addAll(boss.players);
        
        //тестим
        System.out.println("slots1 "+boss.slots);
        for(int i = 0; i<5; i++){
        	player=(Player) boss.slots.get(3).get(i);
        	System.out.print("slots3"+i+"="+player.lvl+" ");
        }
        System.out.println(" ");
        //изменяем плеерс 1	
        boss.players.clear();
        boss.players.add(new Player());
    	boss.players.get(0).lvl=5;
    	
    	boss.slots.get(2).clear();
    	boss.slots.get(2).addAll(boss.players);
        
    	System.out.println("slots1 "+boss.slots);
        for(int i = 0; i<boss.slots.size(); i++){
        	player=(Player) boss.slots.get(i).get(0);
        	System.out.print("slots.get()"+i+"="+player.lvl+" ");
        }
        
      //изменяем плеерс 2	
        boss.players.clear();
        for(int i = 0; i<5; i++){
        	boss.players.add(new Player());
        	boss.players.get(i).lvl=6;
        }
    	
        
        boss.slots.get(1).clear();
    	boss.slots.get(1).addAll(boss.players);
        
    	System.out.println("slots2 "+boss.slots);
    	System.out.println("супер проверка ");
        for(int s = 0; s<boss.slots.size(); s++){
        	System.out.println(" ");
        	 for(int p = 0; p<boss.slots.get(s).size(); p++){
        		 player=(Player) boss.slots.get(s).get(p);
        		 System.out.print("slots"+s+"."+p+"="+player.lvl+" ");
        	 }
        }
        
    }
    
    
 
}
class Player{
	int lvl;
}