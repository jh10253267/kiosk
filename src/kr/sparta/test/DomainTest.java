package kr.sparta.test;

import kr.sparta.MenuEnum;
import kr.sparta.data.MenuContext;
import kr.sparta.domain.Menu;
import kr.sparta.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class DomainTest {
    public static void main(String[] args) {
        MenuContext menuContext = new MenuContext();
        List<Product> product = menuContext.getProductList().stream()
                .filter(v -> v.getMenuEnum().equals(MenuEnum.BURGER))
                .collect(Collectors.toList());
        for(Product p : product) {
            System.out.println(p);
        }
    }
}
