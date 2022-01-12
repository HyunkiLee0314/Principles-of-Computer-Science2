
public class DiscountBill extends GroceryBill{
   private int dcount;
   private double damount;
   private boolean preferred;
   private double dtotal;
   private double ndtotal;
    
   public DiscountBill(String clerk, boolean apreferred){
   
    super(clerk);
    preferred = apreferred;
    
    
   }
   
   public void add(Item i){
   
      i.getName();
      i.getPrice();
      i.getDiscount();
   
      
      if(!preferred){
          ndtotal = i.getPrice();
          System.out.println("Item: " + i.getName() + "," + " price: $" + ndtotal  + "," + " discount: $" + "0");
      }
      
      else{
         dtotal = i.getPrice() - i.getDiscount();
         damount = i.getDiscount();
         System.out.println("Item: " + i.getName() + "," + " price: $" + dtotal + "," + " discount: $" + damount);   
      }
   }

   public int getDiscountCount(){
   
      return dcount;
   }
   
   public double getDiscountAmount(){
   
      return damount;
   }
   
   
   public double getTotal(){
   
      return super.getTotal() - damount;
   }

   public double getDiscountPercent(){
   
      return damount*(100/super.getTotal());
   }
   
 }