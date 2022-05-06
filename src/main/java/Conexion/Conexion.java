package Conexion;
import java.sql.*;


public class ConnectionBD extends Login {
    private Statement stmt;
    private Connection con;
    private ResultSet rs;

    public ConnectionBD(String db, String owner, String pwd) {
        super(db, owner, pwd);
    }

    public Statement getStatement() {
        return this.stmt;
    }

    public Connection getConnection() {
        return this.con;
    }

    public ResultSet getResultSet() {
        return this.rs;
    }

    public void createStmt() {
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, "Error al crear el Statement.", e);
        }
    }

    public boolean executeQuery(String query) throws SQLException {
        this.setConnection();
        this.createStmt();
        try {
            this.getStatement().execute(query);
        } catch (SQLException ex) {
            this.getStatement().close();
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, "Error al realizar la inserción", ex);
            return false;
        } finally {
            this.disconnect();
        }
        return true;
    }

    public void closeStmt() {
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, "Error al cerrar el Statement.", ex);
        }
    }

    public void closeRs() {
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, "Error al cerrar el Statement.", ex);
        }
    }

    @Override
    public void setConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(super.getUrl(), super.getOwner(), super.getPassword());

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, "Error al conectarse.", ex);
        }
    }

    @Override
    public void disconnect() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, "Error al desconectarse.", ex);
        }
    }
}