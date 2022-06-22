package org.itstep.Runner;

import org.itstep.Model.Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentQuery {
    public static void main(String[] args) {
        createComment();
        deleteComment();
        readComment();
    }

    public static void readComment() {
        List<Comment> comments = new ArrayList<>();
        Comment comment = null;
        Connection connection = Connector.connect();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from comment limit 10;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comment = new Comment(rs.getString(2), rs.getInt(3));
                comments.add(comment);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        comments.stream().forEach(c -> System.out.println(c.getComment()));
    }

    public static void createComment() {
        Connection connection = Connector.connect();
        try {
            PreparedStatement ps = connection.prepareStatement("insert into comment (comment, user_id)" +
                    "values ('TestmeGOOTest', 10)");
            ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void deleteComment() {
        Connection connection = Connector.connect();
        try {
            PreparedStatement ps = connection.prepareStatement("delete from comment where user_id = 10;");
            ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
