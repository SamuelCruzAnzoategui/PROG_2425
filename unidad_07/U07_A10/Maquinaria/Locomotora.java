
package Maquinaria;

import Personal.Mecanico;


public class Locomotora {
    private String matricula;
    private int potencia;
    private int añoFabricacion;
    private Mecanico mecanicoAsignado;

    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }
}
