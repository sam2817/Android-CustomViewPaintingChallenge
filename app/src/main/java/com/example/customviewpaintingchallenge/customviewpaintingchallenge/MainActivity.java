package com.example.customviewpaintingchallenge.customviewpaintingchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* // Get height or width of screen
    int screenHeight = DeviceDimensionsHelper.getDisplayHeight(this);
    int screenWidth = DeviceDimensionsHelper.getDisplayWidth(this);
    // Convert dp to pixels
    float px = DeviceDimensionsHelper.convertDpToPixel(25f, this);
    // Convert pixels to dp
    float dp = DeviceDimensionsHelper.convertPixelsToDp(25f, this); */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView1 = (ImageView) findViewById(R.id.colorSelectImageView);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(MainActivity.this, imageView1);

                // inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                // registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popup.show(); //showing popup menu
            }
        }); //closing the setOnClickListener method
    }
}
