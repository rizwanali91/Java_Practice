package com.riz.designpatterns;

public class SingletonPattern {

//	Use eager initialization when the object is light weight, this is thread safe since
//	the initialization is done while class loading
//	private static SingletonPattern singletonObject= new SingletonPattern();

	private static SingletonPattern singletonObject;

	private SingletonPattern() {
	}

//	Use synchronized for thread safety, but is costly
//	public static synchronized SingletonPattern getSingletonObject() {

	public static SingletonPattern getSingletonObject() {
		if (singletonObject == null)
			singletonObject = new SingletonPattern();
		return singletonObject;
	}

//	Double check thread safe, this makes sure that the synchronized block is called only once
//	public static SingletonPattern getSingletonObject() {
//		if(singletonObject == null) {
//			synchronized (singletonObject) {
//				singletonObject= new SingletonPattern();
//			}
//		}
//		return singletonObject;
//	}

}
