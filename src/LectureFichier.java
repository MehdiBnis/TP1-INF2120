import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class LectureFichier {
    public static int Base ;
    public static int Largeur;
    public static void LectureFichier(String[] args) {
        try {
            File Fichier = new File("nomfichier.txt");
            Scanner Lecteur = new Scanner(Fichier);
            ArrayList<String> TabDimensions = new ArrayList<String>();
            while (Lecteur.hasNextLine()){
                String Ligne = Lecteur.nextLine();
                TabDimensions.append(Integer.parseInt(Ligne.split(" ")));
            }
            Lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Aucun fichier n'a été trouvé.");
        }
    }
}
