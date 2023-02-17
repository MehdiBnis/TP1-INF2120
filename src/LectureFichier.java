import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class LectureFichier {
    public static ArrayList<int[]> ListeDimensions = new ArrayList<>();
    public static void lectureFichier() {
        try {
            File Fichier = new File("test1.txt");
            Scanner Lecteur = new Scanner(Fichier);

            String[] ValeursLigne;
            int[] TabDimensions;
            while (Lecteur.hasNextLine()){

                TabDimensions = new int[2];
                String Ligne = Lecteur.nextLine();

                ValeursLigne = Ligne.split(" ");
                TabDimensions[0] = Integer.parseInt(ValeursLigne[0]);
                TabDimensions[1] = Integer.parseInt(ValeursLigne[1]);
                ListeDimensions.add(TabDimensions);




            }
            Lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Aucun fichier n'a été trouvé.");
        }
    }
    public static ArrayList<int[]> retournerListeDimensions(){
        return ListeDimensions;
    }
}