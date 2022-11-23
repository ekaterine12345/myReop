package ServerSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();

        out = new PrintWriter(clientSocket.getOutputStream(), true); // სერვერი წერს ამ ნაკადში
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // სერვერი კითხულობოს ამ ნაკადიდან


        while(true){


        String message = in.readLine();

        if (message.equals("help")){
            WriteFile.writeInFile(message);
            WriteFile.writeInFile("create file dslfvjdsf");
            WriteFile.writeInFile("----");
            System.out.println("n1 "+message);
        }
        else
        if (message.equals("date")){
            WriteFile.writeInFile(message);
            WriteFile.writeInFile("f2398y329823");
            WriteFile.writeInFile("----");
            System.out.println("n2 "+message);
            }
        else
        if (message.equals("name")){
            WriteFile.writeInFile(message);
            WriteFile.writeInFile("lasha");
            WriteFile.writeInFile("----");
            System.out.println("n3 "+message);
        }
        else
        if (message.equals("error")){
            WriteFile.writeInFile(message);
            WriteFile.writeInFile("Compile Error");
            WriteFile.writeInFile("----");
            System.out.println("n4 "+message);
        }
        else {
            System.out.println("error...");
            System.out.println("n11111 "+message);
            close();
        }

            out.println("some text to write from Server to Client ... "+ message);
        }
    }

    public void creatFile(){

    }


    public void close() throws IOException {
        serverSocket.close();
        clientSocket.close();
        out.close();
        in.close();
    }

}
