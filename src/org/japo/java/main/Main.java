/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final String NOM_CAN = "Ruperta";
        final int NUM_CAN = 5;
        final int FIN_CAN = 1;

        //Cabecera
        System.out.println("Secuencia de Canicas");
        System.out.println("====================");

        //Cuerpo incial
        System.out.printf("Nombre de la canica ........: %s%n", NOM_CAN);

        //Separador
        System.out.println("---");

        //Numero canicas
        System.out.printf("Número de canicas inicial ..: %d%n", NUM_CAN);
        System.out.printf("Número de canicas final ....: %d%n", FIN_CAN);

        //Separador
        System.out.println("---");

        //Calculos
        int canPerdidas = NUM_CAN - FIN_CAN;

        //Conclusion
        System.out.printf("Número de canicas perdidas .: %d%n", canPerdidas);

    }
}
