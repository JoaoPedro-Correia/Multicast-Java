/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multicastserver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

  /**
 * @author correia
 */
public class MulticastServer {
    private static final int PORTA = 6789;
    private static final int BUFSIZE = 1024*4; 
    private static MulticastSocket s = null;
    private static String multiCastAddress = "224.0.0.1";
    
    public static void main(String[] args) {
        InetAddress group = null;
        // cria socket
        try{
            group = InetAddress.getByName(multiCastAddress);
            s = new MulticastSocket(PORTA);
            s.joinGroup(group);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            return;
        }
                
        while(true){
            System.out.println("Esperando um datagram ser recebido...");
            // cria conexão
            try{
                byte[] buffer = new byte[BUFSIZE];
                s.receive(new DatagramPacket(buffer, BUFSIZE, group, PORTA));
                System.out.println("Datagram recebido!!!!!!!");
                
                ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(buffer);
                ObjectInputStream inputStream =  new ObjectInputStream(arrayInputStream);
                
                //Objeto recebido
                Object o = inputStream.readObject();
                
                //Verificacao do objeto recebido
                if(o instanceof String){
                    String msg = (String)o;
                    System.out.println("Objeto recebido com sucesso! - "+ msg);
                }else{
                    System.out.println("Objeto não recebido");
                }
                
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
    }
}
