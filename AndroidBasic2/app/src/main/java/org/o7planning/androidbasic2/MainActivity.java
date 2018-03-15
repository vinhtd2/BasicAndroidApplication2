package org.o7planning.androidbasic2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get button through ID
        Button button1 = (Button) this.findViewById(R.id.go_button1);

        // Set onClick into Button1
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create one Intent
                // (Bring content to Example1Activity)
                Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);

                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");

                MainActivity.this.startActivity(myIntent);
            }
        });

        // Get button through ID
        Button button2 = (Button) this.findViewById(R.id.go_button2);

        // Set Click event on Button2
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);

                myIntent.putExtra("text1", "This is second text");
                myIntent.putExtra("text2", "This is second long text");

                MainActivity.this.startActivity(myIntent);
            }
        });

        // Get button through ID
        Button button3 = (Button) this.findViewById(R.id.go_button3);

        // set Click event on Button 3
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create Intent
                Intent myItent = new Intent(MainActivity.this, Example3Activity.class);

                myItent.putExtra("text1", "This is third text");
                myItent.putExtra("text2", "This is third long text");

                // Require run Example3Activity
                MainActivity.this.startActivity(myItent);
            }
        });

        // Get button through ID
        Button button4 = (Button) this.findViewById(R.id.go_button4);

        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Example4Activity.class);

                myIntent.putExtra("text1", "This is fourth text");
                myIntent.putExtra("text2", "This is fourth long text");
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button button5 = (Button) this.findViewById(R.id.go_button5);

        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Example5Activity.class);
                myIntent.putExtra("text1", "This is fifth text");
                myIntent.putExtra("text2", "This if fifth long text");
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
