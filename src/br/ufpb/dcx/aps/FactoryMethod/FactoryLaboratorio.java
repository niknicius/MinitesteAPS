package br.ufpb.dcx.aps.FactoryMethod;

public class FactoryLaboratorio {

    public Laboratorio getLaboratorio(String tipo){
        if(tipo.equalsIgnoreCase("design")){
            return new LabDesign();
        }else if(tipo.equalsIgnoreCase("computacao")){
            return new LabComputacao();
        }else if(tipo.equalsIgnoreCase("ecologia")){
            return new LabEcologia();
        }

        return null;
    }



}
