package excepciones;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Excepciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
    Metodos obx= new Metodos ();
    
   /** obx.Division(6.0f, 2.0f);
    obx.Division(6.0f, 0.0f);
    

    obx.DividirCapturaExcepcion(6, 2);
    obx.DividirCapturaExcepcion(6, 0);
    
    try{
    obx.DividirLanzandoExcepcion(6, 0);
    }catch(ArithmeticException e){
        System.out.println("erro "+e.toString());
    }
            System.out.println(" o programa sigue ");
  
     try{
    obx.DividirMiExcepcion(6, 0);
    }catch(MiExcepcion e){
        System.out.println("erro "+e.toString());
    }
            System.out.println(" o programa sigue ");**/
    
    try{
    obx.IntervaloExcepcion(6, 2);
    }catch(MiExcepcion e){
        System.out.println("erro "+e.toString());   
    }catch(IntervaloExcepcion ex){
        System.out.println(ex.getMessage());
    }   
        System.out.println(" o programa sigue ");
                  
    }
    
}
