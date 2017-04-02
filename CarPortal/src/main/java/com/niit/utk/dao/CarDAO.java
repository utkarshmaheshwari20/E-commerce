package com.niit.utk.dao;

import java.util.List;

import com.niit.utk.model.Car;

public interface CarDAO {

	public List<Car> getAllCars(); // retrieving all the cars from the database

	public Car insertCar(Car car); // inserting a new car

	public Car getCarById(int id); // fetching a single car

	public Car updateCar(Car car); // updating a car info

	public void deleteCar(int id); // deleting a car by its id

}
