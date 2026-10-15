package org.example.domain;

public class CritereParStatut implements CritereCandidature {
    private final StatutCandidature statutRecherche;

    public CritereParStatut(StatutCandidature statut) {
        this.statutRecherche = statut;
    }

    @Override
    public boolean Accepte(Candidature candidature) {
        return candidature.getStatut() == statutRecherche;
    }
}
