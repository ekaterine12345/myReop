package ClientSocket;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyClient myClient = new MyClient();
        myClient.startConnection("192.168.1.6",8081);
      //  System.out.println(myClient.sendMessage("hello server"));

        System.out.println(myClient.sendMessage("help"));
        System.out.println(myClient.sendMessage("date"));
        System.out.println(myClient.sendMessage("name"));
        System.out.println(myClient.sendMessage("error"));
        myClient.sendMessage("end");
    }
}