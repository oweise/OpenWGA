/*******************************************************************************
 * Copyright 2009, 2010 Innovation Gate GmbH. All Rights Reserved.
 * 
 * This file is part of the OpenWGA server platform.
 * 
 * OpenWGA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * In addition, a special exception is granted by the copyright holders
 * of OpenWGA called "OpenWGA plugin exception". You should have received
 * a copy of this exception along with OpenWGA in file COPYING.
 * If not, see <http://www.openwga.com/gpl-plugin-exception>.
 * 
 * OpenWGA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with OpenWGA in file COPYING.
 * If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package de.innovationgate.wgpublisher.files.derivates;

import java.util.ArrayList;
import java.util.List;

import de.innovationgate.webgate.api.WGFileAnnotator;

public class DerivateInfo {
    
    private String _name;
    private String _usage;
    private List<WGFileAnnotator> _additionalAnnotators = new ArrayList<WGFileAnnotator>();
    
    public DerivateInfo(String name, String usage) {
        super();
        _name = name;
        _usage = usage;
    }
    
    public void addFileAnnotator(WGFileAnnotator annotator) {
        _additionalAnnotators.add(annotator);
    }

    public String getName() {
        return _name;
    }

    public String getUsage() {
        return _usage;
    }

    public List<WGFileAnnotator> getAdditionalAnnotators() {
        return _additionalAnnotators;
    }
    
    

}
