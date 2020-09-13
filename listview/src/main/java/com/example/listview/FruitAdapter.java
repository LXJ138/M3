package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FruitAdapter extends ArrayAdapter {
    private int resoureId;//ListView子项布局的id
    private List<Fruit> mlist;
    public FruitAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resoureId=textViewResourceId;
        mlist=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit=mlist.get(position);//获取当前项的Fruit实例
        View view;
        ViewHolder viewHolder;
        if(convertView==null)
        {
            view= LayoutInflater.from(getContext()).inflate(resoureId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage=view.findViewById(R.id.fruit_image);
            viewHolder.fruitName=view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }
        else {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
