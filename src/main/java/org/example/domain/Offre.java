package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Offre {
    private final String intitule;
    private final Entreprise entreprise;
    private final List<String> techno;
    private final String lien;
    private final String source;

    static String verifTexte(String valeur, String champ){
        if(valeur == null || valeur.isBlank()){
            throw new IllegalArgumentException(champ + " Est obligatoire");
        }
        return valeur;
    }

    public Offre(String intitule, Entreprise entreprise, List<String> techno, String lien, String source) {

        if( techno == null || techno.isEmpty() ){
            throw new IllegalArgumentException( "La techno Est obligatoire");
        }

        if(entreprise == null){
            throw new IllegalArgumentException("L'entreprise Est obligatoire");
        }

        this.intitule = verifTexte(intitule, "Intitule");
        this.techno = new ArrayList<String>(techno);
        this.entreprise = entreprise;
        this.lien = verifTexte(lien, "lien");
        this.source = verifTexte(source, "Source");
    }

    public String getIntitule() {
        return intitule;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public List<String> getTechno(){
        return List.copyOf(techno);
    }

    public String getLien() {
        return lien;
    }

    public String getSource() {
        return source;
    }
}
