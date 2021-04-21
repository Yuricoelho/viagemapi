package servidor


import Viagem
import br.com.viagemapi.Itinerario
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
        inserirItinerario()
        listarDados()
        deletarDados()
        atualizar()
    }
}

fun Route.meuindex() {
    get("/") {
        call.respondHtml {
            body {
                h1 { +"API de Viagem 1.0" }
                p { +"Tente chamar os outros endpoints para executar operações" }
                ul {
                    ol { +"POST - /viagens/itinerario        - inserir itinerario" }
                    ol { +"GET - /dados                      - Listar a situação daquele estado na pandemia"}
                    ol { +"DELETE - /deletar                 - Deletar dados"}
                    ol { +"PUT - /atualizar                  - Atualilzar dados"}
                }
            }
        }
    }
}

fun Route.inserirItinerario() {
    post("/viagens/itinerario"){
        val itinerario: Itinerario = call.receive<Itinerario>()
        val criandoItinerario = viagem.inserirItinerario(itinerario.origem!!, itinerario.destino!!, itinerario.dataIda!!, itinerario.dataVolta!!)
        call.respond(criandoItinerario)
    }
}

fun Route.listarDados() {
    get("/dados") {
        call.respond(viagem.dados)
    }
}

fun Route.deletarDados(){
    delete("/deletar") {
        call.respond(viagem.dados)
    }
}

fun Route.atualizar(){
    put("/atualizar") {
        call.respond(viagem.dados)
    }
}