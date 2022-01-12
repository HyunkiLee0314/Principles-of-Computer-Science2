public class Item{
   private String name;
   private double price;
   private double discount;
   
   public Item(String aName, double aPrice, double aDiscount){
      name = aName;
      price = aPrice;
      discount = aDiscount;
   }
   
   public String getName(){
   
      return name;
   }
   
   public double getPrice(){
   
   return price;
   }
   
   public double getDiscount(){
   
   return price * discount;
   
   }
}
