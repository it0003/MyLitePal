package com.qr.mylitepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button
            btn1,
            btn2,
            btn3,
            btn4,
            btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.createDB_btn);
        btn2 = (Button) findViewById(R.id.insertDB_btn);
        btn3 = (Button) findViewById(R.id.updateDB_btn);
        btn4 = (Button) findViewById(R.id.delDB_btn);
        btn5 = (Button) findViewById(R.id.queryDB_btn);
        initListener();
    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //创建、升级数据库
            case R.id.createDB_btn:
                LitePal.getDatabase();
                break;

            //添加新数据
            case R.id.insertDB_btn:
                Book book = new Book();
                book.setName("LOL");
                book.setAuthor("Edson Chen");
                book.setPages(454);
                book.setPrice(19.98);
                book.setPress("Unknow");
                book.save();
                Toast.makeText(this, "增加", Toast.LENGTH_SHORT).show();
                break;

            //
            case R.id.updateDB_btn:
                Book bookU = new Book();
                bookU.setName("DMC");
                bookU.setAuthor("Jaick Chen");
                bookU.setPages(609);
                bookU.setPrice(109.08);
                bookU.setPress("Unknow");
                bookU.save();
                bookU.setPrice(998.00);
                bookU.setPress("MY.JK.One");
                bookU.setToDefault("pages");//页码置零
                bookU.updateAll("name=? and author =?", "DMC", "Jaick Chen");
                Toast.makeText(this, "更改", Toast.LENGTH_SHORT).show();
                break;

            case R.id.delDB_btn:
                DataSupport.deleteAll(Book.class, "price>?", "10");
                Toast.makeText(this, "删除", Toast.LENGTH_SHORT).show();
                break;

            case R.id.queryDB_btn:
                List<Book> books = DataSupport.findAll(Book.class);
                for (Book bookQ : books) {
                    Log.i("haha", "书的名字是：" + bookQ.getName());
                    Log.i("haha", "书的价格是：" + bookQ.getPrice());
                    Log.i("haha", "书的页码是：" + bookQ.getPages());
                    Log.i("haha", "书的作者是：" + bookQ.getAuthor());
                    Log.i("haha", "书的出版是：" + bookQ.getPress());
                }
                break;

            default:
                break;
        }
    }
}
