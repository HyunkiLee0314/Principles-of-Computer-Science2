/* Program:  pp.10.1 Shopping List
   Programmer: Hyunki Lee
   Date: October 25, 2018
   This is the ShoppingCart class.
   This class informs the oeverall order.
*/
import java.util.*;

public class ShoppingCart{
   private List<ItemOrder> list;
   private boolean discount;
   double discountPercent = 0.9;
   
   public ShoppingCart() {
      list = new ArrayList<ItemOrder>();
      discount = false;
   }
   
   public void add(ItemOrder next){
      for(int i = 0; i < list.size(); i++) {
         if (list.get(i).getItem() == next.getItem()) {
            list.set(i, next);
            return;
         }
         list.add(next);
       }
    }
    
    public void setDiscount(boolean aDiscount){
      discount = aDiscount;
    }
    
    public double getTotal() {
      double sum = 0.0;
      for (int i = 0; i < list.size(); i++) {
         sum = sum + list.get(i).getPrice();
      }
      if (discount)
         sum = sum + (sum*discountPercent);
      return sum;
    }
 }