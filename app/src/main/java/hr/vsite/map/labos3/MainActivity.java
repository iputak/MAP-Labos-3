package hr.vsite.map.labos3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Prvo dugme
        View.OnClickListener slusac = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView prikazPogled = findViewById(R.id.textView);
                prikazPogled.setText(R.string.poruka1);
            }
        };
        //Pritisak na dugme1
        Button dugme1=findViewById(R.id.dugme1);
        dugme1.setOnClickListener(slusac);

        //Pritisak na dugme3
        Button dugme3=findViewById(R.id.dugme3);
        dugme3.setOnClickListener(this);
    }

    //Pritisak na dugme2
    public void naKlik(View v){

        TextView prikazPogled = findViewById(R.id.textView);
        prikazPogled.setText(R.string.poruka2);

    }

    @Override
    public void onClick(View v) {
        //Otvaramo novu aktivnost
        Intent intent=new Intent(this,SecondActivity.class);
        //Slanje namjere Androidu da želimo novu aktivnost
        startActivity(intent);

    }


}
