package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Espiral
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
            
            for(int i=5;i>0;i--){
                move(i);
                turn(3);
            }
	}
        
        public static void iterar(int parametroEntrada){
            for(int i=0; i < parametroEntrada; i++){
                for (int j = 0; j < parametroEntrada; j++) 
                    estudiante.turnLeft();
                

                for (int j = 0; j < parametroEntrada; j++) 
                    estudiante.move();                
            }
            turn(3);
        }
        
        public static void move(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        
        public static void turn(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.turnLeft();
        }
        
}

