package org.o7planning.androidbasic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Example5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example5);

        Intent intent = getIntent();
        final String value1 = intent.getStringExtra("text1");
        final String value2 = intent.getStringExtra("text2");

        final TextView text1 = (TextView) this.findViewById(R.id.textView7);
        final TextView text2 = (TextView) this.findViewById(R.id.textView8);

        text1.setText(value1);
        text2.setText(value2);

        Button button = (Button) this.findViewById(R.id.button4);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("On Click Button");
            }
        });
        button.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                text2.setText("On Long Click Button");
                return true;
            }
        });
    }
}
