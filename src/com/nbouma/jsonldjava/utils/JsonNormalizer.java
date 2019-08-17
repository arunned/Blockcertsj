package com.nbouma.jsonldjava.utils;



import com.nbouma.jsonldjava.core.JsonLdError;
import com.nbouma.jsonldjava.core.JsonLdOptions;
import com.nbouma.jsonldjava.core.JsonLdProcessor;

/**
 * Created by noah on 14/05/17.
 */

public class JsonNormalizer  {

    private static JsonLdOptions options;
    private static Object normalizedObject;

    
    public static Object Normalize(Object initialObject)
    {
    	options = new JsonLdOptions();
        options.format = "application/nquads";
        options.setAlgorithm(JsonLdOptions.URDNA2015);
        
        try {
			normalizedObject = JsonLdProcessor.normalize(initialObject, options);
			
			return normalizedObject;
		} catch (JsonLdError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	
    	return null;
    }

    
}