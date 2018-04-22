package com.yaoyao.common.service;

public interface Function<T,E> {
	public T callback(E e);
}
