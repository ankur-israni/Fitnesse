//package com.ankur.junit.fitnesse.delete;
//
//import fitnesse.FitNesse;
//import fitnesse.FitNesseContext;
//
//public class Test {
//
//	public static void main(String args[]) throws Exception {
//		Test runFitnesse = new Test();
//		runFitnesse.start();
//	}
//
//	public void start() throws Exception {
//		FitNesseContext context = loadContext();
//		FitNesse fitnesse = new FitNesse(context);
//		boolean started = fitnesse.start();
//		if (started) {
//			System.out.println(context);
//		}
//	}
//
//	public FitNesseContext loadContext() {
//		FitNesseContext context = new FitNesseContext(null, null, null, null,
//				null, null, null, 0, null, null, null, null, null);
//		return context;
//	}
//
//}
