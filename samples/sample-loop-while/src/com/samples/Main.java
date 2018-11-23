package com.samples;

public class Main {

    public static void main(String[] args) {
        /* inicialització per al processament de la seqüència */
        /* (pot incloure el tractament del primer element */

        Integer contador = 1;

        while (contador <= 10) {
            /* tractar l’element */
            /* avançar en seqüència */
            System.out.println(contador);
            contador++;
        }
        /* acabament del processament de la seqüència */
        /* (pot incloure el tractament de l’últim element) */

        System.out.println("******");

        /* inicialitzacio per al processament de la sequencia */
        /* (pot incloure el tractament del primer element) */
        int[] sequencia = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        boolean found = false;
        while (count < sequencia.length && !found) {
            /* tractar l’element */
            if (sequencia[count] == 8) {
                found = true;
            } else {
                count++;
            }
        }
        /* acabament del processament de la seqüència */
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
