package servidor

import Viagem
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.html.*
import io.ktor.request.*
import io.ktor.routing.*
import kotlinx.html.*
import org.slf4j.event.Level

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

val viagem = Viagem()

/**
 * Configura um módulo do servidor. Cada módulo pode ter vários endpoints (endereços) e podem ser
 * "anexados" ao servidor pelas configurações do arquivo "application.conf" na pasta RESOURCES do
 * projeto.
 */


@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.viagem(testing: Boolean = false) {
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
        //cadastraContaCorrente()
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

//fun Route.inserirItinerario() {
//    post("/itinerario"){
//        val itinerario: Itinerario = call.receive<Itinerario>()
//        val criandoItinerario = viagem.(contaParaCriar.titular!!, contaParaCriar.cpf!!, contaParaCriar.endereco!!)
//        call.respond(contaAberta)
//    }
//}
