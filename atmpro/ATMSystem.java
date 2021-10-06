package atmpro;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 主程序:
 * 一 登录操作
 *      登录/注册账户
 * 二 功能操作
 *      查询/存款/取款/转账/修改密码/退出/注销账户
 * 
 * 1 系统准备,首页设计
 *      账户信息类
 *      准备容器
 *      首页功能: 登录注册
 * 
 */

public class ATMSystem {
    public static void main(String[] args) {
        // 准备系统的容器
        ArrayList<Account> accounts = new ArrayList<>();

        // 首页,登录,开户
        showMain(accounts);

    }
    
    // 显示首页菜单---showMain() 方法
    public static void showMain(ArrayList<Account> accounts) {
        System.out.println("======欢迎进入首页========");
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入您想要的操作: ");
            System.out.println("1/ 登录");
            System.out.println("2/ 开户");
            System.out.println("你可以输入命令了: ");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登录
                    login(accounts,sc);
                    break;
            
                case 2:
                    // 开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作不被支持!!");
            }
        
        }
    }

    /**
     * 用户开户功能 账户的集合对象
     * @param accounts
     * 开发方法
     */
    public static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========用户开户功能=============");
        System.out.println("开户名称: ");
        String name = sc.next();

        String password = "";
        // 首页循环
        while(true){
            System.out.println("开户密码: ");
            password = sc.next();
            System.out.println("确认密码: ");
            String okPassword = sc.next();
            if(okPassword.equals(password)){
                break;
            }else{
                System.out.println("两次密码不一致!!!");
            }
        }
        System.out.println("请输入您当次的限额: ");
        Double quotaMoney = sc.nextDouble();
        // 生成账户卡号,卡号是 8 位,而且不能与其他账户卡号重复
        String cardId = createCardId(accounts);

        // 创建一个账户对象,封装账户信息
        Account account = new Account(cardId, name, password, quotaMoney);
        accounts.add(account);
        System.out.println("恭喜您,您开户成功" + account.getCarId() + "妥善保管!!");

    }

    // 创建 8 位卡号方法
    public static String createCardId(ArrayList<Account> accounts) {
       while(true){
            // 生成 8 位数字代码
            Random r = new Random();
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            // 判断是否重复
            Account acc = getAccoutByCarId(cardId, accounts);
            if(acc == null){
                return cardId;
            }
        }
    }

    // 根据开好账户查询
    public static  Account getAccoutByCarId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getCarId().equals(cardId)){
                return acc;
            }
        }
        return null;
    }
  
    // 登录功能
    public static void login(ArrayList<Account> accounts, Scanner sc) {
       if(accounts.size() == 0){
           System.out.println("当前系统无任何账户,您需要先注册!");
           return;
       }
       
        while(true){
            System.out.println("输入你的卡号:  ");
            String cardId = sc.next();
            Account acc = getAccoutByCarId(cardId, accounts);
            if(acc != null){
                // 用户输入密码:
                while(true){
                    System.out.println("输入登录密码: ");
                    String password = sc.next();
                    if(acc.getPassWord().equals(password)){
                        // 密码正确
                        // 展示系统功能!!
                        // test: sys 代码可注销
                        System.out.println("您的账户登录成功了~~~~");
                        showUserCommand(sc, acc, accounts);
                        return; // 结束登录
                    }else{
                        System.out.println("您的密码输入有误,请确认!");
                    }
                }
            }else{
                System.out.println("对不起,改卡号不存在!");
            }
        }

    }

    // 显示用户功能方法
    public static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        
        
        while(true){
            System.out.println("==========用户操作界面=============");
            System.out.println("1/ 查询账户");
            System.out.println("2/ 存款");
            System.out.println("3/ 取款");
            System.out.println("4/ 转账");
            System.out.println("5/ 修改密码");
            System.out.println("6/ 退出");
            System.out.println("7/ 注销账户");
            System.out.println("请您输入命令: ");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询账户
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc,sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(accounts, acc, sc);
                    break;
                case 5:
                    // 修改密码
                    updatePassword(acc, sc);
                    return;
                case 6:
                    // 退出
                    System.out.println("欢迎下次光临!!");
                    return; // 结束功能系统
                case 7:
                    // 注销账户
                    // 集合里面 删除 当前用户
                    accounts.remove(acc);
                    System.out.println("您的账户注销成功");
                    return;
                default:
                    System.out.println("您的输入的命令有误!!!");
            }
        }
    }

    // 修改密码方法
    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("=======修改密码操作==========");
        while(true){
            System.out.println("输入正确的密码: ");
            String okPassword = sc.next();
            if(acc.getPassWord().equals(okPassword)){
                while(true){
                    System.out.println("输入新密码: ");
                    String newPassword = sc.next();
                    System.out.println("再次输入新密码: ");
                    String okNewPassword = sc.next();
                    if(newPassword.equals(okNewPassword)){
                        acc.setPassWord(newPassword);
                        return;
                    }else{
                        System.out.println("两次输入的密码不一致!!!");
                    }
                }
            }else{
                System.out.println("当前输入密码不正确~~~~~");
            }
        }
    }

    // 转账方法
    private static void transferMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        // 判断系统中是否有两个以上的用户
        if(accounts.size() < 2){
            System.out.println("对不起,系统中无其他账户!");
            return;
        }

        // 判断自己的账户是否有钱
        if(acc.getMoney() == 0){
            System.out.println("您自己都没有钱,就别转了!!!");
            return;
        }

        // 转账逻辑
       while(true){
            System.out.println("输入对方的账户的卡号: ");
            String cardId  = sc.next();
            Account account = getAccoutByCarId(cardId, accounts);
            if(account != null){
                // 对方账户确认
                // 判断是否是自己的账户
                if(account.getCarId().equals(acc.getCarId())){
                    System.out.println("您不可以为自己转账!!");
                }else{
                    // 确认对方账户名字
                    String name = "*" + account.getUserName().substring(1);
                    System.out.println("请确认 [" + name + "] 的姓氏: " );
                    String preName = sc.next();
                    if(account.getUserName().startsWith(preName)){
                        // 转账
                        System.out.println("输入转账的金额: ");
                        double money = sc.nextDouble();
                        if(money > acc.getMoney()){
                            System.out.println("转账金额太多,您最多可转:" + acc.getMoney());
                        }else{
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("恭喜您,转账成功了! 已经为" 
                            + account.getUserName() + "转了: " 
                            + money);
                            showAccount(acc);
                            return;

                        }
                    }else{
                        System.out.println("对不起,您的认证信息有误!!!!");
                    }
                }
            }else{
                System.out.println("对不起,您输入的账户有问题!!!");
            }
       }
    }

    // 取款方法
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("==========取款操作===========");
        if(acc.getMoney() >= 100){
            while(true){
                System.out.println("输入您的取款金额: ");
                double money = sc.nextDouble();
                // 判断限额
                if(money > acc.getQuotaMoney()){
                    System.out.println("金额超限额,每次可取额度: " + acc.getQuotaMoney());
                }else{
                    if(acc.getMoney() >= money){
                        // 可以取钱
                        acc.setMoney(acc.getMoney() - money);
                        System.out.println("恭喜您,取钱成功!余额为: "+ acc.getMoney());
                        return; //取钱后,方法结束
                    }else{
                        System.out.println("余额不足!!");
                    }
                }
            }
        }else{
            System.out.println("您的余额不足100元!");
        }
    }

    // 存款方法
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("=========存款操作===========");
        System.out.println("输入存款金额: ");
        double money = sc.nextDouble();
        acc.setMoney(acc.getMoney() + money);
        System.out.println("存款完成!");
        showAccount(acc);
    }
    
    // 显示账户信息方法
    private static void showAccount(Account acc) {
        System.out.println("=========当前账户详情=============");
        System.out.println("卡号:\t " + acc.getCarId());
        System.out.println("姓名:\t " + acc.getUserName());
        System.out.println("余额:\t " + acc.getMoney());
        System.out.println("当次限额: " + acc.getQuotaMoney());
    }

}



