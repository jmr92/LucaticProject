package com.lucatic.dao;

import java.util.List;

public interface DAO <T> extends AutoCloseable{
	public void create(T t) throws DAOException;
	public T read(T t) throws DAOException;
	public List<T> readAll() throws DAOException;
	public void update(T t) throws DAOException;
	public void delete(T t) throws DAOException;

}
