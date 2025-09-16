
public class verica_prim{

    public static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= numero / 2; i++){
            if (numero % i == 0){
                return false; 
            }
        }
        return true;
    }
}