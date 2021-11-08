package com.ankur.junit.fitnesse.delete;

import fitnesse.responders.run.TestResponder;
import fitnesse.wiki.PageData;

public class DebugTestResponder extends TestResponder {
	 
    private static final int DEBUG_PORT = 1044;
 
   // @Override
    protected String buildCommand(PageData data, String program,
            String classPath) throws Exception {
        String parentClassPath = System.getProperty("java.class.path");
        String pathSeparator = System.getProperty("path.separator");
        String[] classPathElements = parentClassPath.split(pathSeparator);
        for (String element : classPathElements) {
            classPath += pathSeparator + "\"" + element + "\"";
        }
        String debugOptions = "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address="
                + DEBUG_PORT;
        return "java " + debugOptions + " " + "-cp " + classPath + " "
                + program;
    }
}
