package com.company.project6informationbook;

public class Modal {

    private String ImageName;
    private String CategoryName;

    public Modal(String imageName, String categoryName) {


        ImageName = imageName;
        CategoryName = categoryName;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }


}
