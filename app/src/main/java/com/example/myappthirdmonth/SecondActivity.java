package com.example.myappthirdmonth;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myappthirdmonth.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding viewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        if(!((viewBinding.etUsername.toString().isEmpty())||(viewBinding.etPassword.toString().isEmpty()))){
            viewBinding.btnContinue2.setEnabled(true);
            viewBinding.btnContinue2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(viewBinding.etUsername.getText().toString().equals("admin")&&viewBinding.etPassword.getText().toString().equals("admin")){
                        Toast.makeText(SecondActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(SecondActivity.this, "Неправильно введен(ы) пароль или имя пользователя!", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }else {
            viewBinding.btnContinue2.setEnabled(false);
        }

    }
}