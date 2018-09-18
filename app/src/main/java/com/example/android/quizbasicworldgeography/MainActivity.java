package com.example.android.quizbasicworldgeography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //user points
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Displays question one Information //
        TextView q1 = findViewById(R.id.q1);
        q1.setText(R.string.questionOne);
        TextView q1a1 = findViewById(R.id.q1Answer1);
        q1a1.setText(R.string.q1a1);
        TextView q1a2 = findViewById(R.id.q1Answer2);
        q1a2.setText(R.string.q1a2);

        // Displays question Two Information //
        TextView q2 = findViewById(R.id.q2);
        q2.setText(R.string.questionTwo);
        TextView q2a1 = findViewById(R.id.q2Answer1);
        q2a1.setText(R.string.q2a1);
        TextView q2a2 = findViewById(R.id.q2Answer2);
        q2a2.setText(R.string.q2a2);

        // Displays question Three Information //
        TextView q3 = findViewById(R.id.q3);
        q3.setText(R.string.questionThree);
        TextView q3a1 = findViewById(R.id.q3Answer1);
        q3a1.setText(R.string.q3a1);
        TextView q3a2 = findViewById(R.id.q3Answer2);
        q3a2.setText(R.string.q3a2);

        // Displays question Four Information //
        TextView q4 = findViewById(R.id.q4);
        q4.setText(R.string.questionFour);
        TextView q4a1 = findViewById(R.id.q4Answer1);
        q4a1.setText(R.string.q4a1);
        TextView q4a2 = findViewById(R.id.q4Answer2);
        q4a2.setText(R.string.q4a2);

        // Displays question Five Information //
        TextView q5 = findViewById(R.id.q5);
        q5.setText(R.string.questionFive);
        TextView q5a1 = findViewById(R.id.q5Answer1);
        q5a1.setText(R.string.q5a1);
        TextView q5a2 = findViewById(R.id.q5Answer2);
        q5a2.setText(R.string.q5a2);

        // Displays question Six Information //
        TextView q6 = findViewById(R.id.q6);
        q6.setText(R.string.questionSix);
        TextView q6a1 = findViewById(R.id.q6Answer1);
        q6a1.setText(R.string.q6a1);
        TextView q6a2 = findViewById(R.id.q6Answer2);
        q6a2.setText(R.string.q6a2);

        // Displays question Seven Information //
        TextView q7 = findViewById(R.id.q7);
        q7.setText(R.string.questionSeven);
        TextView q7a1 = findViewById(R.id.q7Answer1);
        q7a1.setText(R.string.q7a1);
        TextView q7a2 = findViewById(R.id.q7Answer2);
        q7a2.setText(R.string.q7a2);

        // Displays question Eight Information //
        TextView q8 = findViewById(R.id.q8);
        q8.setText(R.string.questionEight);
        TextView q8a1 = findViewById(R.id.q8Answer1);
        q8a1.setText(R.string.q8a1);
        TextView q8a2 = findViewById(R.id.q8Answer2);
        q8a2.setText(R.string.q8a2);
        TextView q8a3 = findViewById(R.id.q8Answer3);
        q8a3.setText(R.string.q8a3);
        TextView q8a4 = findViewById(R.id.q8Answer4);
        q8a4.setText(R.string.q8a4);
    }


    /**
     * This method is called when the submit button is clicked.
     */
    public void submit(View view) {
        //check the user answers
        checkResults();

        //shows the name of the user
        TextView name = findViewById(R.id.name);
        String personName = getPersonalName();
        name.setText(String.valueOf(personName));

        //show result of the user
        String total = displayTotalPoints();

        //show toast message with the user name and the total of points
        Toast.makeText(this, personName + ", you did total points of " + total + ".", Toast.LENGTH_LONG).show();
    }

    /**
     * display the total points for the user, and reset score after displaying.
     */
    private String displayTotalPoints() {
        TextView totalScore = findViewById(R.id.score);
        String total = String.valueOf(points);
        totalScore.setText(total);
        points = 0;
        return total;
    }

    /**
     * receives the customer name
     *
     * @return person's name
     */

    public String getPersonalName() {
        EditText personalName = findViewById(R.id.nameEditText);
        String personName = personalName.getText().toString();
        return personName;
    }

    /**
     * determines the right answers by the user
     */
    private void checkResults() {
        // figure out the right answer for question one
        RadioButton q1A2 = findViewById(R.id.q1Answer2);
        boolean q1A2Checked = q1A2.isChecked();

        // figure out the right answer for question Two
        RadioButton q2A1 = findViewById(R.id.q2Answer1);
        boolean q2A1Checked = q2A1.isChecked();

        // figure out the right answer for question Three
        RadioButton q3A1 = findViewById(R.id.q3Answer1);
        boolean q3A1Checked = q3A1.isChecked();

        // figure out the right answer for question Four
        RadioButton q4A1 = findViewById(R.id.q4Answer1);
        boolean q4A1Checked = q4A1.isChecked();

        // figure out the right answer for question Five
        RadioButton q5A2 = findViewById(R.id.q5Answer2);
        boolean q5A2Checked = q5A2.isChecked();

        // figure out the right answer for question Six
        RadioButton q6A1 = findViewById(R.id.q6Answer1);
        boolean q6A1Checked = q6A1.isChecked();

        // figure out the right answer for question Seven
        RadioButton q7A2 = findViewById(R.id.q7Answer2);
        boolean q7A1Checked = q7A2.isChecked();

        // figure out the right answer for question Eight
        CheckBox q8A1 = findViewById(R.id.q8Answer1);
        boolean q8A1Checked = q8A1.isChecked();
        CheckBox q8A3 = findViewById(R.id.q8Answer3);
        boolean q8A3Checked = q8A3.isChecked();
        CheckBox q8A4 = findViewById(R.id.q8Answer4);
        boolean q8A4Checked = q8A4.isChecked();
        CheckBox q8A2 = findViewById(R.id.q8Answer2);
        boolean q8A2Checked = q8A2.isChecked();

        //insert results for the questions from one to seven as parameters
        calculatePoints(q1A2Checked, q2A1Checked, q3A1Checked, q4A1Checked, q5A2Checked, q6A1Checked, q7A1Checked);

        //determines the right answer for the given answers of question eight
        if (q8A1Checked && q8A3Checked && q8A4Checked && !q8A2Checked) {
            calculateCheckBox(true);

        }
    }

    /**
     * Counts the right answers for the questions
     *
     * @param q1true determines that question one is true
     * @param q2true determines that question Two is true
     * @param q3true determines that question Three is true
     * @param q4true determines that question Four is true
     * @param q5true determines that question Five is true
     * @param q6true determines that question Six is true
     * @param q7true determines that question Seven is true
     */
    private void calculatePoints(boolean q1true, boolean q2true, boolean q3true, boolean q4true, boolean q5true, boolean q6true, boolean q7true) {
        if (q1true) {
            points++;
        }
        if (q2true) {
            points++;
        }
        if (q3true) {
            points++;
        }
        if (q4true) {
            points++;
        }
        if (q5true) {
            points++;
        }
        if (q6true) {
            points++;
        }
        if (q7true) {
            points++;
        }
    }

    /**
     * Counts the right answer for question eight (CheckBox)
     *
     * @param q8true determines that question Eight has the right values
     */
    private void calculateCheckBox(boolean q8true) {
        if (q8true) {
            points = points + 3;
        }
    }

}
