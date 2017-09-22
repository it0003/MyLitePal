package com.qr.myui;

/*********************************************
 * 作者：最帅气的 Chen·Meng
 * 人称：
 * 铁齿金不换，诚实可靠小郎君！
 *********************************************/

public class Fruit {

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    private String name;
    private int imageId;
}
