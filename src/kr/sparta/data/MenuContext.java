package kr.sparta.data;

import kr.sparta.domain.Menu;
import kr.sparta.domain.Product;
import java.util.List;

import static kr.sparta.data.MenuEnum.*;

public enum MenuContext {
    INSTANCE;
    private static List<Menu> menuList;

    private static List<Product> productList;


    MenuContext() {
        initializeData();
    }

    private void initializeData() {
        menuList = List.of(new Menu("BURGER", "앵거스 비프 통살을 다져만든 버거"),
                new Menu("ICECREAM", "매장에서 신선하게 만드는 아이스크림"),
                new Menu("DRINKS", "매장에서 직접 만드는 음료"),
                new Menu("BEER", "뉴욕 브루클린 브루어리에서 양조한 맥주"));
        productList = List.of(new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9, BURGER),
                new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9, BURGER),
                new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4, BURGER),
                new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9, BURGER),
                new Product("Ice cream Test1", "test1", 5.4, ICECREAM),
                new Product("Ice cream Test2", "test1", 5.4, ICECREAM),
                new Product("Ice cream Test3", "test1", 5.4, ICECREAM),
                new Product("Ice cream Test4", "test1", 5.4, ICECREAM),
                new Product("Ice cream Test5", "test1", 5.4, ICECREAM),
                new Product("Drink Test1", "test", 1.1, DRINKS),
                new Product("Drink Test2", "test", 1.1, DRINKS),
                new Product("Drink Test3", "test", 1.1, DRINKS),
                new Product("Beer Test1", "test", 1.1, BEER),
                new Product("Beer Test2", "test", 1.1, BEER),
                new Product("Beer Test3", "test", 1.1, BEER)
        );

    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
}
