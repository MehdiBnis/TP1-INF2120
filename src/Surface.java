import java.util.ArrayList;
public class Surface {
    public static LectureFichier Dimensions;
    public static ArrayList<int[]> ListeDimensions;
    public static int Base ;
    public static int Largeur;
    public static void Surface (){
        ListeDimensions = Dimensions.retournerListeDimensions();
        int i;
        for(i = 0; i < ListeDimensions.toArray().length; i++){
            ListeDimensions[i][0] = new Base;
            ListeDimensions[i][1] = new Largeur;
        }
    }
}
