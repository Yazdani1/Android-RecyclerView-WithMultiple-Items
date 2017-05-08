package com.yazdaniscodelab.recyclerviewanother;

/**
 * Created by Yazdani on 5/8/2017.
 */

public class DataItem {

    public DataItem(int image_res,String title,String description,String price){

        this.setImage_res(image_res);
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);

    }


    int image_res;
    String title;
    String description;
    String price;

    public int getImage_res(){
        return image_res;
    }

    public void setImage_res(int image_res){

        this.image_res=image_res;

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price=price;
    }

}
