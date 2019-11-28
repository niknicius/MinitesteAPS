package br.ufpb.dcx.aps.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        FactoryLaboratorio factoryLaboratorio = new FactoryLaboratorio();
        factoryLaboratorio.getLaboratorio("ecologia");
        factoryLaboratorio.getLaboratorio("design");
        factoryLaboratorio.getLaboratorio("computacao");
    }
}
