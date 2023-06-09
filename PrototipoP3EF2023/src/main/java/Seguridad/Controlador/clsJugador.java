/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seguridad.Controlador;

import Seguridad.Modelo.daoJugador;
import java.util.List;

/**
 *
 * @author halld
 */
public class clsJugador {
 // CAMBIOS HECHOS POR : DANIEL ALEXANDER HALL ALVAREZ;9959-21-1395 Y MONICA GABRIELA PEREZ VELÁSQUEZ; 9959-21-1840.
    private int idCCorriente;
    private int idCCliente;
    private String nombreCCliente;
    private String fechaCCorriente;
    private String nofacturaCCorriente;
    private int haberCCorriente;
    private int debeCCorriente;
    private int saldoCCorriente;

    public void setIdCCorriente(int idCCorriente) {
        this.idCCorriente = idCCorriente;
    }

    public void setIdCCliente(int idCCliente) {
        this.idCCliente = idCCliente;
    }

    public void setNombreCCliente(String nombreCCliente) {
        this.nombreCCliente = nombreCCliente;
    }

    public void setFechaCCorriente(String fechaCCorriente) {
        this.fechaCCorriente = fechaCCorriente;
    }

    public void setNofacturaCCorriente(String nofacturaCCorriente) {
        this.nofacturaCCorriente = nofacturaCCorriente;
    }

    public void setHaberCCorriente(int haberCCorriente) {
        this.haberCCorriente = haberCCorriente;
    }

    public void setDebeCCorriente(int debeCCorriente) {
        this.debeCCorriente = debeCCorriente;
    }

    public void setSaldoCCorriente(int saldoCCorriente) {
        this.saldoCCorriente = saldoCCorriente;
    }

    public int getIdCCorriente() {
        return idCCorriente;
    }

    public int getIdCCliente() {
        return idCCliente;
    }

    public String getNombreCCliente() {
        return nombreCCliente;
    }

    public String getFechaCCorriente() {
        return fechaCCorriente;
    }

    public String getNofacturaCCorriente() {
        return nofacturaCCorriente;
    }

    public int getHaberCCorriente() {
        return haberCCorriente;
    }

    public int getDebeCCorriente() {
        return debeCCorriente;
    }

    public int getSaldoCCorriente() {
        return saldoCCorriente;
    }

    public clsJugador(int idCCorriente, int idCCliente, String nombreCCliente, String fechaCCorriente, String nofacturaCCorriente, int haberCCorriente, int debeCCorriente, int saldoCCorriente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
        this.nombreCCliente = nombreCCliente;
        this.fechaCCorriente = fechaCCorriente;
        this.nofacturaCCorriente = nofacturaCCorriente;
        this.haberCCorriente = haberCCorriente;
        this.debeCCorriente = debeCCorriente;
        this.saldoCCorriente = saldoCCorriente;
    }

    public clsJugador(int idCCorriente, int idCCliente, String nombreCCliente, String fechaCCorriente, String nofacturaCCorriente, int haberCCorriente, int debeCCorriente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
        this.nombreCCliente = nombreCCliente;
        this.fechaCCorriente = fechaCCorriente;
        this.nofacturaCCorriente = nofacturaCCorriente;
        this.haberCCorriente = haberCCorriente;
        this.debeCCorriente = debeCCorriente;
    }

    public clsJugador(int idCCorriente, int idCCliente, String nombreCCliente, String fechaCCorriente, String nofacturaCCorriente, int haberCCorriente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
        this.nombreCCliente = nombreCCliente;
        this.fechaCCorriente = fechaCCorriente;
        this.nofacturaCCorriente = nofacturaCCorriente;
        this.haberCCorriente = haberCCorriente;
    }

    public clsJugador(int idCCorriente, int idCCliente, String nombreCCliente, String fechaCCorriente, String nofacturaCCorriente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
        this.nombreCCliente = nombreCCliente;
        this.fechaCCorriente = fechaCCorriente;
        this.nofacturaCCorriente = nofacturaCCorriente;
    }

    public clsJugador(int idCCorriente, int idCCliente, String nombreCCliente, String fechaCCorriente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
        this.nombreCCliente = nombreCCliente;
        this.fechaCCorriente = fechaCCorriente;
    }

    public clsJugador(int idCCorriente, int idCCliente, String nombreCCliente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
        this.nombreCCliente = nombreCCliente;
    }

    public clsJugador(int idCCorriente, int idCCliente) {
        this.idCCorriente = idCCorriente;
        this.idCCliente = idCCliente;
    }

    public clsJugador(int idCCorriente) {
        this.idCCorriente = idCCorriente;
    }
    public clsJugador() {
    }
    
    //Metodos de acceso a la capa controlador
    public clsJugador getBuscarInformacionCCPorNombre(clsJugador CCorriente)
    {
        daoJugador daoCCorrientes = new daoJugador();
        return daoCCorrientes.consultaCCPorNombre(CCorriente);
    }
    public clsJugador getBuscarInformacionCCPorId(clsJugador CCorriente)
    {
        daoJugador daoJugador = new daoJugador();
        return daoJugador.consultaCCPorId(CCorriente);
    }    
    public List<clsJugador> getListadoCC()
    {
        daoJugador daoJugador = new daoJugador();
        List<clsJugador> listadoCCorrientes = daoJugador.consultaCC();
        return listadoCCorrientes;
    }
    public int setBorrarCC(clsJugador CCorriente)
    {
        daoJugador daoJugador = new daoJugador();
        return daoJugador.borrarCC(CCorriente);
    }          
    public int setIngresarCC(clsJugador CCorriente)
    {
        daoJugador daoJugador = new daoJugador();
        return daoJugador.ingresaCC(CCorriente);
    }              
    public int setModificarCC(clsJugador CCorriente)
    {
        daoJugador daoJugador = new daoJugador();
        return daoJugador.actualizaCC(CCorriente);
    }
    }
