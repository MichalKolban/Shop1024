package entity;

public class Cloth extends Product {

    private String size;
    private String material;


    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material){
        super(id, productName, price, weight, color, productCount);
        this.size=size;
        this.material=material;
    }

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
