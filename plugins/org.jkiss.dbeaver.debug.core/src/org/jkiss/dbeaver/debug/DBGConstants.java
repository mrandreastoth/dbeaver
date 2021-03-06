/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2018 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.debug;

import org.jkiss.dbeaver.runtime.ide.core.DBeaverIDECore;

public class DBGConstants {

    public static final String BUNDLE_SYMBOLIC_NAME = "org.jkiss.dbeaver.debug.core"; //$NON-NLS-1$
    public static final String ATTR_NODE_PATH = BUNDLE_SYMBOLIC_NAME + ".ATTR_NODE_PATH"; //$NON-NLS-1$
    public static final String ATTR_SCRIPT_TEXT = BUNDLE_SYMBOLIC_NAME + ".ATTR_SCRIPT_TEXT"; //$NON-NLS-1$
    public static final String ATTR_SCRIPT_EXECUTE = BUNDLE_SYMBOLIC_NAME + ".ATTR_SCRIPT_EXECUTE"; //$NON-NLS-1$
    public static final String ATTR_ATTACH_KIND = BUNDLE_SYMBOLIC_NAME + ".ATTR_ATTACH_KIND"; //$NON-NLS-1$
    public static final String ATTR_ATTACH_PROCESS = BUNDLE_SYMBOLIC_NAME + ".ATTACH_PROCESS"; //$NON-NLS-1$
    public static final String ATTR_PROCEDURE_NAME = BUNDLE_SYMBOLIC_NAME + ".ATTR_PROCEDURE_NAME"; //$NON-NLS-1$
    public static final String ATTR_PROCEDURE_OID = BUNDLE_SYMBOLIC_NAME + ".ATTR_PROCEDURE_OID"; //$NON-NLS-1$
    public static final String ATTR_DATASOURCE_ID = BUNDLE_SYMBOLIC_NAME + ".ATTR_DATASOURCE_ID"; //$NON-NLS-1$
    public static final String SOURCE_CONTAINER_TYPE_DATASOURCE = BUNDLE_SYMBOLIC_NAME + ".datasourceSourceContainerType"; //$NON-NLS-1$
    public static final String BREAKPOINT_ATTRIBUTE_PROCEDURE_OID = BUNDLE_SYMBOLIC_NAME + ".procedureOid"; //$NON-NLS-1$
    public static final String BREAKPOINT_ATTRIBUTE_PROCEDURE_NAME = BUNDLE_SYMBOLIC_NAME + ".procedureName"; //$NON-NLS-1$
    public static final String BREAKPOINT_ATTRIBUTE_SCHEMA_NAME = BUNDLE_SYMBOLIC_NAME + ".schemaName"; //$NON-NLS-1$
    public static final String BREAKPOINT_ATTRIBUTE_DATABASE_NAME = BUNDLE_SYMBOLIC_NAME + ".databaseName"; //$NON-NLS-1$
    public static final String BREAKPOINT_ID_DATABASE_LINE = BUNDLE_SYMBOLIC_NAME + ".databaseLineBreakpointMarker"; //$NON-NLS-1$
    public static final String MODEL_IDENTIFIER_DATABASE = BUNDLE_SYMBOLIC_NAME + ".database"; //$NON-NLS-1$
    public static final String BREAKPOINT_ATTRIBUTE_DATASOURCE_ID = DBeaverIDECore.MARKER_ATTRIBUTE_DATASOURCE_ID;
    public static final String BREAKPOINT_ATTRIBUTE_NODE_PATH = DBeaverIDECore.MARKER_ATTRIBUTE_NODE_PATH;

}
