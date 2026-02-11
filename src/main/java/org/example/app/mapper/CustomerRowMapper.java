package org.example.app.mapper;

// https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html
import org.example.app.entity.customer.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

// Mapper властивостей Java-об'єкта (entity)
// із стовчиками таблиці у БД
public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setId(rs.getLong("id"));
        customer.setFirstName(rs.getString("first_name"));
        customer.setPhone(rs.getString("phone"));
        customer.setAddress(rs.getString("address"));
        return customer;
    }
}
