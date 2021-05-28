package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
            buttonForAddition,buttonForSubtraction,buttonForMultiplication,buttonForDivision,buttonForOutput,buttonDecimal,clearButton;
    private TextView calculationResult, calculationString;

    private float value1, value2;
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
                calculationResult.setText(calculationResult.getText()+"0");
                enableButtons();
                break;
            case R.id.button_1:
                calculationResult.setText(calculationResult.getText()+"1");
                enableButtons();
                break;
            case R.id.button_2:
                calculationResult.setText(calculationResult.getText()+"2");
                enableButtons();
                break;
            case R.id.button_3:
                calculationResult.setText(calculationResult.getText()+"3");
                enableButtons();
                break;
            case R.id.button_4:
                calculationResult.setText(calculationResult.getText()+"4");
                enableButtons();
                break;
            case R.id.button_5:
                calculationResult.setText(calculationResult.getText()+"5");
                enableButtons();
                break;
            case R.id.button_6:
                calculationResult.setText(calculationResult.getText()+"6");
                enableButtons();
                break;
            case R.id.button_7:
                calculationResult.setText(calculationResult.getText()+"7");
                enableButtons();
                break;
            case R.id.button_8:
                calculationResult.setText(calculationResult.getText()+"8");
                enableButtons();
                break;
            case R.id.button_9:
                calculationResult.setText(calculationResult.getText()+"9");
                enableButtons();
                break;
            case R.id.button_for_decimal:
                calculationResult.setText(calculationResult.getText()+".");
                enableButtons();
                break;
            case R.id.button_for_addition:
                value1 = Integer.parseInt(calculationResult.getText() + "");
                Addition = true;
                calculationString.setText(value1 + " + ");
                calculationResult.setText(null);
                disableButtons();
                break;
            case R.id.button_for_subtraction:
                value1 = Integer.parseInt(calculationResult.getText() + "");
                Subtraction = true;
                calculationString.setText(value1 + " - ");
                calculationResult.setText(null);
                disableButtons();
                break;
            case R.id.button_for_multiplication:
                value1 = Integer.parseInt(calculationResult.getText() + "");
                Multiplication = true ;
                calculationString.setText(value1 + " * ");
                calculationResult.setText(null);
                disableButtons();
                break;
            case R.id.button_for_division:
                value1 = Integer.parseInt(calculationResult.getText()+"");
                Division = true ;
                calculationString.setText(value1 + " / ");
                calculationResult.setText(null);
                disableButtons();
                break;
            case R.id.button_for_output:
                value2 = Integer.parseInt(calculationResult.getText() + "");
                calculationString.setText(calculationString.getText().toString()+ value2);
                calculate(value1,value2);
                enableButtons();
                break;
            case R.id.clear_button:
                calculationResult.setText("");
                calculationString.setText("");
                break;

        }
    }

    private void enableButtons() {
        buttonForAddition.setClickable(true);
        buttonForSubtraction.setClickable(true);
        buttonForMultiplication.setClickable(true);
        buttonForDivision.setClickable(true);
    }

    private void disableButtons() {
        buttonForAddition.setClickable(false);
        buttonForSubtraction.setClickable(false);
        buttonForMultiplication.setClickable(false);
        buttonForDivision.setClickable(false);
    }

    private void calculate(float value1, float value2){
        if (Addition == true){
            calculationResult.setText(value1 + value2 +"");
            Toast.makeText(MainActivity.this, String.valueOf(value1 + value2), Toast.LENGTH_SHORT).show();
            Addition=false;
        }

        if (Subtraction == true){
            calculationResult.setText(value1 - value2 +"");
            Toast.makeText(MainActivity.this, String.valueOf(value1 - value2), Toast.LENGTH_SHORT).show();
            Subtraction=false;
        }

        if (Multiplication == true){
            calculationResult.setText(value1 * value2 + "");
            Toast.makeText(MainActivity.this, String.valueOf(value1 * value2), Toast.LENGTH_SHORT).show();
            Multiplication=false;
        }

        if (Division == true){
            if(value2 != 0){
                calculationResult.setText(value1 / value2+"");
                Toast.makeText(MainActivity.this, String.valueOf(value1 / value2), Toast.LENGTH_SHORT).show();
                Division=false;
            } else {
                Toast.makeText(MainActivity.this, String.valueOf("Enter a valid number"), Toast.LENGTH_SHORT).show();
            }
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
        calculationResult = (TextView) findViewById(R.id.edited_text);
        calculationString = (TextView) findViewById(R.id.text_to_view);

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
        disableButtons();
    }

}

