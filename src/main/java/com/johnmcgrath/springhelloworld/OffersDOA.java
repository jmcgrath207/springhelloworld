package com.johnmcgrath.springhelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by john on 5/9/17.
 */

@Component("offersDoa")
public class OffersDOA {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public List<Offer> getOffers() {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", "Sue");


        return jdbc.query("select * from offers where name = :name", params, new RowMapper<Offer>() {

            public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setName(rs.getString("name"));
                offer.setText(rs.getString("text"));
                offer.setEmail(rs.getString("email"));

                return offer;
            }



        });
    }

    public boolean update(Offer offer) {
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(offer);

        return jdbc.update("update offers set name=:name,text=:text,email=:email where id=:id",param) == 1;



    }


    public boolean create(Offer offer) {
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(offer);

        return jdbc.update("INSERT INTO offers (name,text,email) VALUES (:name,:text,:email)",param) == 1;



    }

    public boolean delete (int id) {
        MapSqlParameterSource parms = new MapSqlParameterSource("id",id);

        return jdbc.update("delete from offers where id=:id",parms) == 1;

    }

    public int[] create(List<Offer> offers){
        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
        return jdbc.batchUpdate("INSERT INTO offers (id, name,text,email) VALUES (:name,:text,:email)",params);

    }


    public Offer getOffer(Integer id) {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", "2");


        return jdbc.queryForObject("select * from offers where id =:id", params, new RowMapper<Offer>() {

            public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setName(rs.getString("name"));
                offer.setText(rs.getString("text"));
                offer.setEmail(rs.getString("email"));

                return offer;
            }



        });
    }

    }

