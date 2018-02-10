package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class DividirThings
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        public static boolean puedeTomar;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
            
            move(1);
            puedeTomar = estudiante.canPickThing();
            
            while(puedeTomar){
                ordenar();
            }
	}
        
        public static void ordenar(){
            puedeTomar = estudiante.canPickThing();
            while(puedeTomar){
                estudiante.pickThing();
                puedeTomar = estudiante.canPickThing();
            }
            int n = estudiante.countThingsInBackpack();
            turn(1);
            for(int i=0;i<n;i++){
                estudiante.putThing();
                move(1);
            }
            turn(2);
            move(n);
            turn(1);
            puedeTomar = estudiante.canPickThing();
            if(puedeTomar)
                move(1);
        }
        
        public static void move(int parametroEntrada){
            
            for (int i = 0; i < parametroEntrada; i++){
                estudiante.move();
            }
        }
        
        public static void turn(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.turnLeft();
        }
        
}

