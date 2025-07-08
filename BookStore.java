import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
public class BookStore {
       private List<Book> inventory = new ArrayList<>();
       private List<Book> removed_outdated_books = new ArrayList<>();
       
       public List<Book> getInventory() {
             return inventory;
       }
            public List<Book> getRemovedOutdatedBooks() {
                  return removed_outdated_books;
            }
       public void addBook(Book book) {
             inventory.add(book);
       }

       public void removeOutdatedBook(int olderThanYears) {
        Date currentDate = new Date();
        int currentYear = 1900 + currentDate.getYear(); 

        Iterator<Book> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getYear() < (currentYear - olderThanYears)) {
                removed_outdated_books.add(book);
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated book -> " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }


       public double Buy_from_Store(String isbn ,int quantity, String email, String address){
            for (Book book : inventory) {
                  if (isbn.equals(book.getIsbn())) {
                        if (book instanceof EBook) {
                              EBook ebook = (EBook) book;
                              double totalPrice = ebook.buy(isbn, quantity, email, address);
                              System.out.println("EBook purchased: " + ebook.getTitle() + " for " + totalPrice );
                              MailService.emailTo(email);
                              return totalPrice;
                        } else if (book instanceof PaperBook) {
                              PaperBook paperbook = (PaperBook) book;
                              double totalPrice = paperbook.buy(isbn, quantity, email, address);
                              System.out.println("PaperBook purchased: " + paperbook.getTitle() + " for " + totalPrice );
                              ShippingService.ship(address);
                              return totalPrice;
                        } else if (book instanceof ShowcaseBook) {
                             return  book.buy(isbn, quantity, email, address);
                              
                        }
                        
                  }
                
            }
            return 0;


       }



      
}
