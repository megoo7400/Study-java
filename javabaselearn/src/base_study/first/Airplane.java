package first;

import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("票价: ");
        double price = sc.nextDouble();
        System.out.println("月份: ");
        int mouth = sc.nextInt();
        System.out.println("仓位类型: ");
        String type = sc.next();

        double jiage = calc(price, mouth, type);
        System.out.println("价格是: " + jiage);
        
        sc.close();
    }
    public static double calc(double money, int mouth, String type) {
        if(mouth >= 5 && mouth <= 10){
            switch (type) {
                case "经济舱":
                    money *= 0.85;
                    break;
            
                case "头等舱":
                    money *= 0.9;
                    break;
                default:
                System.out.println("仓位不正确```````````");
                money = -1;
            }
        }else if(mouth == 11 || mouth == 12 || mouth >= 1 && mouth <= 4){
            switch (type) {
                case "经济舱":
                    money *= 0.65;
                    break;
            
                case "头等舱":
                    money *= 0.7;
                    break;
                default:
                System.out.println("仓位不正确```````````");
                money = -1;
            }
        }else{
            System.out.println("月份不正确");
            money = -1;
        }
        return money;
    }
}
