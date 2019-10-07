package com.deathvalley.first.model;

import java.sql.SQLException;
import java.util.*;

public class Service {
    private DAO dao = null;

    public String getRichestUser() throws SQLException, ClassNotFoundException {
        if (this.dao == null) {
            this.dao = new DAO();
        }

        List<Account> accounts = this.dao.getAllAccount();
        Map<Integer, Integer> arr = new HashMap<Integer, Integer>();

        for (Account account: accounts) {
           if (arr.containsKey(account.getUserId())) {
               arr.put(account.getUserId(), arr.get(account.getUserId()) + 1);
           } else {
               arr.put(account.getUserId(), 1);
           }
        }

        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : arr.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());

            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }

        User user = this.dao.getUser(maxEntry.getKey());

        return user.getName() + " " + user.getSurName();
    }

    public int getCount() throws SQLException, ClassNotFoundException {
        if (this.dao == null) {
            this.dao = new DAO();
        }

        List<Account> accounts = this.dao.getAllAccount();

        return accounts.size();

    }
}
