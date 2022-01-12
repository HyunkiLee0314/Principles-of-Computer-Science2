/* Program:  pp.10.1 Shopping List
   Programmer: Hyunki Lee
   Date: October 25, 2018
   This is the ItemOrder class.
   There are a particular item and the quantity ordered for that item.
*/
public class ItemOrder {
   private Item item;
   private int quantity;
   
   public ItemOrder(Item anItem, int aQty) {
      item = anItem;
      quantity = aQty;
   }
   
   public double getPrice(){
      return item.priceFor(quantity);
   }
   
   public Item getItem() {
      return item;
   }
   
}