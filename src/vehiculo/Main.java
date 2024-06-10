
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        Vehiculo miVeiculo;
        int stockActual;
        
        miVeiculo = new Vehiculo("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVeiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVeiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVeiculo.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
