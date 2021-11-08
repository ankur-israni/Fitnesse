package com.ankur.junit.fitnesse.delete;
//package com.ankur.junit.fitnesse;
//
//import fitnesse.FitNesse;
//import fitnesse.FitNesseContext;
//import fitnesse.authentication.PromiscuousAuthenticator;
//import fitnesse.components.ComponentFactory;
//import fitnesse.responders.ResponderFactory;
//import fitnesse.wiki.fs.FileSystemPage;
//
//public class RunFitnesse {
//	 
//    public static void main(String args[]) throws Exception {
//        RunFitnesse runFitnesse = new RunFitnesse();
//        runFitnesse.start();
//    }
// 
//    public void start() throws Exception {
//        FitNesseContext context = loadContext();
//        FitNesse fitnesse = new FitNesse(context);
//        
//        fitnesse.applyUpdates();
//        boolean started = fitnesse.start();
//        if(started)
//           printStartMessage(context);
//    }
// 
//    protected FitNesseContext loadContext() throws Exception {
//        FitNesseContext context = new FitNesseContext();
//        ComponentFactory componentFactory =
//            new ComponentFactory(context.rootPath);
//        context.port = 80;
//        context.rootPath = "./src/main/fitnesse";
//        context.rootPageName = "FitNesseRoot";;
//        context.rootPagePath = context.rootPath + "/" + context.rootPageName;
//        context.root = componentFactory.getRootPage(
//              FileSystemPage.makeRoot(context.rootPath, context.rootPageName));
//        context.responderFactory = new ResponderFactory(context.rootPagePath);
//        context.logger = null;
//        context.authenticator = 
//            componentFactory.getAuthenticator(new PromiscuousAuthenticator());
//        context.htmlPageFactory =
//            componentFactory.getHtmlPageFactory(new HtmlPageFactory());
// 
//        context.responderFactory.addResponder("test", 
//            InheritClasspathTestResponder.class);
// 
// 
//        String extraOutput = 
//            componentFactory.loadResponderPlugins(context.responderFactory);
//        extraOutput += componentFactory.loadWikiWidgetPlugins();
//        extraOutput += componentFactory.loadContentFilter();
//        return context;
//    }
//}
//
