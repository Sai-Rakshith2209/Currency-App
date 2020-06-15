package com.example.currency;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity
{
    public void click(View view)
    {
        Log.i("Info","Button-Pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView3);
        int i = Integer.parseInt(editText.getText().toString());
        Double i1 = new Double(i);
        Double i2 = 75.83;
        Double i3 = i1 * i2;
        Log.i("Value in Dollars is: ", String.valueOf(i3));
        textView.setText("The value in rupees is:  "+i3);
    }
    public void click1(View view)
    {
        Log.i("Info","More-Info-Button-Clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
