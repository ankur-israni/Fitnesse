//package com.ankur.junit.fitnesse.delete;
//package com.ankur.junit.fitnesse;
//
//import java.util.Properties;
//
//import org.apache.velocity.app.VelocityEngine;
//
//import fitnesse.ContextConfigurator;
//import fitnesse.FitNesse;
//import fitnesse.FitNesseContext;
//import fitnesse.FitNesseVersion;
//import fitnesse.authentication.Authenticator;
//import fitnesse.components.ComponentFactory;
//import fitnesse.components.Logger;
//import fitnesse.responders.ResponderFactory;
//import fitnesse.testsystems.TestSystemFactory;
//import fitnesse.testsystems.TestSystemListener;
//import fitnesse.wiki.RecentChanges;
//import fitnesse.wiki.WikiPageFactory;
//import fitnesse.wiki.fs.FileSystemPageFactory;
//import fitnesse.wiki.fs.VersionsController;
// 
//public class FitnesseStarter {
// 
//    public static void main(String args[]) throws Exception {
//        FitnesseStarter runFitnesse = new FitnesseStarter();
//        runFitnesse.start();
//    }
// 
//    public void start() throws Exception {
//        FitNesseContext context = loadContext();
//        FitNesse fitnesse = new FitNesse(context);
//      //  fitnesse.applyUpdates();
//        boolean started = fitnesse.start();
//        if (started)
//            System.out.println(context);
//    }
//     
//    public FitNesseContext loadContext() throws Exception {
//    	//----------------------------
//    	 Properties properties=new Properties();
//    	FitNesseContext context = new ContextConfigurator(properties).makeFitNesseContext();
//        
//    	List<WikiPage> pagesToExecute = new SuiteContentsFinder(suiteRoot, null /* optional fitnesse.testrunner.SuiteFilter */, context.root).getAllPagesToRunForThisSuite();
//    	
//    	//------------------------
//    	FitNesseVersion fitnesseVersion=new FitNesseVersion();
//        WikiPageFactory wikiPageFactory = new FileSystemPageFactory();
//        String rootPath="./src/";
//        String rootDirectoryName="FitnesseProject";
//       
//        String contextRoot="./src/";
//        VersionsController versionsController;
//        RecentChanges recentChanges;
//        int port=5080;
//        Authenticator authenticator;
//        Logger logger;
//        TestSystemFactory testSystemFactory;
//        TestSystemListener testSystemListener;
//       
//    	FitNesseContext context = new FitNesseContext(fitnesseVersion,wikiPageFactory,rootPath,rootDirectoryName,contextRoot,
//    			versionsController,recentChanges,port,authenticator,logger,testSystemFactory,testSystemListener,properties);
////    	 context.port = 5080;
////         context.rootPath = "./src/";
//        
//       
//        context.rootPagePath = context.rootPath + "/" + context.rootDirectoryName;
//        ComponentFactory componentFactory = new ComponentFactory(context.rootPath);
//        
//        context.root = wikiPageFactory.makeRootPage(context.rootPath, context.rootDirectoryName, componentFactory);
// 
//        context.responderFactory = new ResponderFactory(context.rootPagePath);
//        VelocityFactory.makeVelocityFactory(context);
//        VelocityEngine engine = new VelocityEngine();
//        engine.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, "FitNesseRoot/files/templates");
//        VelocityFactory.setVelocityEngine(engine);
//        System.setProperty("eclipsepath", System.getProperty("java.class.path"));
//        return context;
//    }
//}