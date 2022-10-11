package br.djnovaes.com.new_calc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel() {

private val _visor1: MutableLiveData<String> = MutableLiveData("0")
private val _visor2: MutableLiveData<String> = MutableLiveData("123")

val visor1: LiveData<String> = _visor1
val visor2: LiveData<String> = _visor2
private var textovisor1 = _visor1.value!!
private var textovisor2 = _visor2.value!!

fun digitaNumero(opcao: String){
    if (opcao == "." && textovisor1 == "0")
    {textovisor1 = "0."}
    else
    if (textovisor1 == "0") {
        textovisor1 = textovisor1.drop(1) + opcao
    }else
    if (textovisor1.contains(".") && opcao == ".")
    {textovisor1 = textovisor1}else

    textovisor1 += opcao
    _visor1.value = textovisor1
}
fun limpaNumero(opcao: String)
{
    if (opcao == "a")
    {textovisor1 = textovisor1.dropLast(1)}
    if (textovisor1.isEmpty())
    {textovisor1 = "0"}
    if (opcao == "l")
    {
        textovisor1 = "0"
        textovisor2 = ""
    }
    _visor1.value = textovisor1
    _visor2.value = textovisor2
}




}