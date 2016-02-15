package com.nqr_productions.crystalize;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class questions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

    }
    public void onHintClick(View view) {

        //this is a comment - anything with two forward strokes preceding it will be ignored by Android Studio
        Toast toasty = makeText(getApplicationContext(), getString(R.string.H1), Toast.LENGTH_SHORT);
        toasty.show();

    }
    public void onAnswerClick(View view) {

        String answer = ((EditText)findViewById(R.id.answer)).getText().toString();
        String correctanswer = getString(R.string.A1);
        //gets the answer and correct answer from the edit text and strings.xml respectively
        answer = answer.toLowerCase();
        //makes sure that the strings are lower case


        if (answer.equals(correctanswer)) {
            Toast toasty = makeText(getApplicationContext(), "Right!", Toast.LENGTH_SHORT);
            toasty.show();

        } else {
            Toast toasty = makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT);
            toasty.show();
        }
    }

}
