package demo;

import java.util.Scanner;

/**
 * 购物车中的每个商品可以看成一个个对象;
 * 定义商品类: Goods ,后期创建对象代表一个商品信息;
 * 购物车对象用商品类型的数组对象表示,可以存放商品对象;
 * 添加商品到购物车,查看购物车信息;
 *  录入商品信息,创建商品对象封装商品信息
 *  并把商品对象加入到购物车数组中去;
 * 查询购物车信息,就是便利购物车数组的便利 
 */

public class ShopCarTest {
    public static void main(String[] args) {
        // 定义商品类
        // 定义购物车对象
        Goods[] shopCar = new Goods[100];
        // 操作架构
        boolean flag = true;
        while(flag){
            System.out.println("选择如下操作: ");
            System.out.println("添加商品到购物车: add");
            System.out.println("查询商品到购物车: query");
            System.out.println("修改商品到购物车: update"); 
            System.out.println("结算商品到购物车: pay");
            System.out.println("结束程序: Q");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的命令: ");
            String command = sc.next();
            switch(command){
                case "add":
                 //add;
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    // query;
                    queryGoods(shopCar);
                    break;
                case "update":
                    //update;
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                //pay;
                    payGoods(shopCar);
                    break;
                case "q":
                    flag = false;
                    break; 
            }
        }


    }

    private static void addGoods(Goods[] shopCar,Scanner sc) {
        // 添加商品信息
        // 录入用户输入商品的信息
        System.out.println("输入沟通商品的编号(不重复): ");
        int id = sc.nextInt();
        System.out.println("请输入商品的名称: ");
        String name = sc.next();
        System.out.println("请输入购买的数量: ");
        int buyNuber = sc.nextInt();
        System.out.println("请输入商品的价格: ");
        double price = sc.nextDouble();

        //把这个商品信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNuber = buyNuber;
        g.price = price;

        //把商品对象添加到购物车数组中.
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i] == null){
                // 添加商品
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("您的商品" + g.name + "添加完成");
        System.out.println("===============添加完成===============");


    }

    private static void payGoods(Goods[] shopCar) {
        //定义求和变量.累加金额
        double  money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g != null){
                money += g.price * g.buyNuber;
            }else{
                break;
            }
        }
        System.out.println("订单总金额: " + money);
        queryGoods(shopCar);
    }

    private static void updateGoods(Goods[] shopCar, Scanner sc) {
        //让用户输入商品ID
        while(true){
            System.out.println("输入修改商品ID: ");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if(g == null){
                System.out.println("没有购买此编号商品! ");
            }else{
                System.err.println("输入商品" + g.name + "的最新数量: ");
                int buyNuber = sc.nextInt();
                g.buyNuber = buyNuber;
                System.out.println("修改完成!");
                queryGoods(shopCar);
                break;
            }
        }
    }

    private static Goods getGoodsById(Goods[] shopCar, int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g != null){
                if(g.id == id){
                    return g;
                }
            }else{
                return null;
            }
        }
        return null;
    }

    private static void queryGoods(Goods[] shopCar) {
        // 查询购物车商品信息,并展示
        System.out.println("===============查询购物车信息如下=====================");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量\t\t");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g != null){
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNuber);
            }else{
                break;
            }
        }
    }

    
    

}
