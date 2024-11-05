package org.example;

import org.example.facade.Facade;
import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.*;

public class Test {
    public static void main(String[] args) {
    //tests design pattern

    //singleton

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(lazy);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    //strategy

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();

    robo.setComportamento(normal);
    robo.mover();
    robo.mover();

    robo.setComportamento(defensivo);
    robo.mover();

    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();

    //facade

    Facade facade = new Facade();
    facade.migrarCliente("João", "14001202");
    }
}
