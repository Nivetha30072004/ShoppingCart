import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Products {
    private ArrayList<String> productList = new ArrayList<>();

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }
}

