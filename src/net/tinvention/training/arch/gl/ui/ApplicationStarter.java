package net.tinvention.training.arch.gl.ui;

import net.tinvention.training.arch.gl.conf.LayerConfigurer;

/**
 * 
 * Entry point to startup the application
 * 
 * @author Stefano
 *
 */
public class ApplicationStarter {

	public static void main(String[] args) {
		//Alternate ways
		// Using layerConfgurer , for a IoC approach
		LayerConfigurer.getApplicaitonConfigured().start();
		
		// Or without LayerConfigurer using only Dependency Injection
		ApplicationUI app = new ApplicationUI();
		app.start(); //TODO need to be implemented... 

	}

}
