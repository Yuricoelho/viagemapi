import br.com.viagemapi.Itinerario;

class Viagem{


//    fun inserirItinerario(nome: String, cpf: String, endereco: String): ContaCorrente {
//        var conta: ContaCorrente = ContaCorrente()
//        conta.agencia = "123"
//
//        val numeroRandomico = geradorDeNumerosRandomicos.nextInt()
//
//        conta.numero = numeroRandomico.toString()
//        conta.status = true
//        conta.titular = nome
//        conta.cpf = cpf
//        conta.endereco = endereco
//
//        contasCorrente.add(conta)
//
//        return conta
//    }



//    fun abrirContaInvestimento(nome: String, cpf: String, endereco: String): ContaInvestimento {
//        var conta: ContaInvestimento = ContaInvestimento()
//        conta.agencia = "123"
//
//        val numeroRandomico = geradorDeNumerosRandomicos.nextInt()
//
//        conta.numero = numeroRandomico.toString()
//        conta.status = true
//        conta.titular = nome
//        conta.cpf = cpf
//        conta.endereco = endereco
//
//        contasInvestimento.add(conta)
//
//        return conta
//    }
//
//    fun abrirContaPoupanca(nome: String, cpf: String, endereco: String): ContaPoupanca {
//        var conta = ContaPoupanca()
//        conta.agencia = "123"
//
//        val numeroRandomico = geradorDeNumerosRandomicos.nextInt()
//
//        conta.numero = numeroRandomico.toString()
//        conta.status = true
//        conta.titular = nome
//        conta.cpf = cpf
//        conta.endereco = endereco
//
//        contasPoupanca.add(conta)
//
//        return conta
//    }
//
//    fun investir(agencia: String, numeroContaInvest: String, numeroConta: String, valor: Double) {
//        val contaCorr = contasCorrente.filter { conta ->
//                conta.numero == numeroConta && conta.agencia == agencia
//        }.first()
//
//        val contaInvest = contasInvestimento.filter { conta ->
//                conta.numero == numeroContaInvest && conta.agencia == agencia
//        }.first()
//
//        contaCorr.saldo -= valor
//        contaInvest.saldo += valor
//    }
//
//    fun depositar(agencia: String, numeroConta: String, valor: Double) {
//        contasCorrente.forEach { conta ->
//            if (conta.numero == numeroConta && conta.agencia == agencia) {
//                conta.saldo += valor
//            }
//        }
//    }
}
