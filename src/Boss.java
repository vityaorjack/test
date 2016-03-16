import java.util.ArrayList;

public class Boss{
	
        ArrayList<ArrayList> slots=new ArrayList<ArrayList>();
        ArrayList<Integer> toys=new ArrayList<Integer>();        
       
       
    public static void main(String[] args){
    	
        Boss boss=new Boss();
        
        boss.toys.add(5);      
        //создание колекцый в слоте
        for(int i = 0; i<5; i++)
            boss.slots.add(new ArrayList<Integer>());        
        System.out.println("slots "+boss.slots);
        //закидаем тойс
        for(int i = 0; i<boss.slots.size(); i++){        	
        	boss.slots.get(i).clear();
        	boss.slots.get(i).addAll(boss.toys);        	
        }
        System.out.println("slots0 "+boss.slots);
        //изменяем тойс
        boss.toys.clear();
        for(int i = 0; i<5; i++) boss.toys.add(1);
        
        boss.slots.get(3).clear();
    	boss.slots.get(3).addAll(boss.toys);
        
        //тестим
        System.out.println("slots1 "+boss.slots);
        System.out.println("Int "+boss.toys);
        //изменяем тойс 0	
        boss.toys.clear();
        for(int i = 0; i<5; i++) boss.toys.add(2);
        
        System.out.println("slots1 "+boss.slots);
        System.out.println("Int "+boss.toys);
      //изменяем тойс 1	
        boss.toys.clear();
        for(int i = 0; i<7; i++) boss.toys.add(3);
        
        boss.slots.get(2).clear();
    	boss.slots.get(2).addAll(boss.toys);
        
        System.out.println("slots1 "+boss.slots);
        System.out.println("Int "+boss.toys);
        
    }
    
    
 
}