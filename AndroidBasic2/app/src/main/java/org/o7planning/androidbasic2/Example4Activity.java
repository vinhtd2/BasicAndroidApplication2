package org.o7planning.androidbasic2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Example4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.activity_example4_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout rootView = (RelativeLayout) this.findViewById(R.id.root_view);
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.menu_green:
                if(item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                rootView.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menu_red:
                if(item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                rootView.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_blue:
                if(item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                rootView.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}