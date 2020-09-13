package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Msg> msgList=new ArrayList<>();
    private RecyclerView msgRecyclerView;
    private EditText inputText;
    private Button send;
    private MsgAdapter msgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMsgs();
        msgRecyclerView=findViewById(R.id.msg_recycler_view);
        inputText=findViewById(R.id.input_text);
        send=findViewById(R.id.send);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        msgAdapter=new MsgAdapter(msgList);
        msgRecyclerView.setAdapter(msgAdapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content=inputText.getText().toString();
                //内容不为空则创建出一个新的Msg对象
                if(!"".equals(content))
                {
                    Msg msg=new Msg(content,Msg.TYPE_SEND);
                    msgList.add(msg);
                    //当有新消息时，刷新ListView中的显示
                    //通知列表有新的数据插入
                    msgAdapter.notifyItemInserted(msgList.size()-1);
                    //将listview定位到最后一行
                    msgRecyclerView.scrollToPosition(msgList.size()-1);
                    inputText.setText("");//清空输入框的内容
                }
            }
        });
    }
    private void initMsgs()
    {
        Msg msg1=new Msg("Hello guy",Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2=new Msg("Who is that?",Msg.TYPE_SEND);
        msgList.add(msg2);
        Msg msg3=new Msg("This is Tom.Nice talking to yu.",Msg.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
