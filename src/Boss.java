import java.util.ArrayList;

public class Boss{
	
        ArrayList<ArrayList> slots=new ArrayList<ArrayList>();
        ArrayList<Integer> toys=new ArrayList<Integer>();
        ArrayList aInt;
        int Int;
       
    public static void main(String[] args){
    	
        Boss boss=new Boss();
        
        boss.toys.add(new Integer(5));        
        //создание колекцый в слоте
        for(int i = 0; i<5; i++)
            boss.slots.add(new ArrayList<Integer>());        
        System.out.println("slots "+boss.slots);
        //закидаем данные из колекцыи тойс
        for(int i = 0; i<boss.slots.size(); i++){
        	boss.aInt=boss.slots.get(i);
        	boss.aInt=boss.toys;
        }
        System.out.println("slots0 "+boss.slots);
        //изменяем тойс
        boss.Int=boss.toys.get(0);
        boss.Int=6;
        //тестим
        boss.Int=(int) boss.slots.get(3).get(0);
        System.out.println("slots1 "+boss.Int);
        	
        
    }
    
    
 
}