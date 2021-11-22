package Demo_database;

/**
 * 姓名: megoo74
 * 事件: 2021/11/21
 * 项目: Study-java
 */
public class Brand {
    private Integer id;
    private String brand_Name;
    private String company_Name;
    private Integer ordered;
    private String description;
    private Integer status_Brand;

    public Brand() {

    }

    public Brand(Integer id, String brand_Name, String company_Name, Integer ordered, String description, Integer status_Brand) {
        this.id = id;
        this.brand_Name = brand_Name;
        this.company_Name = company_Name;
        this.ordered = ordered;
        this.description = description;
        this.status_Brand = status_Brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_Name() {
        return brand_Name;
    }

    public void setBrand_Name(String brand_Name) {
        this.brand_Name = brand_Name;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus_Brand() {
        return status_Brand;
    }

    public void setStatus_Brand(Integer status_Brand) {
        this.status_Brand = status_Brand;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand_Name='" + brand_Name + '\'' +
                ", company_Name='" + company_Name + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", status_Brand=" + status_Brand +
                '}';
    }
}
