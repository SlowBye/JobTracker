package org.example;

import org.example.domain.*;      // donne accès à toutes tes classes du domaine
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Candidature> filtrer(List<Candidature> candidatures, CritereCandidature  critere) {
        List<Candidature> candidaturesFiltrer = new ArrayList<>();
        for (Candidature candidature : candidatures) {
            if(critere.Accepte(candidature)) {
                candidaturesFiltrer.add(candidature);
            }
        }
        return candidaturesFiltrer;
    }

    static void main() {
        Entreprise Acme = new Entreprise("Acme", "Marseille", "informatique", "https://www.Acme.fr");
        Entreprise Globex = new Entreprise("Globex", "Arles", "informatique c++", "https://www.Globex.fr");
        Offre AcmeOffre = new Offre("Développeur Java junior", Acme, List.of("Java","Spring"),"https://www.Acme.fr","France Travail");
        Offre GlobexOffre = new Offre("Développeur TypeScript", Globex, List.of("TypeScript","JavaScript", "Jest"),"https://www.Acme.fr","Indeed");

        Candidature A = new Candidature(AcmeOffre, StatutCandidature.ENVOYEE,"Premier contact");
        Candidature B = new Candidature(GlobexOffre, StatutCandidature.ENTRETIEN,"Entretien avec la RH");
        Candidature C = new Candidature(AcmeOffre, StatutCandidature.REFUS,"Refus");

        List<Candidature> candidatures = List.of(A,B,C);
        CritereCandidature critereCandidature = new CritereParEntreprise("acme");
        for (Candidature c : filtrer(candidatures, critereCandidature)) {
            System.out.println(c.getOffre().getEntreprise().getNom());
        }

        System.out.println("Deuxième Critère de sélection :");

        CritereParStatut critereParStatut = new CritereParStatut(StatutCandidature.ENTRETIEN);
        for (Candidature c : filtrer(candidatures, critereParStatut)) {
            System.out.println(c.getOffre().getEntreprise().getNom());
        }

    }
}