package Net;

/**
 * Created by Shoggomo on 22.09.2016.
 */
public class NetEnterGameRequest {
    int gameID;

    public NetEnterGameRequest(int gameID) {
        this.gameID = gameID;
    }

    public int getGameID() {
        return gameID;
    }
}
