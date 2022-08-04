package com.example.demo.services;

import java.util.List;
import java.util.Optional;

public class IService<T> {

	List<T> findAll();

	T saveOrUpdate(T o);

	Optional<T> findById(int id);

	void deleteById(int id);

}
