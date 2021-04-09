package controllers;

import play.mvc.*;

import controllers.service.*;

import java.util.*;

import model.*;

import views.html.productview.*;

import views.html.index;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    productService service=new productService();

    public Result index() {
        List<Product> list=service.getList();
        for(Product product:list)
            System.out.println(product.toString());
        return ok("products shown");
    }

    public Result getProduct(int id){
        Product product=productService.getProductCache(id);
        if(product!=null){
            System.out.println(product.toString());
        }
        else{
            product=productService.getProduct(id);
            System.out.println(product.toString());
            productService.putProduct(product.getId(),product);
        }
        return ok("product returned");
    }

    public Result post(int id,String productName,String category,String productCity,String productState,String ownerName){
        Product product=new Product(id,productName,category,productCity,productState,ownerName);
        service.addProduct(product);
        List<Product> list=service.getList();

        for(Product p:list)
            System.out.println(p.toString());

        return ok("product added");
    }

    public Result delete(int id){

        service.deleteProduct(id);
        List<Product> list=service.getList();

        for(Product p:list)
            System.out.println(p.toString());

        return ok("product deleted");
    }

}
