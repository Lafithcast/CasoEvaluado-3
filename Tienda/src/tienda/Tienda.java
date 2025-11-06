/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import javax.swing.JOptionPane;

/**
 *
 * @author lcast
 */
public class Tienda {
    public static void main(String[] args) {
        Principal Tienda = new Principal();
        int opciones = 0;
        while (opciones != 6) {
            String[] menuPrincipal = {"Iniciar datos", "Mostrar ventas", "Totales por producto", "Día con más ventas", "Producto más vendido", "Salir",};
            opciones = JOptionPane.showOptionDialog(null, "Menú Tienda", "Abarrotes NC", 0, 0, null, menuPrincipal, menuPrincipal[0]);

            if (opciones == 0) {
                Tienda.iniciar();
            } else if (opciones == 1) {
                Tienda.mostrarVentas();
            } else if (opciones == 2) {
                Tienda.totalPorProducto();
            } else if (opciones == 3) {
                Tienda.diaMayorVenta();
            } else if (opciones == 4) {
                Tienda.productoMasVendido();
            } else if (opciones == 5) {
                JOptionPane.showMessageDialog(null, "Gracias por Usar :D");
                break;
            }
        }
    }
 }
    
