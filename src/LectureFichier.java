import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;


public class LectureFichier {
    public static void LectureFichier(String[] args) {
        try {
            File Fichier = new File("nomfichier.txt");
            Scanner Lecteur = new Scanner(Fichier);
            int nbLignes = 0;
            while(Lecteur.hasNextLine()) {
                Lecteur.nextLine();
                nbLignes++;
            }
            int[][] TabDimensions = new int[nbLignes][];
            int i = 0;
            String[] ValeursLigne = new String[2];
            while (Lecteur.hasNextLine()){
                String Ligne = Lecteur.nextLine();
                ValeursLigne = Ligne.split(" ");
                TabDimensions[i][0] = Integer.parseInt(ValeursLigne[0]);
                TabDimensions[i][1] = Integer.parseInt(ValeursLigne[1]);
                i += 1;
            }
            Lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Aucun fichier n'a été trouvé.");
        }
    }
}
