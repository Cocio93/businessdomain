package businessdomain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DBConnector {
    private Connection conn;
    private Statement statement;
    public static DBConnector db;
    
    public DBConnector() {
        String url= "jdbc:mysql://31.220.17.165/:3306/";
        String dbName = "johnjohn_business";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "johnjohn_admin";
        String password = "klippe";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized DBConnector getConnection() {
        if ( db == null ) {
            db = new DBConnector();
        }
        return db;
 
    }
    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }
 
}