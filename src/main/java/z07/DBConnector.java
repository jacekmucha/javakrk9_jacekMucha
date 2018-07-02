package z07;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnector {

    private String path;
    private final static Logger logger = Logger.getLogger(DBConnector.class.getName());

    public DBConnector(String path) {
        this.path = path;
    }

    String getContent(String tableName, int RowId,  String columnName) {
        logger.log(Level.INFO, "Reading data from table" + tableName);
        return "this is the content aaa aaa bbb test wwww 123 hhh";
    }

}
