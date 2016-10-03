package de.innovationgate.wga.additional_script_langs.jsmin;

import de.innovationgate.wga.server.api.WGA;
import de.innovationgate.wgpublisher.design.conversion.DesignResourceConversion;
import de.innovationgate.wgpublisher.design.conversion.PreProcessData;
import de.innovationgate.wgpublisher.design.conversion.PreProcessResult;

public class JSMinConversion implements DesignResourceConversion{
	
	@Override
	public PreProcessResult preProcess(WGA wga, PreProcessData data, String code){

		// Do nothing. Convertion is done in post-processing.
		
        PreProcessResult result = new PreProcessResult();
        result.setCode(code);
        result.setPostProcessor(JSMinPostProcessor.class);
        return result;
	}
	
}
