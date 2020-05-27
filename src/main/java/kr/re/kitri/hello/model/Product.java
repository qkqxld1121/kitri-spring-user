package kr.re.kitri.hello.model;

public class Product {
    private String productId;
    private String name;    //테이블에 컬럼명과 동일하게 가면 좋다.
    private long price;
    private String description;

    public Product() { }

    public Product(String productId, String name, long price, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product(int i, String 아이폰11, int price, String iphone) {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
