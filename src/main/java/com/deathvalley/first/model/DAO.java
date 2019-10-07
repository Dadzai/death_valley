package com.deathvalley.first.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private final String DB = "jdbc:mysql://localhost:3306/java";
    private final String USER = "root";
    private final String PASS  = "26902123q";

    private Connection connection;

    public DAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(DB, USER, PASS);
    }

    public User getUser(int id) throws SQLException {
        ResultSet acc = this.executeQuery("select * from account where user_id = " + id);
        List<Account> accounts = new ArrayList<Account>();

        while (acc.next()) {
            Account account = new Account();
            account.setAccontId(acc.getInt("account_id"));
            account.setAccontId(acc.getInt("account"));
            account.setAccontId(acc.getInt("user_id"));
            accounts.add(account);
        }

        ResultSet res = this.executeQuery("select * from users where user_id = " + id);
        res.next();
        return new User(
            res.getInt("user_id"),
            res.getString("frst_name"),
            res.getString("sur_name"),
            accounts
        );
    }

    public List<Account> getAllAccount() throws SQLException {
        ResultSet accData = this.executeQuery("select * from account");
        List<Account> accounts = new ArrayList<Account>();

        while (accData.next()) {
            Account account = new Account();
            account.setAccontId(accData.getInt("account_id"));
            account.setAccount(accData.getInt("account"));
            account.setUserId(accData.getInt("user_id"));
            accounts.add(account);
        }

        return accounts;
    }

    private ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = this.connection.createStatement();
        return stmt.executeQuery(query);
    }
}
