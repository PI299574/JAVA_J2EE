package Collection;


import java.sql.*;
/**
 * @desc A singleton database access class for MySQL

 */
final class DbConnectionUsuingSingleton {
	
	
    public Connection conn;
    private Statement statement;
    
  //Step 1  
    // create a JDBCSingleton class.  
   //static member holds only one instance of the JDBCSingleton class.
    public static DbConnectionUsuingSingleton db;
    
    
  //prevents the instantiation from any other class. 
    private DbConnectionUsuingSingleton() {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            this.conn = (Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","password");
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
    /**
     *
     * @return MysqlConnect Database connection object
     *     //Now we are providing gloabal point of access. 
     */
    public static synchronized DbConnectionUsuingSingleton getDbCon() {
        if ( db == null ) {
            db = new DbConnectionUsuingSingleton();
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
        
        ResultSet res = statement.executeQuery("select * from login");
        while(res.next())  
        System.out.println(res.getString(1)+"  "+res.getInt(2)+"  ");  
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

public class DbDbConnectionUsuingSingleton{
	
	public static void main(String []args) throws SQLException{
		DbConnectionUsuingSingleton dbcon= DbConnectionUsuingSingleton.getDbCon();
		dbcon.query("1");
	}
	
}
