/*******************************************************************************
 * Copyright 2009, 2010 Innovation Gate GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package de.innovationgate.wga.common.beans.csconfig.v3;

import java.util.HashMap;
import java.util.Map;

import de.innovationgate.wga.common.DesignDirectory;

public class CSConfig extends de.innovationgate.wga.common.beans.csconfig.v2.CSConfig {
    
    private String disconnectionScript = null;
    
    private boolean staticClasspath = false;
    
    public String getDisconnectionScript() {
        return disconnectionScript;
    }
    public void setDisconnectionScript(String disconnectionScript) {
        this.disconnectionScript = disconnectionScript;
    }
    public boolean isStaticClasspath() {
        return staticClasspath;
    }
    public void setStaticClasspath(boolean staticClasspath) {
        this.staticClasspath = staticClasspath;
    }
    
    @Override
    public String getDesignDefinitionFileName() {
        return DesignDirectory.DESIGN_DEFINITION_FILE;
    }
    
    
}
