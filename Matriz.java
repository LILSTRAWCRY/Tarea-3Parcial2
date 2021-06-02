
public class Matriz
{
    public int[][] CrearMatriz(int tamanio){
        int[][] nuevo =  new int[tamanio][tamanio];
        int dato =0;
        for(int filas =0; filas<nuevo.length ;filas++){
            for(int columnas=0 ; columnas<nuevo.length ;columnas++){
                nuevo[filas][columnas]= dato++;
            }
        }
        return nuevo ;
    }
// recorrido caracol o en espiral en orden del 1 al n con impresion full HD
    public void RecorridoCaracol(int matriz[][]){
        int a = 0 ;
        int b = matriz.length-1 ;
        int valor=1;//iniciamos un ciclo externo
        for(int aux=0 ;aux<= matriz.length ;aux++){
            //llenamos la fila superior
            for(int i=a ; i<=b ; i++){
                matriz[a][i]= valor;
                valor++;
            } 
            //llenamos la fila del extremo derecho
            for(int i= a+1 ;i<=b ; i++){
                matriz[i][b]= valor;
                valor++;
            }
            //llenamos la fila de la parte inferior
            for(int i= b-1 ;i>=a ; i--){
                matriz[b][i] = valor ;
                valor++;
            }
            //llenamos la fila del extremo izquierdo
            for(int i= b-1 ;i>=a+1 ; i--){
                matriz[i][a]= valor ;
                valor++;
            }
            a++; // a seria como el que delimita el primer punto desde el que se comienza

            b--; // b seria como el que delimita el final de los paramtros establecidos

        }
        imprimir(matriz);
    }
    
    // recorrido en espiral de la matriz creada por defecto, con impresion full HD
    public void RecorridoeSpiral(int matriz[][]){
        int a = 0 ;
        int b = matriz.length-1 ;
         //iniciamos un ciclo externo
        for(int aux=0 ;aux<= matriz.length ;aux++){
            //llenamos la fila superior
            for(int i=a ; i<=b ; i++){
                System.out.print(matriz[a][i]+" ") ;
            } 
            System.out.println();
            //llenamos la fila del extremo derecho
            for(int i= a+1 ;i<=b ; i++){
              
                 System.out.print(  matriz[i][b]+" ");
            }
             System.out.println();
            //llenamos la fila de la parte inferior
            for(int i= b-1 ;i>=a ; i--){
                
                System.out.print(matriz[b][i]+" ");
            }
             System.out.println();
            //llenamos la fila del extremo izquierdo
            for(int i= b-1 ;i>=a+1 ; i--){
                
               System.out.print( matriz[i][a]+" ");
            }
             System.out.println();
            a++; // a seria como el que delimita el primer punto desde el que se comienza

            b--; // b seria como el que delimita el final de los paramtros establecidos

        }

    }
    

    public void imprimir(int matriz [][]){
        for(int[] m : matriz){
            System.out.println();
            for(int a : m){
                System.out.print(" "+a+" ");
            }
        }
    }

    public void Diagonales(int matriz[][]){
        System.out.print("Diagonal principal \n");
        for(int i = 0 ; i< matriz.length ; i++){
            System.out.print(matriz[i][i]+" ");
        }
        System.out.print("\n Diagonal secundaria \n");
        int extra=0;
        for(int j =(matriz.length-1) ; j>=0; j--){

            System.out.print(matriz[extra][j]+" ");
            extra++;
        }

    }
}
