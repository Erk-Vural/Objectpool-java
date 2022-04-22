import java.sql.Connection;

public class Main {
    public static void main(String[] args)
    {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.postgresql.Driver", "jdbc:postgresql://localhost:5432/rentacardb",
                "postgres", "admin");

        // Get a connection:
        Connection con = pool.takeOut();
        // Return the connection:
        pool.takeIn(con);
    }
}