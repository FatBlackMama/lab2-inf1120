/**
 * Write a description of class Horloge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Horloge
{
    public static void main(String[]args){
        int nbSecondesSaisies=0;
        int nbSecondes=0;
        int nbMinutes=0;
        int nbHeures=0;
        int nbJours=0;

        System.out.println("Nombre de secondes SVP:");
        nbSecondesSaisies=Clavier.lireInt();

        while(nbSecondesSaisies!=0){
            if(nbSecondesSaisies>0){
                nbSecondes=nbSecondesSaisies%60;
                nbMinutes=nbSecondesSaisies/60;
                nbHeures=nbMinutes/60;
                nbMinutes=nbMinutes%60;
                nbJours=nbHeures/24;
                nbHeures=nbHeures%24;
                System.out.println(nbJours+":"+nbHeures+":"+nbMinutes+":"+nbSecondes);
            }else{
                System.out.println("Erreur!");
            }
            System.out.println("Nombre de secondes SVP:");
            nbSecondesSaisies=Clavier.lireInt();
        }
        System.out.println("FIN");
    }
}
