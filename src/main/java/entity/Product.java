package entity;

public class Product {

    private Long id;
    private String productName;
    protected Float price;
    private Float weight;
    private String color;
    protected Integer productCount;

    public Product (Long id, String productName, Float price, Float weight, String color, Integer productCount){
        this.id=id;
        this.productName=productName;
        this.price = price;
        this.weight=weight;
        this.color=color;
        this.productCount =productCount;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(Float price){
        this.price=price;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(Float weight){
        this.weight=weight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getProductCount(){
        return productCount;
    }
    public void setProductCount(Integer productCount){
        this.productCount= productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
