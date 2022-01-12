/* Program:  pp.10.1 Shopping List
   Programmer: Hyunki Lee
   Date: October 25, 2018
   This is the Catalog class that stores information about
   a collection of these itmes.
*/
import java.util.*;

public class Catalog{
   private String name;
   private ArrayList<Item> items;
   
   //Constructor
   public Catalog(String aName){
      name = aName;
      items = new ArrayList<Item>();
   }
   
   public void add(Item next){
      items.add(next);
   }
   
   public int size(){
      return items.size();
   }
   
   public Item get(int index){
      return (items.get(index));
    }
    
   public String getName(){
      return name;
    }
   
}