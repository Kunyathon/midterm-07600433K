package su.ac.th.speedcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.speedcalculator.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        Button calculator = findViewById(R.id.button2);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText meter = findViewById(R.id.edt1);
                EditText time = findViewById(R.id.editTextNumber3);
                String numText = meter.getText().toString() + "";
                String numText1 = time.getText().toString() + "";
                String num = "0";
                if (numText.isEmpty()|| numText1.isEmpty()) {
                        Toast toast = Toast.makeText(MainActivity.this, "ต้องกรอกระยะทางและเวลา", Toast.LENGTH_LONG);
                        toast.show();
                    }
                else if(numText1.equals(num)){
                        Toast toast = Toast.makeText(MainActivity.this, "เวลาต้องมากกว่าศูนย์", Toast.LENGTH_LONG);
                        toast.show();
                    }


            }

    });

    }
}




