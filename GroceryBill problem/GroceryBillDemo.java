public class GroceryBillDemo{
   public static void main(String[] args){
      DiscountBill clerk1 = new DiscountBill("James", true);
      clerk1.add("candybar", 10.00, 5.00);
      clerk1.add("chip", 15.00, 3.00);
      clerk1.add("coffee", 7.00, 4.00);
      clerk1.add("monster", 10.00, 50.00);
      
      
      
      DiscountBill clerk2 = new DiscountBill("Lee", false);
      clerk2.add("candybar", 10.00, 5.00);
      clerk2.add("chip", 15.00, 3.00);
      clerk2.add("coffee", 7.00, 4.00);
      clerk2.add("monster", 10.00, 50.00);
   
   
   }
}

//need to make total cost , total discount, amount