/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multicastserver;

import java.net.Socket;

/**
 *
 * @author correia
 */
public class DataBase extends Thread{
    private Socket socket;
    
    public DataBase(Socket socket) {
        this.socket = socket;
    }
}
