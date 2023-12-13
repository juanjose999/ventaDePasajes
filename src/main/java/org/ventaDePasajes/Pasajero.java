package org.ventaDePasajes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Pasajero extends Persona{
    public String tipoReserva;
    private Date date;
    public Pasajero(String nombre, double id, LocalDate date, String numeroContacto, String typoReserva) {
        super(nombre, id, numeroContacto,date);
        this.tipoReserva = typoReserva;
        this.date = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    @Override
    public String toString() {
        String personInfo = super.toString();
        return personInfo + ", tipo de reserva: " + tipoReserva + ", date=" + date + "}";
    }
    public void tiket() {
        System.out.println("------------Reserva Exitosa-----------------------");
        System.out.println();
        String nombre = super.getNombre();
        double id = super.getId();
        String numero = super.getNumeroContacto();
        Date fecha = date;
        String datos = "\tNombre: " + nombre + "\n" + "\tNumero de CC: " + id + "\n"+ "\ttelefono " + numero + "\n" + "\tFecha: " + fecha + "\n" + "\tReserva de tipo: " + tipoReserva;
        System.out.println(datos);
        System.out.println();
        System.out.println("--------gracias por user nuestro servicion----------");
    }
}
