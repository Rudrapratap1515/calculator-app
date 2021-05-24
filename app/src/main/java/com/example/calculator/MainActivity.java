package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonForAddition,buttonForSubtraction,buttonForMultiplication,buttonForDivision,buttonForOutput,buttonDecimal,clearButton;
    private EditText editedText;

    private float Value1, Value2;
    private boolean Addition, Subtraction, Multiplication, Division ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize_variables();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                editedText.setText(editedText.getText()+"0");
                break;
            case R.id.button_1:
                editedText.setText(editedText.getText()+"1");
                break;
            case R.id.button_2:
                editedText.setText(editedText.getText()+"2");
                break;
            case R.id.button_3:
                editedText.setText(editedText.getText()+"3");
                break;
            case R.id.button_4:
                editedText.setText(editedText.getText()+"4");
                break;
            case R.id.button_5:
                editedText.setText(editedText.getText()+"5");
                break;
            case R.id.button_6:
                editedText.setText(editedText.getText()+"6");
                break;
            case R.id.button_7:
                editedText.setText(editedText.getText()+"7");
                break;
            case R.id.button_8:
                editedText.setText(editedText.getText()+"8");
                break;
            case R.id.button_9:
                editedText.setText(editedText.getText()+"9");
                break;
            case R.id.button_for_decimal:
                editedText.setText(editedText.getText()+".");
                break;
            case R.id.button_for_addition:
                if (editedText == null){
                    editedText.setText("");
                }else {
                    Value1 = Float.parseFloat(editedText.getText() + "");
                    Addition = true;
                    editedText.setText(null);
                }
                break;
            case R.id.button_for_subtraction:
                Value1 = Float.parseFloat(editedText.getText() + "");
                Subtraction = true ;
                editedText.setText(null);
                break;
            case R.id.button_for_multiplication:
                Value1 = Float.parseFloat(editedText.getText() + "");
                Multiplication = true ;
                editedText.setText(null);
                break;
            case R.id.button_for_division:
                Value1 = Float.parseFloat(editedText.getText()+"");
                Division = true ;
                editedText.setText(null);
                break;
            case R.id.button_for_output:
                Value2 = Float.parseFloat(editedText.getText() + "");

                if (Addition == true){
                    editedText.setText(Value1 + Value2 +"");
                    Toast.makeText(MainActivity.this, String.valueOf(Value1 + Value2), Toast.LENGTH_SHORT).show();
                    Addition=false;
                }

                if (Subtraction == true){
                    editedText.setText(Value1 - Value2 +"");
                    Toast.makeText(MainActivity.this, String.valueOf(Value1 - Value2), Toast.LENGTH_SHORT).show();
                    Subtraction=false;
                }

                if (Multiplication == true){
                    editedText.setText(Value1 * Value2 + "");
                    Toast.makeText(MainActivity.this, String.valueOf(Value1 * Value2), Toast.LENGTH_SHORT).show();
                    Multiplication=false;
                }

                if (Division == true){
                    editedText.setText(Value1 / Value2+"");
                    Toast.makeText(MainActivity.this, String.valueOf(Value1 / Value2), Toast.LENGTH_SHORT).show();
                    Division=false;
                }
                break;
            case R.id.clear_button:
                editedText.setText("");
                break;
            default:
                break;
        }
    }

    private void initialize_variables(){
        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        buttonForAddition = (Button) findViewById(R.id.button_for_addition);
        buttonForDivision = (Button) findViewById(R.id.button_for_division);
        buttonForSubtraction = (Button) findViewById(R.id.button_for_subtraction);
        buttonForMultiplication = (Button) findViewById(R.id.button_for_multiplication);
        buttonForOutput = (Button) findViewById(R.id.button_for_output);
        buttonDecimal = (Button) findViewById(R.id.button_for_decimal);
        clearButton = (Button) findViewById(R.id.clear_button);
        editedText = (EditText) findViewById(R.id.edited_text);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonForAddition.setOnClickListener(this);
        buttonForSubtraction.setOnClickListener(this);
        buttonForMultiplication.setOnClickListener(this);
        buttonForDivision.setOnClickListener(this);
        buttonForOutput.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

}

