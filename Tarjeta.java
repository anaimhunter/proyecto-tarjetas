
/**
 * Write a description of class Tarjeta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tarjeta
{
    private float Saldo;
    
    public Tarjeta()
    {
        Saldo=0;
    }
    
    public void Deposita(float dinero)
    {
        if(Saldo>0)
        {
           Saldo= Saldo + dinero;
        }
       
    }
    
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
    
    public float Consultar()
    {
        return Saldo;
    }
}
