package th.ku.bookstore;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import th.ku.bookstore.Book;


public class BookRowMapper implements RowMapper<Book> {
    public Book mapRow(ResultSet rs, int rowNum)
            throws SQLException {
        Book book = new Book(rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price"));
        return book;
    }
}
