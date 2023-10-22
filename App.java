/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) throws UnknownHostException, IOException {
        try{
            System.out.print("Vuvedete nomer na porta: ");
            int PortNumber=Integer.parseInt(System.console().readLine());
            Socket socket=new Socket();
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(),PortNumber),1000);
            System.out.println("Informatsiq za port "+PortNumber+": ");
            System.out.println("IP address na servera: "+socket.getInetAddress());
            System.out.println("Local IP address: "+socket.getLocalAddress());
            System.out.println("Izpolzva se: "+socket.isConnected());
            System.out.println("Dostup: "+(socket.isBound()?"yes":"no"));
        }catch(IOException e){
            System.err.println("Greshka pri svurzvane kum porta: "+e.getMessage());
        }
    }
}
