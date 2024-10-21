package org.example;

import java.util.logging.Logger;

public class DB {

    private static final Logger LOGGER = Logger.getLogger(DB.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("iniciou conexão");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizou conexão");
    }

    public static void inserirDados(Pessoa pessoa){
        LOGGER.info("Inseriu dados");
    }

    public static void removerDados(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }
}
