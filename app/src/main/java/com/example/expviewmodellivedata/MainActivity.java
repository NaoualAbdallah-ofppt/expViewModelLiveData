package com.example.expviewmodellivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    EditText edit1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.txt1);
        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);

        model.data1.observe(
                this, itt -> //itt représente
                                 // la valeur de data1
                {
                    txt1.setText(itt);
                });

        edit1 = (EditText) findViewById(R.id.edit1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on a plus besoin de modifier le textView
                //c'est automatique
                model.setData1("ghjghgh");
                edit1.setText("modifié edit");

            }
        });
    }
}