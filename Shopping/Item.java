/* Program:  pp.10.1 Shopping List
   Programmer: Hyunki Lee
   Date: October 25, 2018
   This is the Item class that stores information about
   the individual items. 
*/
import java.text.*;

public class Item{
   // data field
   private String name;
   private double price;
   private boolean hasBulk;
   private int bulkQuantity;
   private double bulkPrice;
   private NumberFormat formatter;
   
   //constructor
   
   public Item(String aName, double aPrice){
      name = aName;
      price = aPrice;
      formatter = NumberFormat.getCurrencyInstance();
     
   }
   
    public Item(String aName, double aPrice, int aBulkQuantity,
                  double aBulkPrice){
      name = aName;
      price = aPrice;
      formatter = NumberFormat.getCurrencyInstance();
      hasBulk = true;
      bulkQuantity = aBulkQuantity;
      bulkPrice = aBulkPrice;
   }
   
   
   public double priceFor(int qty){
      if(qty < 0)
         throw new IllegalArgumentException();
      if (hasBulk && qty >= bulkQuantity)
         return qty / bulkQuantity * price;
      else
         return qty * price;
         
      
   }
   
   public String toString(){
      if(hasBulk)
         return name + ", " + formatter.format(price)+ " ("
                + bulkQuantity + " for " + formatter.format(bulkPrice) + ")";
      else
         return name + ", " + formatter.format(price);
   
      
   }


}