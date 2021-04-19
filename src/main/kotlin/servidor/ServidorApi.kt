package servidor

import Banco
import conta.Deposito
import conta.corrente.ContaCorrente
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.html.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlinx.html.*
import org.slf4j.event.Level

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

val banco = Banco()

/**
 * Configura um módulo do servidor. Cada módulo pode ter vários endpoints (endereços) e podem ser
 * "anexados" ao servidor pelas configurações do arquivo "application.conf" na pasta RESOURCES do
 * projeto.
 */
@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.banco(testing: Boolean = false) {
    /**
     * Configura o servidor para "imprimir" no log as mensagens e textos do servidor
     */
    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
    }

    /**
     * Configura o servidor para "entender" Json e converter para um objeto (instância de uma classe)
     */
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
            disableHtmlEscaping()
        }
    }

    /**
     * Configura as rotas do servidor, ou seja, os endpoints ou endereços disponíveis para cada
     * operação no servidor
     */
    routing {
        meuindex()
        cadastraContaCorrente()
        depositar()
        listarContas()
    }
}

fun Route.meuindex() {
    get("/") {
        call.respondHtml {
            body {
                h1 { +"API de Banco 1.0" }
                p { +"Tente chamar os outros endpoints para executar operações" }
                ul {
                    ol { +"POST - /contas/corrente        - Cria conta corrente" }
                    ol { +"POST - /contas/poupanca        - Cria conta poupança" }
                    ol { +"POST - /contas/investimento    - Cria conta investimento" }
                    ol { +"GET - /contas                  - Listar todas as contas"}
                }
            }
        }
    }
}

fun Route.cadastraContaCorrente() {
    post("/contas/corrente"){
        val contaParaCriar: ContaCorrente = call.receive<ContaCorrente>()
        val contaAberta = banco.abrirContaCorrente(contaParaCriar.titular!!, contaParaCriar.cpf!!, contaParaCriar.endereco!!)
        call.respond(contaAberta)
    }
}

fun Route.depositar() {
    post("/contas/corrente/depositar"){
        val deposito = call.receive<Deposito>()
        banco.depositar(deposito.agencia, deposito.conta, deposito.valor)
        call.respondText { "DEPÓSITO EFETUADO COM SUCESSO" }
    }
}

fun Route.listarContas() {
    get("/contas") {
        call.respond(banco.contasCorrente)
    }
}