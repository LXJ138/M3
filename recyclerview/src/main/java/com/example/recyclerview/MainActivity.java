package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFurits();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        //设置布局的排列方向，默认纵向排列
        //设置布局横向排列，RecyclerView就可以横向滚动
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFurits()
    {
        Fruit apple=new Fruit("Apple",R.drawable.apple);
        fruitList.add(apple);
        Fruit banana=new Fruit("banana",R.drawable.banana);
        fruitList.add(banana);
        Fruit orange=new Fruit("orange",R.drawable.orange);
        fruitList.add(orange);
        Fruit cherry=new Fruit("cherry",R.drawable.cherry);
        fruitList.add(cherry);
        Fruit grape=new Fruit("grape",R.drawable.grape);
        fruitList.add(grape);
        Fruit mango=new Fruit("mango",R.drawable.mango);
        fruitList.add(mango);
        Fruit peach=new Fruit("peach",R.drawable.peach);
        fruitList.add(peach);
        Fruit pear=new Fruit("pear",R.drawable.pear);
        fruitList.add(pear);
        Fruit pineapple=new Fruit("pineapple",R.drawable.pineapple);
        fruitList.add(pineapple);
        Fruit strawberry=new Fruit("strawberry",R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit watermelon=new Fruit("watermelon",R.drawable.watermelon);
        fruitList.add(watermelon);
    }
}
