package excepciones;

/**
 *
 * @author mmartinezcosta
 */
public class Metodos {

    public void Division(float numerador, float denominador){
        
        float resultado=numerador/denominador;
        
        System.out.println(resultado);
    }
        
    public void DividirCapturaExcepcion (int numerador, int denominador){
        
        try{
            System.out.println("resultado= "+numerador/denominador);
        System.out.println("fin de programa");
        }catch (ArithmeticException e){
            System.out.println("Error" +e.getMessage());
        }catch (Exception ex){
            System.out.println("erro xeral "+ex.toString());
        }
        
        finally{
            System.out.println("***executase sempre***");
        }
   
        }
    
public void DividirLanzandoExcepcion(int numerador, int denominador)throws ArithmeticException {
 
    if(denominador==0)
        throw new ArithmeticException ("non dividas entre cero");
        System.out.println("resultado= "+numerador/denominador);
        System.out.println("remato programa");
}

public void DividirMiExcepcion(int numerador, int denominador) throws MiExcepcion{
    if (denominador==0)
        throw new MiExcepcion("****NON PODES DIVIDIR ENTRE CERO");
    
    System.out.println("resultado= "+numerador/denominador);
    System.out.println("remato programa");
}

public void IntervaloExcepcion(int numerador, int denominador) throws IntervaloExcepcion,MiExcepcion{
    if (denominador==0)
        throw new MiExcepcion("**** NON PODES DIVIDIR ENTRE CERO ****");
    if (8>numerador || 20<numerador)
        throw new IntervaloExcepcion("**** El numerador tiene que estar entre 8 y 20 ****");
    
    System.out.println("resultado= "+numerador/denominador);
    System.out.println("remato programa");
}


}
                
       
   

