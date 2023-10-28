package kr.sparta.test;

import kr.sparta.data.MenuEnum;
import kr.sparta.data.MenuContext;
import kr.sparta.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class DomainTest {
    public static void main(String[] args) {
        MenuContext menuContext = MenuContext.INSTANCE;
        List<Product> product = menuContext.getProductList().stream()
                .filter(v -> v.getMenuEnum().equals(MenuEnum.ICECREAM))
                .collect(Collectors.toList());
        for(Product p : product) {
            System.out.println(p);
        }
    }
}
