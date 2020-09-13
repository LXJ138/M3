package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFurits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,
                R.layout.fruit_item,fruitList);
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
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
