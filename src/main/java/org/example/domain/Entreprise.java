package org.example.domain;

public class Entreprise {
    private final String nom;
    private final String ville;
    private final String secteur;
    private final String siteWeb;

    static String verifTexte(String valeur, String champ){
        if(valeur == null || valeur.isBlank()){
            throw new IllegalArgumentException(champ + " Est obligatoire");
        }
        return valeur;
    }

    public Entreprise(String nom, String ville, String secteur, String siteWeb) {
        this.nom = verifTexte(nom, "Nom");
        this.ville = verifTexte(ville, "Ville");
        this.secteur = verifTexte(secteur, "Secteur");
        this.siteWeb = verifTexte(siteWeb, "Site Web");
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public String getSecteur() {
        return secteur;
    }

    public String getSiteWeb() {
        return siteWeb;
    }
}
