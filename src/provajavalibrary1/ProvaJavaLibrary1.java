package provajavalibrary1;

import ElMeusBeans.Comanda;
import ElMeusBeans.Producte;

/**
 *
 * @author bazag
 */
public class ProvaJavaLibrary1 {

    public static void main(String[] args) {
       
        // Creo los productos
        Producte[] productos = new Producte[3];
        productos[0] = new Producte(1, "Portable MSI USB 3.0", 10, 3, 50);
        productos[1] = new Producte(2, "Portátil ASUS", 6, 2, 140);
        productos[2] = new Producte(3, "USB 3.1", 40, 10, 28);
        
        // Creo el pedido
        Comanda comanda = new Comanda();
        
        for (int i = 0; i < productos.length; i++) {

            productos[i].addPropertyChangeListener(comanda);

            // Cambio el stock de los productos para hacer pruebas
            productos[i].setStockActual(20);

            if (comanda.isDemana()) {

                System.out.println("Hacer pedido del producto: " +  productos[i].getDescripcio());

            } else {

                System.out.println("No es necesario hacer el pedido del producto: " +  productos[i].getDescripcio());
            }
        }
    }
}
