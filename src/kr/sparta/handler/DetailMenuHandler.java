package kr.sparta.handler;

import kr.sparta.data.MenuEnum;
import kr.sparta.data.MenuContext;
import kr.sparta.domain.Product;
import kr.sparta.ui.DetailUi;
import kr.sparta.util.CommonUtil;
import java.util.List;
import java.util.stream.Collectors;

public class DetailMenuHandler {
    private final DetailUi detailUi = DetailUi.getInstance();
    private BasketHandler basketHandler = BasketHandler.getInstance();
    private MenuContext menuContext = MenuContext.INSTANCE;
    private List<Product> productList;

    private DetailMenuHandler() {

    }

    private static final DetailMenuHandler instance = new DetailMenuHandler();

    public static DetailMenuHandler getInstance() {
        return instance;
    }
    //디테일페이지에서 해줘야 할 것들을 담당하는 클래스 ex) 해당 메뉴에서 분기되는 부분들. 장바구니에 넣어준다던가 하는 부분들.
    //메인으로부터 입력받은 메뉴(종류)를 출력하기 위해 메뉴(종류)를 ui로 전달해주고 해당 페이지에서 갈 수 있는 페이지로 이동시켜준다.
    public void handleDetailPage(MenuEnum menuName) {
        //메뉴 카테고리에서 특정 번호를 선택하면 그 메뉴 카테고리 이름이 현재 메소드로 전달되고 여러가지 상품이 섞여있는 productList에서 필터링 해주는 부분.
        //예) 버거를 선택함 -> 상품 타입값이 버거인 것만 상품만 추려줘.
        productList = menuContext.getProductList().stream()
                .filter(v -> v.getMenuEnum().equals(menuName))
                .collect(Collectors.toList());

        //만약 출력된 상품번호 외의 번호를 입력했을 경우 예외처리를 해주는 부분.
        int menuNumber;
        while (true) {
            detailUi.printDetailPage(productList);
            menuNumber = CommonUtil.getNumber();
            if (menuNumber <= 0 || menuNumber > productList.size()) {
                CommonUtil.printError();
            } else {
                break;
            }
        }
        Product selectedProduct = productList.get(menuNumber - 1);

        while_loop:
        while (true) {
            detailUi.printChoiceConfirmText(selectedProduct);
            int choice = CommonUtil.getNumber();
            switch (choice) {
                case 1:
                    basketHandler.addToMyBasket(selectedProduct);
                    break while_loop;
                case 2:
                    break while_loop;
                default:
                    CommonUtil.printError();
                    break;
            }
        }
    }


}
