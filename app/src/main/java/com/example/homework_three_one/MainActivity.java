package com.example.homework_three_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editName, editAdres, editNumber;
    AppCompatButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findID();
        setClick();
    }
    private void findID(){
        editName = findViewById(R.id.MainName);
        editAdres = findViewById(R.id.MainAdres);
        editNumber = findViewById(R.id.MainNumber);
        button = findViewById(R.id.buttn);
}
    private void setClick(){
button.setOnClickListener(v ->
    {
        if  (
                !editName.getText().toString().isEmpty()
             && !editAdres.getText().toString().isEmpty()
             && !editNumber.getText().toString().isEmpty()
            )
        {
                navigateToSecondActivity
                        (
                            editName.getText().toString(),
                            editAdres.getText().toString(),
                            editNumber.getText().toString()
                        );
        }
        else
            {
                Toast.makeText(this,
                "You left an empty line",
                Toast.LENGTH_SHORT).show();
            }
    }
    );
}

    private void navigateToSecondActivity(String navigateName ,
                                          String navigateadres,
                                          String navigatenumber)
    {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("MainName", navigateName);
        intent.putExtra("MainAdres",navigateadres);
        intent.putExtra("MainNumber",navigatenumber);
        startActivity(intent);
    }

}