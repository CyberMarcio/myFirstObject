
class Casa {
    var cor: String = ""
    var janela: String = ""
    var quantidadeJanelas: Int = 0
    var quantidadePortas: Int = 0
}

fun main(){
    val casaDoMarcos = Casa()
    casaDoMarcos.cor = "casa de cor azul"
    casaDoMarcos.janela = "janela de vidro"
    casaDoMarcos.quantidadePortas = 5
    casaDoMarcos.quantidadeJanelas = 4
    println(casaDoMarcos.cor)
    println(casaDoMarcos.janela)
    println(casaDoMarcos.quantidadePortas)
    println(casaDoMarcos.quantidadeJanelas)
}