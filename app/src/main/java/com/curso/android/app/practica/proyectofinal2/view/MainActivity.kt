package com.curso.android.app.practica.proyectofinal2.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.practica.proyectofinal2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding

    private val inputsViewModel: InputsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        inputsViewModel.inputsModel.observe(this) {
            println("recibimos valor: $it")
            binding.textInputEditText.setText(it.input1.toString())
            binding.textInputEditText2.setText(it.input2.toString())
        }



        val resultado = binding.textViewResultado
        binding.button.setOnClickListener{


            val input1 = binding.textInputEditText.text.toString()
            val input2 = binding.textInputEditText2.text.toString()
            resultado.text = inputsViewModel.compararInputs(input1, input2)
        }



    }




}