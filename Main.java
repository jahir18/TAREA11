package AgregacionComposicion;

public class Main {

    public  static  void  main ( String [] args ) {
        Celular  celular1 = new Celular ( "A53" , 5000 , "Samsung" );
            
        Chip  movistar = new Chip ( "movistar" , 981328727 );
        Chip  claro = new Chip ( "claro" , 937438433 );
        
        celular1.agregarChip (movistar);
        celular1.agregarChip (claro);
        
        celular1.morstrar ();
        
    }
    
}
