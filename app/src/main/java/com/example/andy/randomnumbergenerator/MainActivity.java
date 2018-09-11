package com.example.andy.randomnumbergenerator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    //declare variable
    int randomNumber;

    public void toastMessage (String message){

        //Toast message to be used in if, else if, else statement
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }

    public void guessButton (View view){

        //Label the EditText "enterNumber"
        EditText enterNumber = (EditText) findViewById(R.id.enterNumber);

        //Change integer int a string
        int guestInt = Integer.parseInt(enterNumber.getText().toString());

        //if, else if, else statements that go through scenarios.
        // generates new random number when user is correct
        if (guestInt > randomNumber){

           toastMessage(" Lower");


        }else if(randomNumber > guestInt){

            toastMessage("Higher");

        }else{

            toastMessage("Your Correct, Try Again");

            Random number = new Random();

            randomNumber = number.nextInt(20) + 1;
        }





        }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign random number as app opens
        Random number = new Random();

       randomNumber = number.nextInt(20) + 1;
    }
}
