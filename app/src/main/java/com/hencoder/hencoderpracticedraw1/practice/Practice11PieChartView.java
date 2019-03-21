package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint paint1  = new Paint();
    Paint paint2  = new Paint();
    Path path = new Path();
    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    void init(){
        paint1.setStrokeWidth(1);
        paint1.setColor(Color.WHITE);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setTextSize(26);
        paint1.setTextAlign(Paint.Align.LEFT);
        paint1.setAntiAlias(true);


        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
    }

    float points1[] = {150,100,250,100,250,100,270,120};
    float points2[] = {550,250,600,200,600,200,720,200};
    float points3[] = {600,310,650,310,650,310,680,340,680,340,720,340};
    float points4[] = {600,350,650,350,650,350,680,400,680,400,720,400};
    float points5[] = {510,430,600,500,600,500,720,500};
    float points6[] = {150,500,250,500,250,500,300,450};

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        canvas.drawText("Lolilpop",70,100,paint1);
        canvas.drawLines(points1,paint1);

        paint2.setColor(Color.RED);
        canvas.drawArc(180,80,580,480,180,120,true,paint2);

        canvas.drawText("Marshmallow",750,200,paint1);
        canvas.drawLines(points2,paint1);
        paint2.setColor(Color.YELLOW);
        canvas.drawArc(200,100,600,500,-60,55,true,paint2);

        canvas.drawText("Froyo",750,300,paint1);
        canvas.drawLine(600,290,720,290,paint1);
        paint2.setColor(Color.GRAY);
        canvas.drawArc(200,100,600,500,-3,2,true,paint2);

        canvas.drawText("GB",750,350,paint1);
        canvas.drawLines(points3,paint1);
        paint2.setColor(Color.MAGENTA);
        canvas.drawArc(200,100,600,500,2,5,true,paint2);

        canvas.drawText("Ice Cream SanWich",750,400,paint1);
        canvas.drawLines(points4,paint1);
        paint2.setColor(Color.DKGRAY);
        canvas.drawArc(200,100,600,500,9,6,true,paint2);

        canvas.drawText("Jelly Bean",750,500,paint1);
        canvas.drawLines(points5,paint1);
        paint2.setColor(Color.GREEN);
        canvas.drawArc(200,100,600,500,17,70,true,paint2);

        canvas.drawText("Kit kat",100,500,paint1);
        canvas.drawLines(points6,paint1);
        paint2.setColor(Color.BLUE);
        canvas.drawArc(200,100,600,500,89,88,true,paint2);

    }
}
