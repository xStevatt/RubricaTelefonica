/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

/**
 *
 * @author Stefano
 */
public class connectionMaker extends Thread
{      
    @Override
    public void run() 
    {   
        try
        {
            while(UDPClient.clientSocket == null || UDPClient.address == null)
            {
                UDPClient.clientSocket = new DatagramSocket();
                UDPClient.address = InetAddress.getByName("localhost");
                System.out.println("Tentativo di connessione fallito... sleeping for 2 seconds");
                this.sleep(2000);
            }    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
