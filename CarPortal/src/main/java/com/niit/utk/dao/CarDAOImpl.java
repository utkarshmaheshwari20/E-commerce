package com.niit.utk.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.utk.model.Car;

@Repository
@Transactional
public class CarDAOImpl implements CarDAO {

	@Autowired
	SessionFactory sessionFactory;

	public List<Car> getAllCars() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Car");
		List<Car> car = query.list();
		session.flush();
		session.close();
		return car;
	}

	public Car insertCar(Car car) {
		Session session = sessionFactory.openSession();
		session.save(car);
		session.flush();
		session.close();
		return car;
	}

	public Car getCarById(int id) {
		Session session = sessionFactory.openSession();
		Car car = (Car) session.get(Car.class, id);
		session.flush();
		session.close();
		return car;
	}

	public Car updateCar(Car car) {
		Session session = sessionFactory.openSession();
		session.update(car);
		session.flush();
		session.close();
		return car;

	}

	public void deleteCar(int id) {
		Session session = sessionFactory.openSession();
		Car car=(Car)session.get(Car.class, id);
		session.delete(car);
		session.flush();
		session.close();
	
	}
	

}
