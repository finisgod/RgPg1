package com.example.RgPg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity
{
    private Button login ;
    private static final String passCH = "test"  ;
    private static final String emailCH = "test"  ;
    private Toast toast;
    private EditText pass;
    private EditText log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }



    public void onButtonClick(View V)
    {
        toast = Toast.makeText(LogIn.this , "Неверный Логин или Пароль!" , Toast.LENGTH_SHORT );


        pass = findViewById(R.id.pass);
        log = findViewById(R.id.mail);
        login = findViewById(R.id.login);
        login.setOnClickListener
        (
          new View.OnClickListener()
          {
              @Override
              public void onClick(View V)
              {

                  Intent intent = new Intent(LogIn.this, MainMenu.class);
                  if(passCH.equals(String.valueOf(pass.getText())) && emailCH.equals(String.valueOf(log.getText()) ) )
                  startActivity(intent);
                  else

                  toast.show ();

              }

          }
        );

    }

}
