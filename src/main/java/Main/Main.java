package Main;

import ShopService.ShopService;

public class Main {


    public static void main(String[] args) {

        //create shopService
        ShopService shop1 = new ShopService();

//        shop1.listProducts();
//        shop1.getProduct(10);
        shop1.addOrder(new int[]{10, 20, 10});
        shop1.addOrder(new int[]{10});
        shop1.listOrders();
//        shop1.getOpenOrder(1);

    }


}
