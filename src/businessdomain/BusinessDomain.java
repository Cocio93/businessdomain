/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessdomain;

import java.sql.SQLException;

/**
 *
 * @author Jonathan Henriksen
 */
public class BusinessDomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ModelFacade facade = new ModelFacade();
        facade.post("INSERT INTO CityInfo (zipCode,city) VALUES('4160', 'Herlufmagle');");
    }
   
//CREATE TABLE IF NOT EXISTS Persons
//(
//id int NOT NULL,
//LastName varchar(255) NOT NULL,
//FirstName varchar(255) NOT NULL,
//PRIMARY KEY (id)
//);
//
//CREATE TABLE IF NOT EXISTS Hobbys
//(
//id int NOT NULL,
//name varchar(255) NOT NULL,
//description varchar(255),
//person_id int NOT NULL,
//PRIMARY KEY (id),
//FOREIGN KEY (person_id) REFERENCES Persons(id)
//);
//
//CREATE TABLE IF NOT EXISTS Company
//(
//id int NOT NULL;
//name varchar(255) NOT NULL,
//description varchar(255),
//cvr varchar(255),
//numEmpl int,
//marketValue int,
//PRIMARY KEY (id)
//);
//
//CREATE TABLE IF NOT EXISTS Information
//(
//id int,
//LastName varchar(255),
//FirstName varchar(255),
//);


}
