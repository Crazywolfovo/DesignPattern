package com.designpattern.principle.compositionaggregation;


public class ProductDao {
    /**
     * 将DBConnection作为成员变量，通过setter注入的方式引用
     * 而不是继承 MySQLConnection 或 PostgreSQLConnection
     * 实现动态切换数据库链接实例的功能
     */
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
