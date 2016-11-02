package com.example.tv.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ViewPager viewpager;
    private int ImageArray[]={R.drawable.lp,R.drawable.lcf,R.drawable.dry,R.drawable.szgt};
    private List<ImageView> list;



    private Handler hd=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int item = (viewpager.getCurrentItem()+1) % list.size();
            viewpager.setCurrentItem(item);
            hd.sendEmptyMessageDelayed(0,2000);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        list=new ArrayList<>();


        for (int i=0;i<ImageArray.length;i++){

            ImageView iv=new ImageView(this);
            iv.setImageResource(ImageArray[i]);
           // ImageView的对象一定要重新new出来，因为list中如果装的是同一对象的话，
            // 后者会覆盖掉前者
            list.add(iv);

        }


        viewpager.setAdapter(new PagerAdapter() {

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }


            @Override
            public Object instantiateItem(ViewGroup container, int position) {


                ImageView imageView = list.get(position);
                container.addView(imageView);
                return imageView;
            }


            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
              //  container.removeView((View) object);
                container.removeView(list.get(position));
            }
        });

        hd.removeMessages(0);
        hd.sendEmptyMessageDelayed(0,2000);

    }

}
