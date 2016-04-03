package Cap_12_Enum_Autoboxig_ImportEstatica_Anotaciones;

public class NewMain {

    public static void main(String[] args) {

        Trasnport tp;
        
        tp = Trasnport.BUS;
        
        if (tp == Trasnport.BICI) {
            
            System.out.println("El medio es " + tp.BICI);
        } else {
        
            System.out.println("Nada");
        }
        
        switch (tp) {
            case COCHE:
                System.out.println("Coche");
                
                break;
            case MOTO:
                System.out.println("Moto");
                
                break;
            case BUS:
                System.out.println("Bus");
                
                break;
            case CARRO:
                System.out.println("carro");
                
                break;
            default:
                System.out.println("Bici");
        }
        
        Trasnport allTransport[] = Trasnport.values();
        System.out.println("Contenido de la clase Enum:");
        System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>>");
        for (Trasnport trasnport : allTransport) {
            
            
            System.out.println(trasnport);
            System.out.println("----------");
        }
        
        Trasnport oneTransport = Trasnport.valueOf("BICI");
        
        System.out.println(oneTransport);
    }
    
}
