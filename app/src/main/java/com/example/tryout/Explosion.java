package com.example.tryout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[4];
    int explosionFrame = 0;
    int explosionX, explosionY;

    public Explosion(Context context){
        explosion[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.cloud_explode0);
        explosion[0] = Bitmap.createScaledBitmap(explosion[0], 100, 100, true);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.cloud_explode1);
        explosion[1] = Bitmap.createScaledBitmap(explosion[0], 100, 100, true);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.cloud_explode2);
        explosion[2] = Bitmap.createScaledBitmap(explosion[0], 100, 100, true);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.cloud_explode3);
        explosion[3] = Bitmap.createScaledBitmap(explosion[0], 100, 100, true);

    }

    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }
}
