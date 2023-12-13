package org.ventaDePasajes;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("ingrese el nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su numero de identificacion: ");
        int numeroId = scanner.nextInt();
        System.out.println("ingrese su numero de contacto: ");
        String numeroContacto = scanner.next();
        String reserva = null;
        do {
            System.out.println("""
                que tipo de reserva quiere hacer, seleccion una opcion:
                1- hotel
                2- cita medica 
                3- mesa de restaurante.""");
            int option = scanner.nextInt();
            switch (option){
                case 1:  reserva="hotel"; break;
                case 2:  reserva="cita medica"; break;
                case 3:  reserva="mesa restaurante"; break;
            }

        }while (reserva == null);
        try{
            LocalDate fechaActual = LocalDate.now();

            // Crea un Pasajero con la fecha actual
            Pasajero p1 = new Pasajero(nombre, numeroId, fechaActual, numeroContacto, reserva);

            // Imprime la información del Pasajero
            p1.tiket();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}