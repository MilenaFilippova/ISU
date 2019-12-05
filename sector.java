package com.example.sector;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;


import androidx.annotation.Nullable;

import android.content.Context;

import java.util.Random;


public class SectorView extends View {
    Path sector = new Path();

    int min_angle = 10;
    int max_angle = 180;
    int diff = min_angle -  max_angle = 180;
    Random random = new Random();
    int i = random.nextInt(diff + 1);
    i+= min_angle;

    public SectorView(Context context) {
        super(context);
    }

    public SectorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // координаты середины экрана
        float w = canvas.getWidth(), h = canvas.getHeight();
        float a = 180;
        float b = 90;

        // создаём треугольный контур
        /*sector.moveTo(w / 2, h / 2);
        sector.lineTo(w / 2, 0);
        sector.lineTo(w, h / 2);
        sector.lineTo(w / 2, h / 2);*/
        Paint p = new Paint();
        p.setColor(Color.BLUE);

        // отображаем контур на холсте
        canvas.drawPath(sector, p);

        sector.moveTo(w / 2, h / 2);
        sector.lineTo(w / 2, 0);
        canvas.drawArc(0, 0, w, w , a, b, true, p) ;
        sector.lineTo(w / 2, w / 2);

    }



}
