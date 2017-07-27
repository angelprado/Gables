package com.grabriel.aprado.gables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AngelPrado on 22/7/2017.
 */

public class CategoryItem {




    String category;
    Integer imagecategory;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getImagecategory() {
        return imagecategory;
    }

    public void setImagecategory(Integer imagecategory) {
        this.imagecategory = imagecategory;
    }

    public CategoryItem(String category, Integer imagecategory) {
        this.category = category;
        this.imagecategory = imagecategory;
    }

    public static ArrayList<CategoryItem> items;


    public static List<CategoryItem> CTitem(){
        items = new ArrayList<>() ;
        items.add(new CategoryItem("Restaurant",R.drawable.ic_home_black_24dp));
        items.add(new CategoryItem("Bar",R.drawable.ic_dashboard_black_24dp));
        items.add(new CategoryItem("Park",R.drawable.ic_notifications_black_24dp));
        items.add(new CategoryItem("Event",R.drawable.ic_settings_black_24dp));
        items.add(new CategoryItem("Free",R.drawable.ic_dashboard_black_24dp));



        return items;

    }

}
