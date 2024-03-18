package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }
    public void addUser(View view) {
        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);
        RadioGroup rgUserProgram = findViewById(R.id.radioDegreeProgram);

        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        String degreeProgram = "";

        if (rgUserProgram.getCheckedRadioButtonId() == R.id.seRadioButton) {
            degreeProgram = "Software Engineering";
        } else if (rgUserProgram.getCheckedRadioButtonId() == R.id.imRadioButton) {
            degreeProgram = "Industrial Management";
        } else if (rgUserProgram.getCheckedRadioButtonId() == R.id.ceRadioButton) {
            degreeProgram = "Computational Engineering";
        } else if (rgUserProgram.getCheckedRadioButtonId() == R.id.eeRadioButton) {
            degreeProgram = "Electrical Engineering";
        }

        User user = new User(firstName, lastName, email, degreeProgram);
        UserStorage.getInstance().addUser(user);
    }
}