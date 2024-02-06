package lessons.lesson24.sklad.service;

import lessons.lesson24.sklad.entity.Category;
import lessons.lesson24.sklad.entity.Product;
import lessons.lesson24.sklad.entity.Sklad;

public class AddProduct {

    InputData inputData = new InputData();

    public void addNewProduct(Sklad sklad, Category category){

        int id = inputData.UserInputInt("введите порядковый номер товара:");
        String name = inputData.UserInputLine("введите название товара:");
        int count = inputData.UserInputInt("введите количество товара:");
        int categoryId = inputData.UserInputInt("введите порядковый номер категории товара:");

        Product newProduct = new Product(id,name,count,categoryId);

        sklad.addProduct(newProduct);
    }
}
