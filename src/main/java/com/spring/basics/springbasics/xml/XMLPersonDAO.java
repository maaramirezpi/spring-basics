package com.spring.basics.springbasics.xml;

import org.springframework.stereotype.Repository;

@Repository
public class XMLPersonDAO {

    XMLJdbcConnection xmlJdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = jdbcConnection;
    }
}
