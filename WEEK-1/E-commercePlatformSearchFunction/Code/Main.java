package search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Bag", "Fashion"),
            new Product(105, "Watch", "Accessories")
        };

        String searchName = "Shoes";

        
        Product result1 = SearchEngine.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

       
        SearchEngine.sortByName(products); 
        Product result2 = SearchEngine.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }
}
