import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando =! atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            } else{
                System.out.println("Contato realizado com sucesso"  );
            }
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa(s) realizada(s)");
        } else{
            System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas realizadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for(int i=0; i<candidatos.length; i++){
            System.out.println("O índice do candidato " + candidatos[i] + " é " + (i+1));
        }

        for(String selecionados : candidatos){
            System.out.println("Candidato selecionado: " + selecionados);
        }

    }

    static void SelecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double baseSalario = 2000.0;
    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
        if(baseSalario >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatoAtual++;
    }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void AnalisarCandidato(double salarioPretendido){
        double baseSalario = 2000.0;

        if(baseSalario > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(baseSalario == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
