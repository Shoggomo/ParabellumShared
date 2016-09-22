package Net;

/**
 * Created by Shoggomo on 20.09.2016.
 */
public class NetConstants {
    public static int NET_PORT = 2345;
    public static String NET_ADDRESS = "127.0.0.1";  //TODO
    public static Class[] REGISTERED_CLASSES = new Class[]{
            NetGameListPacketRequest.class,
            NetGameListPacketResponse.class,
            NetEnterGameRequest.class,
            NetEnterGameResponse.class,
            NetNewGameRequest.class,
            NetNewGameResponse.class,
            NetStartGameRequest.class,
            NetStartGameResponse.class,
            NetReadyToStartRequest.class,
            NetReadyToStartResponse.class
    };
}
