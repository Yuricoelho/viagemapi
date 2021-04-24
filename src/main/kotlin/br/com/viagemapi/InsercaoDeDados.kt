package br.com.viagemapi

abstract class InsercaoDeDados {
    abstract fun inserirItinerario(origem: String, destino: String, dataIda: String, dataVolta: String): Itinerario;
}