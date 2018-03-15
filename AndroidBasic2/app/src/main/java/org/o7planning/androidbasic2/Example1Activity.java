package org.o7planning.androidbasic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Example1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);

        Intent intent = getIntent();

        // The variable in Intent passed from Main Activity
        String value1 = intent.getStringExtra("text1");

        // The variable in Intent passed from Main Activity
        String value2 = intent.getStringExtra("text2");

        // Find variable in Interface by ID
        final TextView text1 = (TextView)this.findViewById(R.id.my_text1);

        // Find variable in Interface by ID
        final TextView text2 = (TextView)this.findViewById(R.id.my_text2);

        text1.setText(value1);
        text2.setText(value2);

        Button button = (Button)this.findViewById(R.id.my_button1);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("You click button");
            }
        });

        button.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                text2.setText("You long click button");
                return true;
            }
        });
    }
}
