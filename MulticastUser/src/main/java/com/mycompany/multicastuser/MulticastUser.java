/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multicastuser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author correia
 */
public class MulticastUser {
    private static final int PORT = 6789;
    private static final int BIT = 1024*5;
    
    private String user;
    private String multiCastAddress = "224.0.0.1";
    private String nomeDNS;
    private InetAddress ipGroup;
    private MulticastSocket s;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    public MulticastUser(String user) throws IOException, UnknownHostException, SocketException {
        this.user = user;
        ipGroup = InetAddress.getByName(this.multiCastAddress);
        nomeDNS = ipGroup.getHostName();
        s = new MulticastSocket(PORT);
        s.joinGroup(ipGroup);
    }

    public String getNomeDNS() {
        return nomeDNS;
    }
    
    public void enviarMensagem(String msg) throws UnknownHostException, IOException{
        ByteArrayOutputStream btStream = new ByteArrayOutputStream();
        output = new ObjectOutputStream(btStream);

        output.writeObject(msg);
        
        byte[] data = btStream.toByteArray();
        
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, this.ipGroup, PORT);
        
        s.send(datagramPacket);
        
        s.leaveGroup(ipGroup);
        if(s!=null){s.close();}
    }
    
    public String receberMensagem() throws ClassNotFoundException, IOException{
        byte[] buffer = new byte[BIT];
        String msg=null;
        
        s.receive(new DatagramPacket(buffer, BIT, ipGroup, PORT));
        
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(buffer);
        input = new ObjectInputStream(input);
        
        Object obj = input.readObject();
        
        if(obj instanceof String)
            msg = (String) obj;
        
        return msg;
    }
}
