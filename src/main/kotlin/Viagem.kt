import br.com.viagemapi.Itinerario
import java.math.BigDecimal

class Viagem {
    var dados = mutableListOf<Itinerario>()

    override fun inserirItinerario(origem: String, destino: String, dataIda: String, dataVolta: String): Itinerario{
        var itinerario: Itinerario = Itinerario()

        itinerario.origem = origem
        itinerario.destino = destino
        itinerario.dataIda = dataIda
        itinerario.dataVolta = dataVolta

        when (itinerario.destino) {
            "AC" -> {
                itinerario.setQtdPessoas(790101)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(86013)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "AL" -> {
                itinerario.setQtdPessoas(3322000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(428774)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                //dados.add(itinerario)
            }
            "AP" -> {
                itinerario.setQtdPessoas(751000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(82214)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "AM" -> {
                itinerario.setQtdPessoas(3874000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(571396)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "BA" -> {
                itinerario.setQtdPessoas(15013000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(2206348)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "CE" -> {
                itinerario.setQtdPessoas(8843000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(1221639)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "DF" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(385266)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "ES" -> {
                itinerario.setQtdPessoas(3885000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(637260)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "GO" -> {
                itinerario.setQtdPessoas(6523000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(797339)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "TO" -> {
                itinerario.setQtdPessoas(6851000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(771684)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "MT" -> {
                itinerario.setQtdPessoas(3224000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(360063)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "MS" -> {
                itinerario.setQtdPessoas(2062000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "MG" -> {
                itinerario.setQtdPessoas(20087000)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(2919813)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(32323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "PA" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "PB" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "PR" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "PE" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "PI" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "RJ" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "RN" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "RS" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "RO" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "RR" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "SC" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "SP" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
            "SE" -> {
                itinerario.setQtdPessoas(3055149)
                itinerario.getQtdPessoas()
                itinerario.setQtdPessoasVacinadas(232323)
                itinerario.getQtdPessoasVacinadas()
                itinerario.setQtdPessoasInfectadas(232323)
                itinerario.getQtdPessoasInfectadas()
                itinerario.setQtdLeitosOcupados(23232)
                itinerario.getQtdLeitosOcupados()
                dados.add(itinerario)
            }
        }
        return itinerario
    }
}
