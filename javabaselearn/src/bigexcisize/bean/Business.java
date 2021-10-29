package bean;

/**
    独有属性
    店铺名称 -- 地址

 */
public class Business extends User{
    private String shopName;
    private String address;


    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}