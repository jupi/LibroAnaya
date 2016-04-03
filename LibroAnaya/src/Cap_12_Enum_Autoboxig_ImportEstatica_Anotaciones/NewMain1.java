package Cap_12_Enum_Autoboxig_ImportEstatica_Anotaciones;

public class NewMain1 {

    public static void main(String[] args) {

        Trasnport tp;
        
        //mostrar velocidad de bus
        
        System.out.println("La velocidad del bus es: " + Trasnport.BUS.getSpeed());
        
        System.out.println("La velocidad de todos es: ");
        
        for (Trasnport t : Trasnport.values()) {
            
            System.out.println(t + " tipycal spped is :" + t.getSpeed());
            System.out.println("--------------------------");
        }
        
    }
    
}
