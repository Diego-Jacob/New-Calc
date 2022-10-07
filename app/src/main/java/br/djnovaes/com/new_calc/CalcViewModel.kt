package br.djnovaes.com.new_calc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel() {

private val _visor1: MutableLiveData<String> = MutableLiveData("0")
private val _visor2: MutableLiveData<String> = MutableLiveData("")

val visor1: LiveData<String> = _visor1
val visor2: LiveData<String> = _visor2

fun digitaNumero(opcao: String){
var textovisor1 = _visor1.value!!
    textovisor1 = textovisor1.toString() + opcao
_visor2.value = textovisor1
}

}