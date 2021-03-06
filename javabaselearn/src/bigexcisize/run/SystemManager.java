package run;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.Business;
import bean.Customer;
import bean.Movie;
import bean.User;

/**
    定义List<User> 存放系统注册用户
    定义集合Map<Business, List<Movie>> 存放商家和其拍片信息
 */
public class SystemManager {
    // 定义系统的数据容器,用于存放用户数据
    // 1/ 存放很多用户(客户,商家对象)
    public static final List<User> ALL_USERS = new ArrayList<>();
    // 2/ 存放系统全部商家和其拍片信息
    // 商家1  --  [片1, 片2]
    // 商家2  --  [片1, 片2]
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>(); 

    public static final Scanner SYS_SC = new Scanner(System.in);

    // 定义静态的用户对象
    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm");
    // 日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger(SystemManager.class); 
    // 3/ 准备一些测试数据
    // 提前准备一些商家 和  客户数据
    static{
        Customer c = new Customer();
        c.setLogName("zyf888");
        c.setPassWord("123456");
        c.setUserName("大汉刘德华");
        c.setSex('男');
        c.setPhone("1111111");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLogName("gzl000");
        c1.setPassWord("123456");
        c1.setUserName("大汉关之琳");
        c1.setSex('女');
        c1.setPhone("2222222");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLogName("bzp888");
        b.setPassWord("123456");
        b.setUserName("大汉包租婆");
        b.setMoney(0);
        b.setSex('女');
        b.setPhone("010-123456");
        b.setAddress("地球村-1组8队");
        b.setShopName("包租婆国际影城");
        ALL_USERS.add(b);

        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies);
        
        Movie bMovie = new Movie("少林寺","刘德华",120.5,50,55.5,"2021/12/12 11:30");
        Movie bMovie1 = new Movie("战狼","吴京",120.5,50,55.5,"2021/12/12 11:30");
        Movie bMovie2 = new Movie("霸王别姬","张国荣",120.5,50,55.5,"2021/12/12 11:30");
        movies.add(bMovie);
        movies.add(bMovie1);
        movies.add(bMovie2);

