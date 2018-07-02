package z07;

public class DBService {

    private DBConnector dbConnector;

    public DBService(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public int countWord(String tableName, int RowId, String columnName, String word) {
        String val = dbConnector.getContent(tableName, RowId, columnName);
        String[] words = val.split(" ");

        int counter = 0;

        for (String el : words) {
            if (el.equals(word)) {
                counter++;
            }
        }
        return counter;
    }
}
