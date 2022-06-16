package AgregacionComposicion;

public class Celular {

    private String modelo;
    private Bateria bateria; //Relacion de Composicion.
    private int nroChips;
    private Chip[] chips; //Relacion de Agregacion.

   public  Celular ( String  modelo , int  cantMAh , String  marca ){
       this.modelo = modelo ;
       this.bateria =new  Bateria ( cantMAh , marca);
       this.nroChips = 0 ;
       this.chips= new Chip[ 2 ];
   }
   
    public void morstrar (){
       System.out.println ( "Modelo:" + modelo );
       bateria.mostrar ();
       System.out.println ( "Número de chips: " + nroChips );
       for( int  i = 0 ; i < nroChips ; i ++){
           chips[i].mostrar ();
       }
   }
   
   public  void  agregarChip ( Chip  nuevoChip ){
       if( nroChips < 2 ){
           chips[ nroChips ]= nuevoChip ;
           nroChips ++;
       }
   }
}
    

