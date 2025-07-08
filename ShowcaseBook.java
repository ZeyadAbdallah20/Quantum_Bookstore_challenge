

public class ShowcaseBook extends Book  {
     private  int stockQuantity;
      public ShowcaseBook(String isbn, String title, int year, double price, int stockQuantity) {
          super(isbn, title, year, price);
          this.stockQuantity = stockQuantity;
      }
      public int getStockQuantity() {
          return stockQuantity;
      }
      public void setStockQuantity(int stockQuantity) {
          this.stockQuantity = stockQuantity;
      }
      @Override
      public double buy(String isbn, int quantity, String email, String address) {

            throw new RuntimeException("ShowcaseBook does not support buying operations.");

      }

      
}
