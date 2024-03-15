package opg1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool
{
    private final List<ServerConnection> connections;

    public ConnectionPool()
    {
        this.connections = new ArrayList<>();
    }

    public void add(ServerConnection serverConnection)
    {
        connections.add(serverConnection);
    }

    public void broadcast(String message, ServerConnection serverConnection) throws IOException
    {
        for (ServerConnection connection : connections)
        {
            if (connection != serverConnection)
            {
                connection.send(message);
            }
        }
    }
}