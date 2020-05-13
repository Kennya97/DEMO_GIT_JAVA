
package ejemplo_matriz;

/**
 *
 * @author W. Hernandez
 */
public class Matriz {

    
    public static void main(String[] args) {
        
      int matriz [][]=new int [4][4];
      
       int x=0;
       
       for(int i=0;i<=3; i++)
       {
       for(int j=0;j<=3; j++)
       {
           
       x=x+2;
       matriz[i][j]=x;
       
       System.out.print(matriz[i][j]+"  ");
       }
       
       System.out.println("");
       }
       
    }
    
}