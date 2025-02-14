package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

//Pokemon 1 gagne, car son attaque est plus élevée
//Pokemon 2 gagne, car son attaque est plus élevée
//Pokemon 1 gagne, car sa defense est plus élevée
//Pokemon 2 gagne, car sa defense est plus élevée
//pokemon 1 gagne, car il est le premier renseigné par l'utilisateur
//pokemon 2 gagne, car il est le premier renseigné par l'utilisateur

    @Test
    void pokemon1_gagne_grace_a_son_attaque_plus_puissante(){
        //GIVEN
        Pokemon pokemon1 = new Pokemon( "imane",null , new Stats(10, 10));
        Pokemon pokemon2 = new Pokemon( "badr",null , new Stats(9, 0));
        //WHEN
        boolean vainqueur=pokemon1.estVainqueurContre(pokemon2);
        //ASSERT THEN
        assertThat(vainqueur).isEqualTo(pokemon2);
    }

    @Test
    void pokemon2_gagne_grace_a_son_attaque_plus_puissante(){
        //GIVEN
        Pokemon pokemon1 = new Pokemon( "imane",null , new Stats(10, 10));
        Pokemon pokemon2 = new Pokemon( "badr",null , new Stats(9, 0));
        //WHEN
        boolean vainqueur=pokemon2.estVainqueurContre(pokemon1);
        //ASSERT THEN
        assertThat(vainqueur).isEqualTo(pokemon1);
    }

}