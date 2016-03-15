package businessdomain;

import java.sql.SQLException;

public class ModelFacade {
    private final DBConnector con = DBConnector.getConnection();
    
    public ModelFacade () {

    }
    
    public void post(String msg) throws SQLException {
        con.insert(msg);
    }

}
