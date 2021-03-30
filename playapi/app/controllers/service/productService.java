package controllers.service;

import java.util.List;
import java.util.ArrayList;

import play.mvc.*;

import model.*;

import views.html.products.*;

public class productService extends Controller{

    List<Product> list=new ArrayList<>();

    public productService() {
        list.add(new Product(1,"baleno","car","chandigarh","punjab","abc"));
        list.add(new Product(2,"BMW","car","chandigarh","punjab","abc"));
        list.add(new Product(3,"audi","car","chandigarh","punjab","abc"));
        list.add(new Product(4,"duster","car","chandigarh","punjab","abc"));
        list.add(new Product(5,"fortuner","car","chandigarh","punjab","abc"));
        list.add(new Product(6,"octave","pen","chandigarh","punjab","abc"));
        list.add(new Product(7,"butterflow","pen","chandigarh","punjab","abc"));
        list.add(new Product(8,"parker","pen","chandigarh","punjab","abc"));
        list.add(new Product(9,"trimax","pen","chandigarh","punjab","abc"));
        list.add(new Product(10,"gel","pen","chandigarh","punjab","abc"));
    }


    //return all products
    public List<Product> getList() {
        //new productService();
        return list;
    }

    //add a product
    public List<Product> addProduct(Product product){
        list.add(product);
        return list;
    }

    //delete a product
    public List<Product> deleteProduct(int id){

        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(i);
                break;
            }
        }

        return list;
    }
}