

public class Main {

    public static void main(String[] args) {

        //Gets a product from the warehouse along with capacity and balance amount
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());
    }

}
