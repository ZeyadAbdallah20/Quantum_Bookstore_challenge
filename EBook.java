public class EBook extends Book  {
      private int stockQuantity;
      public EBook(String isbn, String title, int year, double price, int stockQuantity) {
            super(isbn, title, year, price);
            this.stockQuantity = stockQuantity;
      }
      public int getStockQuantity() {
            return stockQuantity;
      }
      public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
      }     
      public double buy (String isbn, int quantity, String email, String address){
            if (quantity> stockQuantity) {
                   throw new RuntimeException("Quantum book store: Not enough stock for ISBN " + isbn);

                
            }
            else{
                   stockQuantity -= quantity;
        
        return quantity * getPrice();

            }

      }
     


      
}
