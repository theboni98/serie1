/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tema1App {
    
    Logger logger final estático privado = Logger.getLogger (Tema1App.class.getName ());
    
    public static void main (String [] args) {
        logger.log (Level.INFO, "Programa iniciado ...");
        
        mostrarInstrucciones ();
    }
    
    public static void mostrarInstrucciones () {
        System.out.println ("INSTRUCCIONES");
        System.out.println ("------------------------------------------- -------------------------------------------------- ------------------ ");
        System.out.println ("1. \ tImplemente el Dockerfile para crear la imagen Docker correspondiente al programa Tema1.java");
        System.out.println ("2. \ tConstruya la imagen Docker utilizando el programa contenido en Tema1.java y el Dockerfile que usted ha implementado en el paso anterior.");
        System.out.println ("3. \ tAseg Asegúrese de que usted puede ejecutar el contenedor Docker a partir de la imagen Docker creada.");
        System.out.println ("4. \ tPublique la imagen Docker en el Docker Hub con la etiqueta \" so1-final-tema1 \ ". Por ejemplo: \" gluna / so1-final-tema1 \ "");
        System.out.println ("5. \ tRemueva cualquier instancia del contenedor Docker de su Docker Engine local.");
        System.out.println ("6. \ tRemueva la imagen de su Docker Engine local.");
        System.out.println ("7. \ tAseg Asegúrese de que usted puede ejecutar el contenedor Docker a partir de la imagen Docker publicada.");
        System.out.println ("8. \ tIndique en su temario el contenido del Dockerfile que ha implementado para el tema 1.");
        System.out.println ("9. \ tIndique en su temario el comando docker pull ... para descargar la imagen correspondiente al tema 1.");
        System.out.println ("10. \ tIndique en su temario el comando docker run ... para ejecutar un contenedor para la imagen Docker correspondiente al tema 1.");
        System.out.println ("------------------------------------------- -------------------------------------------------- ------------------ ");
    }
    
}