package Main;
import ShopService.ShopService;

public class Main {


    public static void main(String[] args) {

        //create shopService
        ShopService shop1 = new ShopService();

        shop1.listProducts();

        System.out.println("***************");

        shop1.getProduct(20);

//        System.out.println("***************");
//
//        shop1.addOrder(30);

        System.out.println("***************");

        shop1.listOrders();

        System.out.println("***************");

        shop1.getOpenOrder(1);

    }


}
