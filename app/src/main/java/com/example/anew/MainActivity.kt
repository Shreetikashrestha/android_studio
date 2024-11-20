package com.example.anew

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {

    private lateinit var tvHeader: TextView
    private lateinit var tvSubHeader: TextView
    private lateinit var firstNameInput: TextInputEditText
    private lateinit var lastNameInput: TextInputEditText
    private lateinit var emailInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var signUpButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvHeader = findViewById(R.id.tvHeader)
        tvSubHeader = findViewById(R.id.tvSubHeader)
        firstNameInput = findViewById(R.id.textInputLayout2)
        lastNameInput = findViewById(R.id.textInputLayout3)
        emailInput = findViewById(R.id.textInputLayout4)
        passwordInput = findViewById(R.id.textInputLayout)
        signUpButton = findViewById(R.id.button)

        Button.setOnClickListener{
            val data : String= passwordInput.text.toString()
            textView.text =data


        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}