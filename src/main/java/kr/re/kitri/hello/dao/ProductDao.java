package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    public String selectProduct() {
        //DB 접속 ... 쿼리 날려요...
        //Mybatis...
        //...

        return "상품목록 받으세요";

    }

    public Product selectProductById(int i) {
        //DB에서 조회
        Product p = new Product(i, "아이폰11",500000,"iphone");


        return p;

    }
}
