/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC19
 */
public class trcnTienda {

    private String trcnNombreTienda;
    private String trcnPropietarioTienda;
    private String trcnIdentificadorTributario;
    private List<trcnComputador> trcnComputadores;

    public trcnTienda(String trcnNombreTienda, String trcnPropietarioTienda, String trcnIdentificadorTributario) {
        this.trcnNombreTienda = trcnNombreTienda;
        this.trcnPropietarioTienda = trcnPropietarioTienda;
        this.trcnIdentificadorTributario = trcnIdentificadorTributario;
        this.trcnComputadores = new ArrayList<>();
    }

    public void agregarTrcnComputador(trcnComputador computador) {
        trcnComputadores.add(computador);
    }

    public int contarTrcnComputadores() {
        return trcnComputadores.size();
    }

    public trcnComputador buscarTrcnComputadorPorMarca(String marca) {
        for (trcnComputador computador : trcnComputadores) {
            if (computador.getTrcnMarca().equalsIgnoreCase(marca)) {
                return computador;
            }
        }
        return null;
    }

    public List<trcnComputador> obtenerTodosLosTrcnComputadores() {
        return trcnComputadores;
    }

    // Getters and setters para los atributos

    public String getTrcnNombreTienda() {
        return trcnNombreTienda;
    }

    public void setTrcnNombreTienda(String trcnNombreTienda) {
        this.trcnNombreTienda = trcnNombreTienda;
    }

    public String getTrcnPropietarioTienda() {
        return trcnPropietarioTienda;
    }

    public void setTrcnPropietarioTienda(String trcnPropietarioTienda) {
        this.trcnPropietarioTienda = trcnPropietarioTienda;
    }

    }


            