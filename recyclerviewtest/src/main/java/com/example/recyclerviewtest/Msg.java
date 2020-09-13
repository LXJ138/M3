package com.example.recyclerviewtest;

public class Msg {
    public static final int TYPE_RECEIVED=0;//(收到的)
    public static final int TYPE_SEND=1;//(发出的)
    private String content;//消息的内容
    private int type;//消息的类型(两个值可选)
    public Msg(String content,int type)
    {
        this.content=content;
        this.type=type;
    }
    public String getContent()
    {
        return content;
    }
    public int getType()
    {
        return type;
    }
}
