package ru.bogdanium.hitting_database.kevin.data.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import ru.bogdanium.hitting_database.kevin.data.entities.RentalLocation;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

@Repository
public class RentalLocationRepositoryImpl implements RentalLocationRepository {

    private JdbcTemplate template;

    public static final String LOCATION_COLUMNS = "rental_location_id, name, address1, address2, city, state, postal_code";
    public static final String MEDIA_COLUMNS = "media_id, title, format, length, rating, is_available";

    private static final String FIND_NAME_BY_ID = "SELECT name FROM rental_location WHERE rental_location_id = ?";

    public static final String FIND_BY_ID = "SELECT " + LOCATION_COLUMNS + " FROM rental_location WHERE rental_location_id = ?";
    public static final String FIND_BY_STATE = "" +
            " SELECT " + LOCATION_COLUMNS + ", " + MEDIA_COLUMNS +
            " FROM rental_location rl JOIN media m" +
            " ON rl.rental_location_id = m.rental_location_id" +
            " WHERE state = ?";

    public static final String INSERT_RENTAL_LOCATION = "" +
            " INSERT INTO rental_location (" + LOCATION_COLUMNS + ")" +
            " VALUES (NULL, ?, ?, ?, ?, ?, ?)";

    public static final String UPDATE_RENTAL_LOCATION = "" +
            " UPDATE rental_location" +
            " SET name = ?, address1 = ?, address2 = ?, city = ?, state = ?, postal_code = ?" +
            " WHERE rental_location_id = ?";

    public static final String DELETE_RENTAL_LOCATION = "" +
            " DELETE FROM rental_location" +
            " WHERE rental_location_id = ?";

    @Autowired
    public RentalLocationRepositoryImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private static class RentalLocationRowMapper implements RowMapper<RentalLocation> {

        @Override
        public RentalLocation mapRow(ResultSet rs, int i) throws SQLException {

            RentalLocation location = new RentalLocation();
            location.setRentalLocationId(rs.getInt("rental_location_id"));
            location.setName(rs.getString("name"));
            location.setAddress1(rs.getString("address1"));
            location.setAddress2(rs.getString("address2"));
            location.setCity(rs.getString("city"));
            location.setState(rs.getString("state"));
            location.setPostalCode(rs.getString("postal_code"));

            return location;
        }
    }


    @Override
    public void insert(RentalLocation entity) {
//        this.template.update(INSERT_RENTAL_LOCATION,
//                entity.getName(),
//                entity.getAddress1(),
//                entity.getAddress2(),
//                entity.getCity(),
//                entity.getState(),
//                entity.getPostalCode());

        KeyHolder keyHolder = new GeneratedKeyHolder();

        this.template.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement statement = connection.prepareStatement(INSERT_RENTAL_LOCATION, Statement.RETURN_GENERATED_KEYS);

                statement.setString(1, entity.getName());
                statement.setString(2, entity.getAddress1());
                statement.setString(3, entity.getAddress2());
                statement.setString(4, entity.getCity());
                statement.setString(5, entity.getState());
                statement.setString(6, entity.getPostalCode());

                return statement;
            }
        }, keyHolder);
        entity.setRentalLocationId(keyHolder.getKey().intValue());
    }

    @Override
    public void update(RentalLocation entity) {
        template.update(UPDATE_RENTAL_LOCATION,
                entity.getName(),
                entity.getAddress1(),
                entity.getAddress2(),
                entity.getCity(),
                entity.getState(),
                entity.getPostalCode(),
                entity.getRentalLocationId());
    }

    @Override
    public void delete(RentalLocation entity) {
        template.update(DELETE_RENTAL_LOCATION, entity.getRentalLocationId());
    }

    @Override
    public RentalLocation findById(Integer id) {
        return template.queryForObject(FIND_BY_ID, new Object[]{id}, new RentalLocationRowMapper());
    }

    @Override
    public String findNameById(Integer id) {

        return template.queryForObject(FIND_NAME_BY_ID, new Object[]{id}, String.class);
    }

//    @Override
//    public List<RentalLocation> findLocationsByState(String state) {
//        return template.query(FIND_BY_STATE, new Object[] {state}, new RentalLocationRowMapper());
//    }

    @Override
    public List<RentalLocation> findLocationsByState(String state) {
        return template.query(FIND_BY_STATE, new Object[]{state}, new RentalLocationResultExtractor());
    }
}
