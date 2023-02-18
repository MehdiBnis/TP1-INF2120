import java.util.ArrayList;
public class Surface {
    public static LectureFichier Dimensions;
    public static ArrayList<int[]> ListeDimensions = Dimensions.retournerListeDimensions();
    public static int i;
    public static int[] surfacePiece = ListeDimensions.get(i);
    public static int Base = surfacePiece[0];
    public static int Largeur = surfacePiece[1];

    public void setDimensions(){
        Base = this.Base;
        Largeur = this.Largeur;
    }

    public static void printO(int Nombre){
        System.out.print("O");
    }

    public static void Surface(int Base, int Largeur){
        int x;
        int y;
        for(x = 0; x < Base; x++){
            for(y = 0; y < Largeur; y++){
                printO(Largeur);
            }
        }
    }
}
