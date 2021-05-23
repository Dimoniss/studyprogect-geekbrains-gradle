package javaPart3.lesson2;

import java.sql.*;

public class Main {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("no driver!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        try(Connection postgresConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/history_of_orders", "postgres", "Progreess1122")) {

            Statement ordersStatement = postgresConnection.createStatement();
            PreparedStatement orderPreparedStatement = postgresConnection.prepareStatement("insert into orders(order_id, client_id, date, manager, car, tasks) values (?, ?, ?, ?, ?, ?)");

            ResultSet resultSet = ordersStatement.executeQuery("select * from orders");

            while (resultSet.next()) {
                //System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString("order_id") + " " +
                                    resultSet.getString( "client_id") + " " +
                                    resultSet.getString("date") + " " +
                                    resultSet.getString("manager") + " " +
                                    resultSet.getString("car") + " " +
                                    resultSet.getString("tasks"));
        }

            String order_id = "-MYoOobiqB7Kvlvxsz5Z";
            String client_id = "-MQMDByz3RPHJutx4u-U";
            String date = "21.04.21 14:27";
            String manger = "Hryn Dmytro";
            String[] car = {"Opel", "Dakota", "10000", "diesel", "manual", "123123", "test", "test", "test"};
            String[][] tasks = {{"Chassis", "# 5 Wheel aligner", "Big Ben", "20.04.21", "Tete", "nono"}, {"Electronics", "# 3 Cargo", "Daniels Dmytro", "21.04.21", "1234", "1253"}};


//            orderPreparedStatement.setString(1, order_id);
//            orderPreparedStatement.setString(2, client_id);
//            orderPreparedStatement.setString(3, date);
//            orderPreparedStatement.setString(4, manger);
//            orderPreparedStatement.setArray(5, postgresConnection.createArrayOf("text", car));
//            orderPreparedStatement.setArray(6, postgresConnection.createArrayOf("text", tasks));
//
//            orderPreparedStatement.executeQuery();


//            ordersStatement.executeUpdate("update orders set manager = \'NEW MANAGER\' where order_id = \'testdi\'");

        } catch (SQLException SQLEx) {
            System.out.println("SQL Exception");
            SQLEx.printStackTrace();
        }

    }
}
