package com.curso.android.app.practica.proyectofinal2.view


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.proyectofinal2.model.InputsModel

class InputsViewModel: ViewModel() {


    var inputsModel = MutableLiveData(InputsModel("",""))



    fun compararInputs(input1: String, input2:String): String{

        inputsModel.value = InputsModel(input1,input2)

        if(inputsModel.value?.input1 == inputsModel.value?.input2){
            return "inputs Iguales: '${inputsModel.value?.input1}'"
        }else{
            return "inputs Desiguales"
        }
    }
}