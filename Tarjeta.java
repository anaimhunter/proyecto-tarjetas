
/**
 * La clase Tarjeta representa un objeto que contiene saldo
 * @author Ana M.Hunter
 */
public class Tarjeta
{
    private float Saldo;
    
    /**
     * Constructor que inicializa el saldo
     */
    public Tarjeta()
    {
        Saldo=0;
    }
    
    /**
     * Deposita dinero en la tarjeta
     * @param dinero Representa la cantidad de dinero a depositar en la tarjeta
     */
    public void Deposita(float dinero)
    {
        Saldo= Saldo + dinero;
    }
    
    /**
     * Retira dinero de la tarjeta
     * @param dinero Representa la cantidad de dinero a retirar de la tarjeta
     * @return Regresa la cantidad de dinero a retirar en caso de que 
     *         no haya regresa cero
     */
    public float Retira(float dinero)
    {
        if(Saldo>= dinero)
        {
            Saldo = Saldo - dinero;
            return dinero;
        }
        else
        {
            return 0;
        }
    }
    
    /**
     * Consulta el saldo en la tarjeta
     * @return Regresa el saldo que tiene la tarjeta
     */
    public float Consultar()
    {
        return Saldo;
    }
}
