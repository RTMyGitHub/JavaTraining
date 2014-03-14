package com.training.java.servlet.domain;


import java.util.List;

/**
 * This is a Data Access object Interface.
 * 
 * @author Satya
 * 
 */
public interface CarDAO {

	// Contract
	List<Car> getAllCars() throws DAOException;

	void addCar(Car car) throws DAOException;

	void updateCar(Car car) throws DAOException;

	void deleteCar(String vinNumber) throws DAOException;

	Car findByPrimaryKey(String vinNumber) throws DAOException;

}

