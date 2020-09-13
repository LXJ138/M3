package com.example.staggeredgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Notification;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }
    private void initFruits()
    {
        for(int i=0;i<2;i++)
        {
            Fruit apple=new Fruit(getRamdomLengthName("Apple"),R.drawable.apple);
            fruitList.add(apple);
            Fruit banana=new Fruit(getRamdomLengthName("Banana"),R.drawable.banana);
            fruitList.add(banana);
            Fruit orange=new Fruit(getRamdomLengthName("Orange"),R.drawable.orange);
            fruitList.add(orange);
            Fruit cherry=new Fruit(getRamdomLengthName("cherry"),R.drawable.cherry);
            fruitList.add(cherry);
            Fruit grape=new Fruit(getRamdomLengthName("grape"),R.drawable.grape);
            fruitList.add(grape);
            Fruit mango=new Fruit(getRamdomLengthName("mango"),R.drawable.mango);
            fruitList.add(mango);
            Fruit peach=new Fruit(getRamdomLengthName("peach"),R.drawable.peach);
            fruitList.add(peach);
            Fruit pear=new Fruit(getRamdomLengthName("pear"),R.drawable.pear);
            fruitList.add(pear);
            Fruit pineapple=new Fruit(getRamdomLengthName("pineapple"),R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit(getRamdomLengthName("strawberry"),R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit watermelon=new Fruit(getRamdomLengthName("watermelon"),R.drawable.watermelon);
            fruitList.add(watermelon);
        }


    }
    private String getRamdomLengthName(String name)
    {
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<length;i++)
        {
            builder.append(name);
        }
        return builder.toString();
    }
}