        Business b1 = new Business();
        b1.setLogName("bzg888");
        b1.setPassWord("123456");
        b1.setUserName("大汉包租公");
        b1.setMoney(0);
        b1.setSex('男');
        b1.setPhone("010-123457");
        b1.setAddress("月球村-1组8队");
        b1.setShopName("包租公宇宙影城");
        ALL_USERS.add(b1);        

        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(b1, movies2);
        movies2.add(bMovie);
        movies2.add(bMovie2);
    }

    public static void main(String[] args) {
        
        /**
            首页/登录/商家界面/用户界面 
            四个页面的设计
         */
        // 首页: 登录,,商家入住,,客户注册功能
        // 商家与客户公用一个登录功能
        // 判断用户,根据用户类型 分别进入不同页面
        showMain();

        
    }

    private static void showMain() {
        while(true){
            System.out.println("   ==========大汉电影系统==========");
            String menu = "\t+---+----------------+\n"+
                          "\t| 1 |    登录系统    |\n"+
                          "\t+---+----------------+\n"+
                          "\t| 2 |    用户注册    |\n"+
                          "\t+---+----------------+\n"+
                          "\t| 3 |    商家注册    |\n"+
                          "\t+---+----------------+\n"+
                          "\t| 4 |    退出系统    |\n"+
                          "\t+---+----------------+\n";
            System.out.print(menu);
            // System.out.println("\t1-登录");
            // System.out.println("\t2-用户注册");
            // System.out.println("\t3-商家注册");
            // System.out.println("\t4-退出系统");
            System.out.println("请输入操作命令: ");
            String cmd = SYS_SC.nextLine();
            switch(cmd){
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    System.out.println("\t欢迎您下次光临本系统");
                    System.out.println("===========系统退出==========");
                    return;
                default:
                System.out.println("命令输入错误,请重新输入: ");
            }
        }
    }

    private static void login() {
       while(true){
            System.out.println("输入登录的名称: ");
            String loginName = SYS_SC.nextLine();
            System.out.println("输入用户的密码: ");
            String passWord = SYS_SC.nextLine();

            //根据登录名查询用户对象
            User u = getUserByLoginName(loginName);
            //判断用户对象是否存在,
            if(u != null){
                if(u.getPassWord().equals(passWord)){
                    // 登录成功
                    // 判断是商家还是普通用户
                    loginUser = u;
                    LOGGER.info(u.getUserName()+"登录了系统~~~~~");
                    if(u instanceof Customer){
                        // 普通用户
                        showCustomerMain();
                    }else{
                        // 商家用户
                        showBusinessMain();
                    }
                    return;
                }else{
                    System.out.println("密码错误---");
                }
            }else{
                System.out.println("登录名错误,请重新输入: ");
            }
        } 

    }
    // 商家界面
    private static void showBusinessMain() {
        while(true){
            System.out.println("========商家界面========");
            LOGGER.info(loginUser.getUserName()+"商家, 正在看自己的详情~~~~~~");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男'?"先生":"女士")
                                + "您好! 请选择商家的操作功能 ");
            System.out.println("1-展示详情");
            System.out.println("2-上架电影");
            System.out.println("3-下架电影");
            System.out.println("4-修改电影");
            System.out.println("5-退出");
            System.out.println("请输入您的命令: ");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "1":
                    // 展示全部拍片信息
                    showBusinessInfo();;
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMoive();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "你好,你成功退出了系统");
                    return; // 返回上一次系统界面
                default:
                    System.out.println("命令输入错误!");
                    break;
            }
        }
    }
    // 更新
    private static void updateMoive() {
        System.out.println("========更新电影=========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business); 
        if(movies.size() == 0){
            System.out.println("当前无片可以更新~~");
            return;
        }
        System.out.println("输入需要更新的电影: ");
        String movieName = SYS_SC.nextLine();
        Movie movie = getMovieByName(movieName);
        if(movie != null){
            // 修改
            System.out.println("输入更新影片名称: ");
            String name = SYS_SC.nextLine();
            System.out.println("输入更新影片主演: ");
            String actor = SYS_SC.nextLine();
            System.out.println("输入更新影片时长: ");
            String time = SYS_SC.nextLine();
            System.out.println("输入更新影片票价: ");
            String price = SYS_SC.nextLine();
            System.out.println("输入更新影片票数: ");
            String lefNum = SYS_SC.nextLine();
            System.out.println("输入影片更新放映时间: ");
            String stime = SYS_SC.nextLine();
            try {
                movie.setName(name);
                movie.setActor(actor);
                movie.setTime(Double.valueOf(time));
                movie.setPrice(Double.valueOf(price));
                movie.setLefNum(Integer.valueOf(lefNum));
                movie.setStartTime(sdf.parse(stime));

                System.out.println(movie.getName() + "影片放映时间更新成功");
                showBusinessInfo();
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间输入错误");
            }
            System.out.println("您的商铺电影已经更新成功: " + movie.getName());
            return;
        }else{
            System.out.println("您没有上架该影片");
            return;
        }
    }

    // 下架
    private static void deleteMovie() {
        System.out.println("========下架电影=========");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size() == 0){
            System.out.println("当前无片可以下架~~");
            return;
        }
        System.out.println("输入需要下架的电影: ");
        String movieName = SYS_SC.nextLine();
        Movie moive = getMovieByName(movieName);
        if(moive != null){
            movies.remove(moive);
            System.out.println("您的商铺已经下架成功: " + moive.getName());
            showBusinessInfo();
            return;
        }else{
            System.out.println("您没有上架该影片");
            return;
        }
    }
    // 查询电影
    private static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(movieName)){
                return movie;
            }
        }
        return null;  
    }

    // 上架电影
    private static void addMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("输入影片名称: ");
        String name = SYS_SC.nextLine();
        System.out.println("输入影片主演: ");
        String actor = SYS_SC.nextLine();
        System.out.println("输入影片时长: ");
        String time = SYS_SC.nextLine();
        System.out.println("输入影片票价: ");
        String price = SYS_SC.nextLine();
        System.out.println("输入影片票数: ");
        String lefNum = SYS_SC.nextLine();
        System.out.println("输入影片放映时间: ");
        String stime = SYS_SC.nextLine();
        try {
            Movie movie = new Movie(name,actor,Double.valueOf(time),Integer.valueOf(lefNum),Double.valueOf(price),sdf.parse(stime));
            movies.add(movie);
            System.out.println(movie.getName() + "影片成功上映");
            return;
        } catch (ParseException e) {
            e.printStackTrace();
            LOGGER.error("时间输入错误");
        }
    }

    // 展示当前登录的商家信息
    private static void showBusinessInfo() {
        System.out.println("========商家详情界面========");
        // 商家对象最为map的key ,提取对应的值(拍片信息)
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t" + business.getAddress()+"\t\t"+business.getPhone());
        List<Movie> movies = ALL_MOVIES.get(loginUser);
        System.out.println("片名\t\t主 演\t时长\t\t评分\t票价\t余票数量\t放映时间");
        if(movies.size() > 0){
            for (Movie movie : movies) {
                System.out.println(
                    movie.getName()+"\t\t"+movie.getActor()+"\t"+movie.getTime()+"\t\t"+movie.getScore()
                    +"\t"+movie.getPrice()+"\t"+movie.getLefNum()+"\t\t"+sdf.format(movie.getStartTime())
                );
            }
        }else{
            System.out.println("当前无电影可以播放");
        }
    }

    // 用户界面
    private static void showCustomerMain() {
        while (true) {
            System.out.println("========客户界面========");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男'?"先生":"女士")
                                + "您好! 请选择用户的操作功能 ");
            System.out.println("1-展示全部影片信息");
            System.out.println("2-根据电影名称查询电影信息");
            System.out.println("3-评分功能");
            System.out.println("4-购票功能");
            System.out.println("5-退出");
            String cmd = SYS_SC.nextLine();
            switch (cmd) {
                case "1":
                    // 展示全部影片信息
                    showAllMovies();
                    break;
                case "2":
                    // 查询电影信息
                  
                    break;
                case "3":
                    // 评分功能
                    
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "你好,你成功退出了系统");
                    return; // 返回上一次系统界面
                default:
                    System.out.println("命令输入错误!");
                    break;
            }
            
        }
    }

  
    private static void buyMovie() {
        System.out.println("================用户购票==================");
        showAllMovies();
        while (true) {
            System.out.println("输入买票的商铺: ");
            String shopName = SYS_SC.nextLine();
            // 查询商家是否存在,
            Business business = getUserByShopName(shopName);
            if (business == null) {
                System.out.println("没有这个商铺信息~~~");
            }else{
                // 此商店全部影片
                List<Movie> movies = ALL_MOVIES.get(business);
                if (movies.size() > 0) {
                    // 开始选片
                    while (true) {
                        System.out.println("输入够买的电影片名: ");
                        String movieName = SYS_SC.nextLine();
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if (movie != null) {
                            // 开始够买
                            // 判断电影票够否
                            while (true) {
                                System.out.println("输入购买的票数量: ");
                                String Num = SYS_SC.nextLine();
                                int buyNum = Integer.valueOf(Num);
                                if (movie.getLefNum() >= buyNum) {
                                    // 可以购票了
                                    // 当前需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()
                                    *buyNum).doubleValue();
                                    if (loginUser.getMoney() > money) {
                                        // 够买
                                        System.out.println("成功购买了"+ movie.getName()+
                                        "电影片" + buyNum+"张,金额是: "+money);
                                        // 更新商家的余额
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setLefNum(movie.getLefNum() - buyNum);
                                        return;
                                    }else{
                                        // 钱不够
                                        System.out.println("您的钱不够!!!");
                                        System.out.println("是否继续买票? y/n");
                                        String cmd = SYS_SC.nextLine();
                                        switch (cmd) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("电影票不够,算了吧```");
                                            return;
                                        }
                                    }
                                } else {
                                    System.out.println(movie.getName() + "影片余票不足,只能够买:" + movie.getLefNum());
                                    System.out.println("是否继续买票? y/n");
                                    String cmd = SYS_SC.nextLine();
                                    switch (cmd) {
                                    case "y":
                                        break;
                                    default:
                                        System.out.println("电影票不够,算了吧```");
                                        return;
                                    }
                                }
                            }
                        } else {
                            System.out.println("电影名称有问题`````");
                        }
                    }
                }else{
                    System.out.println("电影院没有电影~~~~");
                    System.out.println("是否继续? y/n");
                    String cmd = SYS_SC.nextLine();
                    switch (cmd) {
                        case "y":
                            break;
                        default:
                            System.out.println("电影院没有电影,不够买影片了```");
                            return;
                    }
                }
            }
        }
    }

    private static Movie getMovieByShopAndName(Business business, String movieName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    private static Business getUserByShopName(String shopName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    private static void showAllMovies() {
        System.out.println("==============所有商家影片信息=================");
        ALL_MOVIES.forEach((business, movies) -> {
        System.out.println(business.getShopName() + "\t\t" + business.getAddress()+"\t\t"+business.getPhone());
        System.out.println("片名\t\t主 演\t时长\t\t评分\t票价\t余票数量\t放映时间");
        for (Movie movie : movies) {
            System.out.println(
                movie.getName()+"\t\t"+movie.getActor()+"\t"+movie.getTime()+"\t\t"+movie.getScore()
                +"\t"+movie.getPrice()+"\t"+movie.getLefNum()+"\t\t"+sdf.format(movie.getStartTime())
            );
        }
        });
    }

    public static User getUserByLoginName(String loginName){
        for (User user : ALL_USERS) {
            // User 有实例化,因此可以在静态方法中可以调用非静态成员变量和方法
            // 若没有实例化,或会出现编译报错
            if(user.getLogName().equals(loginName)){
                return user;
            }
        }
        return null; // 查无此用户
    }
}
