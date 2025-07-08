abstract public class Book {
    private String isbn;
     private String title;
     private int year;
     private String email;
     private double price;
     public Book(String isbn, String title, int year, double price) {
          this.isbn = isbn;
          this.title = title;
          this.year = year;
          this.price = price;
     }
      public String getIsbn() {
            return isbn;
      }
      public String getTitle() {
            return title;
      }
      public int getYear() {
            return year;
      }
      public double getPrice() {
            return price;
      }
      public String getEmail() {
            return email;
      }
      public void setEmail(String email) {
            this.email = email;
      }
      public void setIsbn(String isbn) {
            this.isbn = isbn;
      }
      public void setTitle(String title) {
            this.title = title;
      }
      public void setYear(int year) {
            this.year = year;
      }
      public void setPrice(double price) {
            this.price = price;
      }
      public abstract double buy(String isbn ,int quantity, String email, String address);



      
}
