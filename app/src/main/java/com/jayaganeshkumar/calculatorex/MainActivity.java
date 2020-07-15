package com.jayaganeshkumar.calculatorex;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;


public class MainActivity extends AppCompatActivity {

    EditText Text;
    boolean shift = false;
    Button shiftbutton;
    private Object Expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.main_animation);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Text = (EditText) findViewById(R.id.displayText);
        shiftbutton = (Button) findViewById(R.id.shiftButton);
        Text.setText("0");


    }

    public void setRequestedOrientation(int screenOrientationPortrait) {
    }

    public void Equals(View view) {
        if (Text.getText().toString().equals("null") || Text.getText().toString().equals(" ")) {
            Text.setText(".Syntax Error");
        } else {
            String expression = Text.getText().toString();
            Expression e = new Expression(expression);
            String result = String.valueOf(e.calculate());
            if (result != null) {
                Text.setText(result);
                Text.setSelection(Text.getText().length());
            } else {
                Text.setText(".Syntax Error");
                Text.setSelection(Text.getText().length());
            }


        }

    }

    public void One(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("1");
        } else {
            Text.setText(Text.getText() + "1");
        }
        Text.setSelection(Text.getText().length());

    }

    public void Two(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("2");
        } else {
            Text.setText(Text.getText() + "2");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Three(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("3");
        } else {
            Text.setText(Text.getText() + "3");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Four(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("4");
        } else {
            Text.setText(Text.getText() + "4");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Five(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("5");
        } else {
            Text.setText(Text.getText() + "5");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Six(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("6");
        } else {
            Text.setText(Text.getText() + "6");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Seven(View view) {

        if (Text.getText().toString().equals("0")) {
            Text.setText("7");
        } else {
            Text.setText(Text.getText() + "7");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Eight(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("8");
        } else {
            Text.setText(Text.getText() + "8");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Nine(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("9");
        } else {
            Text.setText(Text.getText() + "9");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Zero(View view) {
        Text.setText(Text.getText() + "0");
        Text.setSelection(Text.getText().length());
    }

    public void Plus(View view) {
        Text.setText(Text.getText() + "+");
        Text.setSelection(Text.getText().length());
    }

    public void Minus(View view) {
        Text.setText(Text.getText() + "-");
        Text.setSelection(Text.getText().length());
    }

    public void Multiply(View view) {
        Text.setText(Text.getText() + "*");
        Text.setSelection(Text.getText().length());
    }

    public void Divide(View view) {
        Text.setText(Text.getText() + "/");
        Text.setSelection(Text.getText().length());
    }

    public void Dot(View view) {
        Text.setText(Text.getText() + ".");
        Text.setSelection(Text.getText().length());
    }

    public void Exp(View view) {
        if (Text.getText().toString().equals("0")) {
            Text.setText("exp(");
        } else {
            Text.setText(Text.getText() + "exp(");
        }
        Text.setSelection(Text.getText().length());

    }

    public void Ans(View view) {
        Text.setText(Text.getText());
        Text.setSelection(Text.getText().length());
    }

    public void Cos(View view) {
        if (shift == false) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("cos(");
            } else {
                Text.setText(Text.getText() + "cos(");
            }
            Text.setSelection(Text.getText().length());
        } else if (shift == true) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("arccos(");
            } else {
                Text.setText(Text.getText() + "arccos(");
            }
        }

    }

    public void Sin(View view) {
        if (shift == false) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("sin(");
            } else {
                Text.setText(Text.getText() + "sin(");
            }
            Text.setSelection(Text.getText().length());
        } else if (shift == true) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("arcsin(");
            } else {
                Text.setText(Text.getText() + "arcsin(");
            }
        }
    }

    public void Shift(View view) {

        if (shift == false) {
            shift = true;

            shiftbutton.setBackgroundColor(Color.parseColor("#ff8383"));

        } else if (shift) {
            shift = false;
            shiftbutton.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    public void Tan(View view) {
        if (shift == false) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("tan(");
            } else {
                Text.setText(Text.getText() + "tan(");
            }
            Text.setSelection(Text.getText().length());
        } else if (shift == true) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("arctan(");
            } else {
                Text.setText(Text.getText() + "arctan(");
            }
        }
    }

    public void Log(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("log(");
        }else{Text.setText(Text.getText()+"log(");
        }
        Text.setSelection(Text.getText().length());
    }
    public void Cot(View view){
        if (shift == false) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("cot(");
            } else {
                Text.setText(Text.getText() + "cot(");
            }
            Text.setSelection(Text.getText().length());
        } else if (shift == true) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("arccot(");
            } else {
                Text.setText(Text.getText() + "arccot(");
            }
        }
    }
    public void Sec(View view){

        if (shift == false) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("sec(");
            } else {
                Text.setText(Text.getText() + "sec(");
            }
            Text.setSelection(Text.getText().length());
        } else if (shift == true) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("arcsec(");
            } else {
                Text.setText(Text.getText() + "arcsec(");
            }
        }
    }
    public void Csc(View view){
        if (shift == false) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("cosec(");
            } else {
                Text.setText(Text.getText() + "cosec(");
            }
            Text.setSelection(Text.getText().length());
        } else if (shift == true) {
            if (Text.getText().toString().equals("0")) {
                Text.setText("arccosec(");
            } else {
                Text.setText(Text.getText() + "arccosec(");
            }
        }
    }
    public void RightBracket(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText(")");
        }else{Text.setText(Text.getText()+")");
        }
        Text.setSelection(Text.getText().length());
    }
    public void LeftBracket(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("(");
        }else{Text.setText(Text.getText()+"(");
        }
        Text.setSelection(Text.getText().length());
    }
    public void Ac(View view) {
        Text.setText("0");
        Text.setSelection(Text.getText().length());
    }
        public void Del(View view){
        String text = Text.getText().toString();
        if(text.length()==1){
            Text.setText("0");
        }else{
            Text.setText(text.substring(0, text.length() - 1));
            Text.setSelection(Text.getText().length());
        }

    }
    public void C(View view){
        String text = Text.getText().toString();
        if(text.length()==1){
            Text.setText("0");
        }else{
            Text.setText(text.substring(0, text.length() - 1));
            Text.setSelection(Text.getText().length());
        }
    }
    public void X2(View view){
        Text.setText(Text.getText()+"^2");
        Text.setSelection(Text.getText().length());
    }
    public void Power(View view){

        Text.setText(Text.getText()+"^");
        Text.setSelection(Text.getText().length());
    }
    public void Sqrt(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("sqrt(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"sqrt(");
            Text.setSelection(Text.getText().length());}
    }
    public void Comma(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText(",");
        }else{Text.setText(Text.getText()+",");
        }
        Text.setSelection(Text.getText().length());
    }

    public void Fac(View view){
        int i,fact=1;
        int number=Integer.parseInt(Text.getText().toString());//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        Text.setText(""+fact);
        Text.setSelection(Text.getText().length());
    }

    public void Pi(View view){
        Text.setText(Text.getText()+"pi");
        Text.setSelection(Text.getText().length());
    }
    public void Rad(View view){
        double Ans =Double.parseDouble(Text.getText().toString())*0.01745329252;
        Text.setText(""+Ans);
        Text.setSelection(Text.getText().length());
    }
    public void Reci(View view){
        double Ans =1/Double.parseDouble(Text.getText().toString());
        Text.setText(""+Ans);
        Text.setSelection(Text.getText().length());
    }
    public void X3(View view){
        double Ans =Double.parseDouble(Text.getText().toString());
        Ans=Ans*Ans*Ans;
        Text.setText(""+Ans);
        Text.setSelection(Text.getText().length());
    }

}
