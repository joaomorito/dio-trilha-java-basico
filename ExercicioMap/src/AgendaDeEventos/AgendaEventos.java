package AgendaDeEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        if(!eventosMap.isEmpty()){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
        }
    }

    public void obterProximoEvento() {
        if (!eventosMap.isEmpty()) {
            LocalDate dataAtual = LocalDate.now();
            LocalDate proximaData = null;
            Evento proximoEvento = null;
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
                if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                    break;
                }
            }
        }
    }
    
}
