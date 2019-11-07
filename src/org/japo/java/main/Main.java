/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes
        final double MAX = 1;
        final double MIN = 0.01;

        //Variables
        int donaciones;
        double euros;
        double royaltis;

        donaciones = 0;

        System.out.println("Maratón solidario");
        System.out.println("=================");
        for (royaltis = 0; donaciones <= 13247; donaciones++) {
            euros = RND.nextDouble() * (MAX - MIN) + MIN;
            royaltis += euros;
        }
        System.out.printf("Dinero recaudado ..: %.2f%n", royaltis);
    }
}
