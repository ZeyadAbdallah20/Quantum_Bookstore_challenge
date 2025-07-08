public class Test {
      public static void main(String[] args) {
              
            BookStore store = new BookStore();
            Book p1 = new PaperBook("111", "Java Basics", 2017, 100.0, 5);
            Book p2 = new PaperBook("222", "Advanced Java", 2018, 150.0, 3);
            Book e1 = new EBook("333", "Java for Beginners", 2019, 50.0, 10);
            Book e2 = new EBook("444", "Java Programming", 2020, 75.0, 20);
            Book s1 = new ShowcaseBook("555", "Java Mastery", 2021, 200.0, 2);
            Book s2 = new ShowcaseBook("666", "Mastering Java", 2022, 250.0, 1);
            store.addBook(p1);
            store.addBook(p2);
            store.addBook(e1);
            store.addBook(e2);
            store.addBook(s1);
            store.addBook(s2);
            store.removeOutdatedBook(7);
            try {
                
            store.Buy_from_Store("333", 2, "zeyad_abdallah.com", "maadi, Cairo, Egypt");
            store.Buy_from_Store("222", 2, "zeyad_abdallah.com", "maadi, Cairo, Egypt");
            store.Buy_from_Store("222", 4, "zeyad_abdallah.com", "maadi, Cairo, Egypt");


            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
            }


            try {
                store.Buy_from_Store("555", 1, "zeyad_abdallah.com", "maadi, Cairo, Egypt");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                  System.out.println("An unexpected error occurred: " + e.getMessage());
            }

            /*expected output:
            Quantum book store: Removed outdated book -> Java Basics (ISBN: 111)
            EBook purchased: Java for Beginners for 100.0
            Email sent to: zeyad_abdallah.com
            PaperBook purchased: Advanced Java for 300.0
            Shipping to: maadi, Cairo, Egypt
            Quantum book store: Not enough stock for ISBN 222
            ShowcaseBook does not support buying operations.*/
            
              


      }
      
}
