package com.darwishashraf.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.hanks.htextview.base.HTextView;

import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {


    private HTextView textViewScale;
    int delay = 1500; //milliseconds
    Handler handler;
    ArrayList<String> arrMessages = new ArrayList<>();
    int position=0;

    // TODO: Add member variables here:
    private FirebaseAuth mAuth;
    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //------------Animation text------------------------
        /* Some Sample Messages for Animation */
        arrMessages.add("Sertai Komuniti");
        arrMessages.add("Platform buat mereka,");
        arrMessages.add("yang ingin");
        arrMessages.add("berhenti merokok");
        arrMessages.add("Berkongsi pengalaman");
        arrMessages.add("dan tips");
        arrMessages.add("Tentang cara-cara");
        arrMessages.add("berhenti merokok");
        arrMessages.add("Ayuh daftar sekarang");
        arrMessages.add("atau log masuk jika anda ahli");
        textViewScale = findViewById(R.id.text_view_scale);
        textViewScale.animateText(arrMessages.get(position));
        /* Change Messages every 1.5 Seconds */
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){

                handler.postDelayed(this, delay);
                if(position>=arrMessages.size())
                    position=0;
                textViewScale.animateText(arrMessages.get(position));
                position++;
            }
        }, delay);

        //------------Animation text------------------------


        mEmailView = (AutoCompleteTextView) findViewById(R.id.login_email);
        mPasswordView = (EditText) findViewById(R.id.login_password);

        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.integer.login || id == EditorInfo.IME_NULL) {
                    attemptLogin();
                    return true;
                }
                return false;
            }
        });

        // TODO: Grab an instance of FirebaseAuth
        mAuth = FirebaseAuth.getInstance();

    }

    // Executed when Sign in button pressed
    public void signInExistingUser(View v)   {
        // TODO: Call attemptLogin() here
        attemptLogin();

    }

    // Executed when Register button pressed
    public void registerNewUser(View v) {
        Intent intent = new Intent(this, com.darwishashraf.flashchatnewfirebase.RegisterActivity.class);
        finish();
        startActivity(intent);
    }

    // TODO: Complete the attemptLogin() method
    private void attemptLogin() {


        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();

        if (email.equals("") || password.equals("")) return;
        Toast.makeText(this,"Sila tunggu sebentar...", Toast.LENGTH_LONG).show();
        // TODO: Use FirebaseAuth to sign in with email & password

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.d("Flashchat", "Sign in with email onComplete: " + task.isSuccessful());

                if (!task.isSuccessful()) {
                    Log.d("Flashchat", "Problem signing in: " + task.getException());
                    showErrorDialog("Masalah daftar pengguna...");

                } else {
                    Intent mainChatIntent = new Intent(LoginActivity.this, MainChatActivity.class);
                    finish();
                    startActivity(mainChatIntent);
                }
            }
        });



    }

    // TODO: Show error on screen with an alert dialog

    private void showErrorDialog(String message) {

        new AlertDialog.Builder(this)
                .setTitle("Oopps")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, null)
                .show();
    }





}