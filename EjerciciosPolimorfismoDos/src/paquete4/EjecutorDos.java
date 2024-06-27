/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class EjecutorDos {

    public static void main(String[] args) {

        ArrayList<Arriendo> listaArriendos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos arriendo desea ingresar? ");
        int numArriendo = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numArriendo; i++) {
            System.out.println("===========================");
            System.out.println("Ingrese el tipo de arriendo");
            System.out.println("===========================");
            System.out.println("1.- Local Comida");
            System.out.println("===========================");
            System.out.println("2.- Local Comercial");
            System.out.println("===========================");
            System.out.println("3.- Local seciones ");
            System.out.println("===========================");
            int tipoArriendo = sc.nextInt();
            
            switch (tipoArriendo) {
                
                case 1:
                    System.out.println("Ingrese los datos para el arriendo local de comida: ");
                    System.out.println(" Nombre del local comida");
                    String nom1 = sc.nextLine();
                    System.out.print(" Costo Base: ");
                    double costoBaseComida = sc.nextDouble();
                    System.out.print(" IVA: ");
                    double ivaComida = sc.nextDouble();
                    System.out.print(" Valor Agua: ");
                    double valorAgua = sc.nextDouble();
                    System.out.print(" Valor Luz: ");
                    double valorLuz = sc.nextDouble();
                    sc.nextLine();
                    ArriendoLocalComida alc = new ArriendoLocalComida(nom1, costoBaseComida);
                    alc.establecerIva(ivaComida);
                    alc.establecerValorAgua(valorAgua);
                    alc.establecerValorLuz(valorLuz);
                    listaArriendos.add(alc);
                    break;
                    
                case 2:
                    System.out.println("Ingrese los datos para arriendo local comercial:");
                    System.out.println(" Nombre del local comercial");
                    String nom2 = sc.nextLine();
                    System.out.println(" Costo base:");
                    double costoBaseComercial = sc.nextDouble();
                    System.out.println(" Valor adicional fijo");
                    double valorAdicionalFijo = sc.nextDouble();
                    sc.nextLine();
                    ArriendoLocalComercial alco = new ArriendoLocalComercial(nom2, costoBaseComercial);
                    alco.establecerValorAdicionalFijo(valorAdicionalFijo);
                    listaArriendos.add(alco);
                    break;
                    
                case 3:
                    System.out.println("Ingrese los datos para arriendo local sesiones:");
                    System.out.println(" Nombre del local sesiones:");
                    String nom3 = sc.nextLine();
                    System.out.println(" Costo base:");
                    double costoBaseSesiones = sc.nextDouble();
                    System.out.println(" Valor por sillas:");
                    double valorSillas = sc.nextDouble();
                    System.out.println(" Valor de amplificaion:");
                    double valorAmplificacion = sc.nextDouble();
                    sc.nextLine();
                    ArriendoLocalSesiones als = new ArriendoLocalSesiones(nom3,costoBaseSesiones);
                    als.establecerValorSillas(valorSillas);
                    als.establecerValorAmplificacion(valorAmplificacion);
                    listaArriendos.add(als);
                    break;
                    
                default:
                    System.out.println(" Ingrese el tipo de arriendo indicado...\n"
                            + "Intente de nuevo...");
            }
        }
        for (Arriendo arriendo : listaArriendos) {
            arriendo.establecerArriendoMensual();
            
        }
        CentroComercial cc = new CentroComercial("La Pradera", listaArriendos);
        cc.establecerTotalArriendosBaseMensual();
        cc.establecerTotalArriendosFinalMensual();
        System.out.println(cc);
        
        sc.close();
        /*
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                "Christian Shepherd", 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                "Andrew Schroeder", 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                "Angela Watson", 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }
        
        CentroComercial centro = new CentroComercial("La Pradera", 
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);
    
    }
         */
    }
}