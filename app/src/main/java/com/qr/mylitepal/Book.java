package com.qr.mylitepal;

import org.litepal.crud.DataSupport;

/*********************************************
 * 作者：最帅气的 Chen·Meng
 * 人称：
 * 铁齿金不换，诚实可靠小郎君！
 *********************************************/

public class Book extends DataSupport{

    private int id;
    private String author;
    private double price;
    private int pages;
    private String name;

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    //版本更新加一个列-- 出版社
    private String press;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

