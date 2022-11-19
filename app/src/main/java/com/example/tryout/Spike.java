package com.example.tryout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Spike {
    Bitmap spike[] = new Bitmap[3];
    int spikeFrame = 0;
    int spikeX, spikeY, spikeVelocity;
    Random random;

    public Spike(Context context){
        spike[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.pixel_onigiri0);
        spike[0] = Bitmap.createScaledBitmap(spike[0], 120, 120, true);
        spike[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.pixel_onigiri2);
        spike[1] = Bitmap.createScaledBitmap(spike[0], 120, 120, true);
        spike[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.pixel_onigiri1);
        spike[2] = Bitmap.createScaledBitmap(spike[0], 120, 120, true);
        random = new Random();
        resetPosition();

    }
    public Bitmap getSpike(int spikeFrame){
        return spike[spikeFrame];
    }

    public int getSpikeWidth(){
        return spike[0].getWidth();
    }

    public int getSpikeHeight(){
        return spike[0].getHeight();
    }

    public void resetPosition() {
        spikeX = random.nextInt(GameView.dWidth - getSpikeWidth());
        spikeY = -200 + random.nextInt(600) * -1;
        spikeVelocity = 35 + random.nextInt(16);
    }

}
