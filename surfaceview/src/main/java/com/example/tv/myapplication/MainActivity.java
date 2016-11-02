package com.example.tv.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {


    private Animate animate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);
        setContentView(new Animate(this));
    //    animate = (Animate) findViewById(R.id.animate);

    }

    class Animate extends View {

        float radius = 10;
        Paint paint;

        public Animate(Context context) {
            super(context);
            paint = new Paint();
            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.STROKE);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            canvas.translate(200, 200);
            canvas.drawCircle(0, 0, radius++, paint);

            if(radius > 100){
                radius = 10;
            }

            invalidate();//通过调用这个方法让系统自动刷新视图

        }

    }

}
