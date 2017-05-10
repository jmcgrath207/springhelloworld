package com.johnmcgrath.springhelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by john on 5/9/17.
 */

@Component("offersDoa")
public class OffersDOA {

    private JdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new JdbcTemplate(jdbc);
    }

    public List<Offer> getOffers() {

        return jdbc.query("select * from offers", new RowMapper<Offer>() {

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

