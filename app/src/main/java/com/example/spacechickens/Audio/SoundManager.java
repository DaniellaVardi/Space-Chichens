package com.example.spacechickens.Audio;
import android.content.Context;
import android.media.MediaPlayer;

import com.example.spacechickens.R;

public class SoundManager {
    private MediaPlayer clickSound;
    private MediaPlayer chickenSound;
    private MediaPlayer starSound;

    public SoundManager(Context context) {
        clickSound = MediaPlayer.create(context, R.raw.click_sound);
        chickenSound = MediaPlayer.create(context, R.raw.chicken_sound);
        starSound = MediaPlayer.create(context, R.raw.star_sound);
    }

    public void playClickSound() {
        if (clickSound != null) {
            clickSound.start();
        }
    }

    public void playSwiperCollisionSound() {
        if (chickenSound != null) {
            chickenSound.start();
        }
    }

    public void playBagTouchSound() {
        if (starSound != null) {
            starSound.start();
        }
    }

    // Call this method when your activity is getting destroyed
    public void releaseResources() {
        if (clickSound != null) {
            clickSound.release();
        }
        if (chickenSound != null) {
            chickenSound.release();
        }
        if (starSound != null) {
            starSound.release();
        }
    }
}
