package com.example.win.listviewcustomadapterapp;

import android.media.session.PlaybackState;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] images={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    String[] names={"name","name","name","name","name","name","name"};
    String[] desc={"desc","desc","desc","desc","desc","desc","desc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list_view);

        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);


    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.list_item,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textViewName=(TextView)view.findViewById(R.id.name);

            TextView textViewDesc=(TextView)view.findViewById(R.id.desc);

            imageView.setImageResource(images[i]);
            textViewName.setText(names[i]);
            textViewDesc.setText(desc[i]);
            textViewDesc.setText(desc[i]);



            return view;
        }
    }
}
