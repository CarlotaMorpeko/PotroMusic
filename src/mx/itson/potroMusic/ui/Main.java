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
        
        Scanner scanner = new Scanner(System.in);
        
        Artista artista = new Artista();
        artista.setNombre("Laufey");
        artista.setSitioWeb("WWW.Laufey.Spotify.com");
       
        Album a = new Album();
        a.setNombre("Bewitched");
        a.setLanzamiento(2023);
        a.setArtista(artista);
        a.setGenero(Genero.JAZZPOP);
        
        
        List<Cancion> canciones = new ArrayList<>();
        
    }
}
