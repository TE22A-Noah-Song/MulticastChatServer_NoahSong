import java.net.*;

public class MulticastChatServer_NoahSong{

    public static void main(String args[])
            throws Exception {

        // Default port number we are going to use
        int portnumber = 5000;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }

        // Create a MulticastSocket
        MulticastSocket serverMulticastSocket =
                new MulticastSocket(portnumber);
        System.out.println("MulticastSocket is created at port " + portnumber);


    }
}
