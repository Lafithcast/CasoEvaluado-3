/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import javax.swing.JOptionPane;

/**
 *
 * @author lcast
 */
public class Principal {

    String productos[];
    int ventas[][];
    String dias[] = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    int cantidad;

    public void iniciar() {
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuántos productos desea registrar?"));
        productos = new String[cantidad];
        ventas = new int[7][cantidad];

        for (int i = 0; i < cantidad; i++) {
            productos[i] = JOptionPane.showInputDialog("Nombre del producto " + (i + 1) + ":");
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < cantidad; j++) {
                ventas[i][j] = (int)(Math.random() * 10);
            }
        }

        JOptionPane.showMessageDialog(null, "Datos cargados con éxito :D !!");
    }

    public void mostrarVentas() {
        String Mensaje = "Ventas semanales: \n";
        for (int j = 0; j < cantidad; j++) {
            Mensaje += productos[j] + "\n";
        }
        Mensaje += "\n";

        for (int i = 0; i < 7; i++) {
            Mensaje += dias[i] + "\n";
            for (int j = 0; j < cantidad; j++)
            {
                Mensaje += ventas[i][j] + "\n";
            }
            Mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, Mensaje);
    }

    public void totalPorProducto() {
        String mensaje = "Total de ventas por producto: \n";
        for (int j = 0; j < cantidad; j++) {
            int suma = 0;
            for (int i = 0; i < 7; i++) {
                suma += ventas[i][j];
            }
            mensaje += productos[j] + ": " + suma + " \n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void diaMayorVenta() {
        int mayor = 0;
        int posicion = 0;

        for (int i = 0; i < 7; i++) {
            int suma = 0;
            for (int j = 0; j < cantidad; j++) {
                suma += ventas[i][j];
            }
            if (suma > mayor) {
                mayor = suma;
                posicion = i;
            }
        }

        JOptionPane.showMessageDialog(null, "El día con mas ventas fue " + dias[posicion] + " con " + mayor + " ventas.");
    }

    public void productoMasVendido() {
        int mayor = 0;
        int posicion = 0;

        for (int j = 0; j < cantidad; j++) {
            int suma = 0;
            for (int i = 0; i < 7; i++) {
                suma += ventas[i][j];
            }
            if (suma > mayor) {
                mayor = suma;
                posicion = j;
            }
        }
            JOptionPane.showMessageDialog(null, "El producto más vendido fue " + productos[posicion] + " con " + mayor + " unidades.");
        }
    }  
