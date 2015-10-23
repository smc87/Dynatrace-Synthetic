package com.dynatrace.synthetic.cache;

import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

import com.dynatrace.synthetic.monitor;
import com.dynatrace.synthetic.common.Vars;

public class Cache {
	private static final Logger log = Logger.getLogger(monitor.class.getName());
	
    private String name;
    private String id;
    private long lastRunTime;
    
    private String cacheFileName;

    public Cache(String monitorId) {
    	this.id = monitorId;
        this.cacheFileName = monitorId + ".properties";
    }

    public void loadCacheData(){
    	checkForCacheDir();
        Properties prop = new Properties();
        InputStream input = null;
        try{

            input = new FileInputStream("cache" + File.separator + this.cacheFileName);

            // load a properties file
            prop.load(input);

            this.name = prop.getProperty("name");
            this.id = prop.getProperty("id");
            this.lastRunTime = Long.valueOf(prop.getProperty("lastRunTime"));

        } catch (IOException io){
            io.printStackTrace();
        } finally {
            if (input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public long getLastRunTime() {
		return this.lastRunTime;
	}

	public void saveCacheData(String scriptName, long lastRunTime){
		checkForCacheDir();
        Properties prop = new Properties();
        OutputStream output = null;
        try{

            output = new FileOutputStream("cache" + File.separator + this.cacheFileName);

            prop.setProperty("name", scriptName);
            prop.setProperty("id", this.id);
            prop.setProperty("lastRunTime", String.valueOf(lastRunTime));

            prop.store(output,null);
        } catch (IOException io){
            io.printStackTrace();
        } finally {
            if (output != null){
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
	private void checkForCacheDir(){
		File cacheDir = new File("cache");
		
		if (!cacheDir.exists()){
			log.info("Creating cache directory");
			try {
				cacheDir.mkdir();
			} catch (SecurityException se){
				log.warning("We don't have the proper permissions to create this directory");
			}
		}
	}
    
    public boolean doesCacheExist(){
    	boolean exist = false;
    	File f = new File("cache" + File.separator + this.cacheFileName);
    	if(f.exists() && !f.isDirectory()){
    		exist = true;
    	}
    	
    	return exist;
    }

    public void deleteStaleCache(int days){
        log.fine("Removing cache files older than " + days + " days");
        File directory = new File("cache");
        if(directory.exists()){
            File[] listFiles = directory.listFiles();
            long purgeTime = System.currentTimeMillis() - (days * 24 * 60 * 60 * 1000);
            for(File listFile : listFiles) {
                if(listFile.lastModified() < purgeTime) {
                    if(!listFile.delete()) {
                        log.warning("Unable to delete file: " + listFile);
                    } else {
                    	log.fine("Deleting file: " + listFile);
                    }
                }
            }
        } else {
        	log.fine(directory.getPath());
        }
    }

    public void deleteStaleCache(){
        deleteStaleCache(Vars.DEFAULT_STALE_TIME);
    }
    
}
