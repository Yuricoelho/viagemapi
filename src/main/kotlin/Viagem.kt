import br.com.viagemapi.Itinerario
import java.math.BigDecimal

class Viagem {
    var dados = mutableListOf<Itinerario>()

    fun inserirItinerario(origem: String, destino: String, dataIda: String, dataVolta: String): Itinerario {
        var itinerario: Itinerario = Itinerario()

        itinerario.origem = origem
        itinerario.destino = destino
        itinerario.dataIda = dataIda
        itinerario.dataVolta = dataVolta

        if (itinerario.destino == "AC") {
            itinerario.qtdPessoas = 790101
            itinerario.qtdPessoasVacinadas = 86013
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "AL") {
            itinerario.qtdPessoas = 3322000
            itinerario.qtdPessoasVacinadas = 428774
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "AP") {
            itinerario.qtdPessoas = 751000
            itinerario.qtdPessoasVacinadas = 82214
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "AM") {
            itinerario.qtdPessoas = 3874000
            itinerario.qtdPessoasVacinadas = 571396
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "BA") {
            itinerario.qtdPessoas = 15013000
            itinerario.qtdPessoasVacinadas = 2206348
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "CE") {
            itinerario.qtdPessoas = 8843000
            itinerario.qtdPessoasVacinadas = 1221639
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "DF") {
            itinerario.qtdPessoas = 3055149
            itinerario.qtdPessoasVacinadas = 385266
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "ES") {
            itinerario.qtdPessoas = 3885000
            itinerario.qtdPessoasVacinadas = 637260
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "GO") {
            itinerario.qtdPessoas = 6523000
            itinerario.qtdPessoasVacinadas = 797339
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "MA") {
            itinerario.qtdPessoas = 6851000
            itinerario.qtdPessoasVacinadas = 771684
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "MT") {
            itinerario.qtdPessoas = 3224000
            itinerario.qtdPessoasVacinadas = 360063
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "MS") {
            itinerario.qtdPessoas = 2062000
            itinerario.qtdPessoasVacinadas = 450136
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "MG") {
            itinerario.qtdPessoas = 20087000
            itinerario.qtdPessoasVacinadas = 2919813
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "PA") {
            itinerario.qtdPessoas = 8074000
            itinerario.qtdPessoasVacinadas = 967775
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "PB") {
            itinerario.qtdPessoas = 3944000
            itinerario.qtdPessoasVacinadas = 608928
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "PR") {
            itinerario.qtdPessoas = 11008000
            itinerario.qtdPessoasVacinadas = 1527612
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "PE") {
            itinerario.qtdPessoas = 9278000
            itinerario.qtdPessoasVacinadas = 1266573
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "PI") {
            itinerario.qtdPessoas = 3195000
            itinerario.qtdPessoasVacinadas = 380823
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "RJ") {
            itinerario.qtdPessoas = 16046000
            itinerario.qtdPessoasVacinadas = 232323
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "RN") {
            itinerario.qtdPessoas = 3409000
            itinerario.qtdPessoasVacinadas = 2019561
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "RS") {
            itinerario.qtdPessoas = 11029000
            itinerario.qtdPessoasVacinadas = 2068146
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "RO") {
            itinerario.qtdPessoas = 1749000
            itinerario.qtdPessoasVacinadas = 168286
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "RR") {
            itinerario.qtdPessoas = 496936
            itinerario.qtdPessoasVacinadas = 64284
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "SC") {
            itinerario.qtdPessoas = 7165000
            itinerario.qtdPessoasVacinadas = 990324
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "SP") {
            itinerario.qtdPessoas = 12033000
            itinerario.qtdPessoasVacinadas = 6882280
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        } else if (itinerario.destino == "SE") {
            itinerario.qtdPessoas = 2022000
            itinerario.qtdPessoasVacinadas = 297323
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        }
        } else if (itinerario.destino == "TO") {
            itinerario.qtdPessoas = 1497000
            itinerario.qtdPessoasVacinadas = 154080
            itinerario.qtdPessoasInfectadas = 32323
            itinerario.qtdLeitosOcupados = 23232
            dados.add(itinerario)
        }


        //retornaDados(itinerario)
        return itinerario
    }
}
