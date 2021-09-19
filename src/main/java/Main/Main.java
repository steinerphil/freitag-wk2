package Main;

import ShopService.ShopService;

public class Main {


    public static void main(String[] args) {

        //create shopService
        ShopService shop1 = new ShopService();

        shop1.listProducts();
        shop1.getProduct(10);
        shop1.addOrder(new int[]{10});
        shop1.addOrder(new int[]{40, 20, 30, 10});
        shop1.addOrder(new int[]{20, 20,});
        shop1.addOrder(new int[]{40, 10, 30});
        System.out.println("*************");
        shop1.listOrders();
        shop1.getOrder(2);

    }


}
