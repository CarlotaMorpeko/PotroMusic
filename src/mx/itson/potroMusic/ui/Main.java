/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potroMusic.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.potroMusic.entidades.Album;
import mx.itson.potroMusic.entidades.Artista;
import mx.itson.potroMusic.entidades.Cancion;
import mx.itson.potroMusic.enums.Genero;

/**
 *
 * @author Technologyland
 */
public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Para crear su album ingrese los siguientes datos.");
            System.out.println("Nombre del album:");
            String albumName = scanner.nextLine();

            System.out.println("Nombre del artista:");
            String artistName = scanner.nextLine();

            System.out.println("Sitio Web del artista:");
            String website = scanner.nextLine();

            System.out.println("La fecha de lanzamiento del album:");
            int albumRelease = scanner.nextInt();

            Artista artista = new Artista();
            artista.setNombre(artistName);
            artista.setSitioWeb(website);

            Album a = new Album();
            a.setNombre(albumName);
            a.setLanzamiento(albumRelease);
            a.setArtista(artista);
            a.setGenero(Genero.OTROS);
            List<Cancion> canciones = new ArrayList<>();

            while(true){
                
                System.out.println("Presione:\n 1.-Para agragar una cancion.\n 2.-Para terminar el proceso.");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                if(opcion== 1){
                   System.out.println("Ingrese el nombre de la cancion:");
                   String name = scanner.nextLine();

                   System.out.println("Ingrese la pocision:");
                   int posicion = scanner.nextInt();

                   System.out.println("Ingrese la duracion de la cancion expresada en segundos:");
                   int duracion = scanner.nextInt();

                   Cancion song = new Cancion();
                   song.setNombre(name);
                   song.setOrden(posicion);
                   song.setDuracion(duracion);

                   canciones.add(song);
               }
                if(opcion== 2){
                    System.out.println("Finalizado.");
                    a.setCancion(canciones);
                    System.out.println("======================================");
                    System.out.println("       Informacion del album           ");
                    System.out.println("======================================");
                    System.out.println("Album Name:" + a.getNombre());
                    System.out.println("Artist Name:" + a.getArtista().getNombre());
                    System.out.println("Artist Website:"+ a.getArtista().getSitioWeb());
                    System.out.println("Album Release:"+ a.getLanzamiento());
                    System.out.println("Artist Gender:" + a.getGenero());
                    System.out.println("======================================");               
                        for(Cancion c : a.getCancion()){
                        System.out.println("======================================");
                        System.out.println("     Informacion de la cancion           ");
                        System.out.println("======================================");
                        System.out.println("Nombre:" + c.getNombre());
                        System.out.println("Posicion:" + c.getOrden());
                        System.out.println("La duracion es de:" + c.getDuracion()+" segundos");
                        System.out.println("======================================");
                        }
                        break;
                }
                else
                    System.out.println("Seleccione una de las opciones solicitadas.");
            }
        }catch (Exception ex){
           System.err.println("No es posible crear el album");
        }
    }   
}