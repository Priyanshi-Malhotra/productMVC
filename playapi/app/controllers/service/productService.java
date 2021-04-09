package controllers.service;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import play.mvc.*;

import model.*;

import views.html.productview.*;

public class productService extends Controller{

    static List<Product> list=new ArrayList<>();

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


    private static final long TOKEN_BLOCK_TTL = 60; // 60  minutes.
    private static Cache<Integer, Product> apiCache = CacheBuilder.newBuilder().maximumSize(1000)
            .expireAfterAccess(TOKEN_BLOCK_TTL, TimeUnit.MINUTES).build();

    public static Product getProductCache(int key) {
        Product sign = apiCache.getIfPresent(key);
        if (sign!=null) {
            return sign;
        } else
            return null;
    }

    public static void putProduct(int key, Product sign) {
            apiCache.put(key, sign);
    }

    //return all products
    public List<Product> getList() {
        //new productService();
        return list;
    }

    //get a particular product
    public static Product getProduct(int id){
        for(Product product:list){
            if(product.getId()==id)
                return product;
        }
        return null;
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