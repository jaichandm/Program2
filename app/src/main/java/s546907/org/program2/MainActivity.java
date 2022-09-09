package s546907.org.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConversion(View v){
        EditText inputET = findViewById(R.id.inputEV);
        String textinputET = inputET.getText().toString();
        Log.v("Info", "Index of a is " + textinputET);
        double num1, num2;

        TextView displayTV = findViewById(R.id.outputTV);

        try {
            num1 = Double.parseDouble(textinputET);
            num2 = num1 * 0.1;
            textinputET = num1+"Krone is "+num2+" US dollars";
        }
        catch(Exception e) {
            Log.v("Info", "Exception: " + e);
            textinputET += "is not conversable";
        }

        displayTV.setText(textinputET);
    }
}