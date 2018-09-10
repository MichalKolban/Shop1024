package entity;

public class Boots extends Product {

    private Integer size;
    private Boolean isNaturalSkin;

    public Boots(Long id, String productName, Float price, Float weight, String color, Integer productCount, Integer size, Boolean isNaturalSkin){
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize(){
        return size;
    }
    public void setSize(Integer size){
        this.size=size;
    }
    public boolean isNaturalSkin(){
        return isNaturalSkin;
    }
    public void setNaturalSkin(Boolean isNaturalSkin){
        this.isNaturalSkin=isNaturalSkin;
    }
}
