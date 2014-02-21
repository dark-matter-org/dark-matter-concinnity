//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.concinnity.server.generated;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;


/**
 * The dark-matter Concinnity schema defines a set of mechanisms\n that allow
 * for ad hoc representation of concepts and various types of relationships\n
 * between them. All Domain Specific Definitions (DSDs) generated as part of
 * the \n dark-matter mechanisms inherently allow for references to
 * Concinnity.\n <p/>\n Concinnity is defined as: the skillful and harmonious
 * arrangement or fitting together of the different parts of something.
 * <P>
 * Generated from the dmconcinnity schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:182)
 */
public class DmconcinnitySchemaAG extends SchemaDefinition {

    public static ClassDefinition _ConcinnityDefinition;
    public static ClassDefinition _ConcinnityModule;

    public static AttributeDefinition _definedInConcinnityModule;
    public static AttributeDefinition _dependsOnConcinnityModule;






    public static DSDefinitionModule _ConcinnityModuleDSD;

    static DmconcinnitySchemaAG instance;

    public DmconcinnitySchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.concinnity.server.generated.DmconcinnitySchemaAG";

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:208)
    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmconcinnity");
            me.setDotName("dmconcinnity");
            me.setSchemaPackage("org.dmd.concinnity.shared");
            me.setDmwPackage("org.dmd.concinnity.server");
            me.setFile("/src/org/dmd/concinnity/shared/dmconfig/dmconcinnity.dms");

            initClasses();
            initAttributes1();
            initTypes();
            initComplexTypes();
            initActions();
            initEnums();
            initRules();
            initDSDModules();
            DmcOmni.instance().addCompactSchema(DmconcinnityDMSAG.instance());
        }
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initClasses() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ConcinnityDefinitionOBJ = new ClassDefinitionDMO();
            _ConcinnityDefinition = new ClassDefinition(_ConcinnityDefinitionOBJ,DmconcinnityDMSAG.__ConcinnityDefinition);
            _ConcinnityDefinitionOBJ.setName("ConcinnityDefinition");
            _ConcinnityDefinitionOBJ.setDmdID("-41998");
            _ConcinnityDefinitionOBJ.setClassType("ABSTRACT");
            _ConcinnityDefinitionOBJ.setFile("/src/org/dmd/concinnity/shared/dmconfig/classes.dmd");
            _ConcinnityDefinitionOBJ.setLineNumber("13");
            _ConcinnityDefinitionOBJ.addDescription("The GpbDefinition provides a common base for all dark-matter");
            _ConcinnityDefinitionOBJ.setDerivedFrom("meta.Concinnity");
            _ConcinnityDefinitionOBJ.setIsNamedBy("meta.name");
            _ConcinnityDefinitionOBJ.setUseWrapperType("EXTENDED");
            _ConcinnityDefinitionOBJ.setDmtREFImport("org.dmd.concinnity.shared.generated.types.ConcinnityDefinitionREF");
            _ConcinnityDefinitionOBJ.setDmwIteratorClass("ConcinnityDefinitionIterableDMW");
            _ConcinnityDefinitionOBJ.addMust("meta.name");
            _ConcinnityDefinitionOBJ.addMust("meta.dotName");
            _ConcinnityDefinitionOBJ.addMust("dmconcinnity.definedInConcinnityModule");
            _ConcinnityDefinitionOBJ.setDmwIteratorImport("org.dmd.concinnity.server.generated.dmw.ConcinnityDefinitionIterableDMW");
            _ConcinnityDefinitionOBJ.setPartOfDefinitionModule("dmconcinnity.ConcinnityModule");
            _ConcinnityDefinitionOBJ.setDotName("dmconcinnity.ConcinnityDefinition.ClassDefinition");
            _ConcinnityDefinition.setDefinedIn(this);
            addClassDefList(_ConcinnityDefinition);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            ClassDefinitionDMO _ConcinnityModuleOBJ = new ClassDefinitionDMO();
            _ConcinnityModule = new ClassDefinition(_ConcinnityModuleOBJ,DmconcinnityDMSAG.__ConcinnityModule);
            _ConcinnityModuleOBJ.setName("ConcinnityModule");
            _ConcinnityModuleOBJ.setDmdID("-41999");
            _ConcinnityModuleOBJ.setInternallyGenerated("true");
            _ConcinnityModuleOBJ.setClassType("STRUCTURAL");
            _ConcinnityModuleOBJ.setFile("/src/org/dmd/concinnity/shared/dmconfig/module.dmd");
            _ConcinnityModuleOBJ.setLineNumber("11");
            _ConcinnityModuleOBJ.setDerivedFrom("dmconcinnity.ConcinnityDefinition");
            _ConcinnityModuleOBJ.setIsNamedBy("meta.name");
            _ConcinnityModuleOBJ.setUseWrapperType("EXTENDED");
            _ConcinnityModuleOBJ.setDmtREFImport("org.dmd.concinnity.shared.generated.types.ConcinnityModuleREF");
            _ConcinnityModuleOBJ.setDmwIteratorClass("ConcinnityModuleIterableDMW");
            _ConcinnityModuleOBJ.addMay("meta.loadSchemaClass");
            _ConcinnityModuleOBJ.addMay("meta.description");
            _ConcinnityModuleOBJ.addMay("meta.defFiles");
            _ConcinnityModuleOBJ.addMay("dmconcinnity.dependsOnConcinnityModule");
            _ConcinnityModuleOBJ.addMust("meta.name");
            _ConcinnityModuleOBJ.setDmwIteratorImport("org.dmd.concinnity.server.generated.dmw.ConcinnityModuleIterableDMW");
            _ConcinnityModuleOBJ.setDsdModuleDefinition("dmconcinnity.ConcinnityModule");
            _ConcinnityModuleOBJ.setPartOfDefinitionModule("dmconcinnity.ConcinnityModule");
            _ConcinnityModuleOBJ.setDotName("dmconcinnity.ConcinnityModule.ClassDefinition");
            _ConcinnityModule.setDefinedIn(this);
            addClassDefList(_ConcinnityModule);

    }

    private void initAttributes1() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _definedInConcinnityModuleOBJ = new AttributeDefinitionDMO();
            _definedInConcinnityModule = new AttributeDefinition(_definedInConcinnityModuleOBJ);
            _definedInConcinnityModuleOBJ.setType("dmconcinnity.ConcinnityModule");
            _definedInConcinnityModuleOBJ.setName("definedInConcinnityModule");
            _definedInConcinnityModuleOBJ.setDmdID("-41999");
            _definedInConcinnityModuleOBJ.addDescription("Indicates the name of the ConcinnityModule in which a definition is defined.");
            _definedInConcinnityModuleOBJ.setDotName("dmconcinnity.definedInConcinnityModule.AttributeDefinition");
            _definedInConcinnityModule.setDefinedIn(this);
            _definedInConcinnityModuleOBJ.setFile("/src/org/dmd/concinnity/shared/dmconfig/attributes.dmd");
            _definedInConcinnityModuleOBJ.setLineNumber("6");
            addAttributeDefList(_definedInConcinnityModule);

// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            AttributeDefinitionDMO _dependsOnConcinnityModuleOBJ = new AttributeDefinitionDMO();
            _dependsOnConcinnityModule = new AttributeDefinition(_dependsOnConcinnityModuleOBJ);
            _dependsOnConcinnityModuleOBJ.setType("dmconcinnity.ConcinnityModule");
            _dependsOnConcinnityModuleOBJ.setName("dependsOnConcinnityModule");
            _dependsOnConcinnityModuleOBJ.setDmdID("-41998");
            _dependsOnConcinnityModuleOBJ.addDescription("Indicates the ConcinnityModule on which something depends.");
            _dependsOnConcinnityModuleOBJ.setValueType("MULTI");
            _dependsOnConcinnityModuleOBJ.setDotName("dmconcinnity.dependsOnConcinnityModule.AttributeDefinition");
            _dependsOnConcinnityModule.setDefinedIn(this);
            _dependsOnConcinnityModuleOBJ.setFile("/src/org/dmd/concinnity/shared/dmconfig/attributes.dmd");
            _dependsOnConcinnityModuleOBJ.setLineNumber("12");
            addAttributeDefList(_dependsOnConcinnityModule);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initComplexTypes() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initActions() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initEnums() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initRules() throws DmcValueException {
    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpInitFunction(SchemaFormatter.java:313)
    private void initDSDModules() throws DmcValueException {
// Generated from: org.dmd.dmg.util.SchemaFormatter.getObjectAsCode(SchemaFormatter.java:585)
            DSDefinitionModuleDMO _ConcinnityModuleDSDOBJ = new DSDefinitionModuleDMO();
            _ConcinnityModuleDSD = new DSDefinitionModule(_ConcinnityModuleDSDOBJ);
            _ConcinnityModuleDSDOBJ.setName("ConcinnityModule");
            _ConcinnityModuleDSDOBJ.setDmdID("1");
            _ConcinnityModuleDSDOBJ.setSupportDynamicSchemaLoading("true");
            _ConcinnityModuleDSDOBJ.setModuleClassName("ConcinnityModule");
            _ConcinnityModuleDSDOBJ.setFileExtension("dmcm");
            _ConcinnityModuleDSDOBJ.setDefinedInModuleAttribute("dmconcinnity.definedInConcinnityModule");
            _ConcinnityModuleDSDOBJ.setDotName("dmconcinnity.ConcinnityModule.DSDefinitionModule");
            _ConcinnityModuleDSDOBJ.setModuleDependenceAttribute("dmconcinnity.dependsOnConcinnityModule");
            _ConcinnityModuleDSDOBJ.setFile("/src/org/dmd/concinnity/shared/dmconfig/module.dmd");
            _ConcinnityModuleDSDOBJ.setBaseDefinition("dmconcinnity.ConcinnityDefinition");
            _ConcinnityModuleDSDOBJ.setLineNumber("11");
            _ConcinnityModuleDSD.setDefinedIn(this);
            addDsdModuleList(_ConcinnityModuleDSD);

    }

    // Generated from: org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:272)

    @Override
    public synchronized DmconcinnitySchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}
