package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint1  = new Paint();
    Paint paint2  = new Paint();
    Path path = new Path();
    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    void init(){
        paint1.setStrokeWidth(1);
        paint1.setColor(Color.WHITE);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setTextSize(22);
        paint1.setTextAlign(Paint.Align.CENTER);

        paint2.setColor(Color.GREEN);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);

        path.moveTo(100,100);
        path.lineTo(100,600);
        path.lineTo(1000,600);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        canvas.drawPath(path,paint1);

        canvas.drawRect(120,595,200,600,paint2);
        canvas.drawText("Froyo",160,650,paint1);

        canvas.drawRect(220,575,300,600,paint2);
        canvas.drawText("GB",260,650,paint1);

        canvas.drawRect(320,575,400,600,paint2);
        canvas.drawText("ICS",360,650,paint1);

        canvas.drawRect(420,445,500,600,paint2);
        canvas.drawText("JB",460,650,paint1);

        canvas.drawRect(520,330,600,600,paint2);
        canvas.drawText("KitKat",560,650,paint1);

        canvas.drawRect(620,275,700,600,paint2);
        canvas.drawText("L",660,650,paint1);

        canvas.drawRect(720,475,800,600,paint2);
        canvas.drawText("M",760,650,paint1);
    }
}
