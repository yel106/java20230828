package ch11exception.lecture;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C22throws {
    public static void main(String[] args) throws Exception { //FileNotFound, SQL 도 다 Exception이니까 Exception만 써도 됨

        Connection con = DriverManager.getConnection("", "", "");
        var input = new FileInputStream("");
        Class.forName("");

    }
}
