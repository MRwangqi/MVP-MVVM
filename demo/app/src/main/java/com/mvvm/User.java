package com.mvvm;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2017/3/11.
 */

public class User {
    private String name;
    private int age;
    private String photos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    //    该方法必须为静态方法
    @BindingAdapter({"photos"})
    public static void getInternetImage(ImageView imageView, String photos) {
        Glide.with(imageView.getContext()).load(photos).into(imageView);
    }



}
