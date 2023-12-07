package com.tankwar.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.tankwar.app.screen.GameScene;

public class TankWar extends AppCompatActivity {

    private FrameLayout mainWindow;

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState
     *
     * Tab 0.2
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //Tag 0.3
        ResourceManager.loadResources(this);

        GameScene gameScene = new GameScene(this);

        setContentView(R.layout.main);
        mainWindow = (FrameLayout) findViewById(R.id.mainWindow);
        mainWindow.addView(gameScene);
        gameScene.setVisibility(View.VISIBLE);
        mainWindow.bringChildToFront(gameScene);
    }

}