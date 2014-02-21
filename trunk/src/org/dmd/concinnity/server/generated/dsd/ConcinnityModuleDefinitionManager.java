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
package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:144)
import java.util.Iterator;                                                              // To allow access to our definitions - (DSDArtifactFormatter.java:131)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;                         // A definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:277)
import org.dmd.concinnity.server.extended.ConcinnityModule;                             // A definition from the ConcinnityModule Module - (DSDArtifactFormatter.java:281)
import org.dmd.concinnity.server.generated.dsd.ConcinnityModuleGlobalInterface;         // Interface for ConcinnityModule definitions - (DSDArtifactFormatter.java:274)
import org.dmd.dmc.DmcAttributeInfo;                                                    // Used when resolving clashes - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcNameClashException;                                               // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashObjectSet;                                               // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcNameClashResolverIF;                                              // To support object resolution - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                   // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNamedObjectIF;                                                    // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcObject;                                                           // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObjectName;                                                       // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcValueException;                                                   // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueExceptionSet;                                                // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                        // Our base to provide definition set storage - (DSDArtifactFormatter.java:130)
import org.dmd.dmc.types.DotName;                                                       // To support the find method for definitions - (DSDArtifactFormatter.java:132)
import org.dmd.dms.DSDefinition;                                                        // The base of all definitions - (DSDArtifactFormatter.java:129)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:148)
public class ConcinnityModuleDefinitionManager implements ConcinnityModuleGlobalInterface, DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:300)
    DmcDefinitionSet<ConcinnityDefinition> ConcinnityDefinitionDefs;
    DmcDefinitionSet<ConcinnityModule> ConcinnityModuleDefs;

    public ConcinnityModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:327)
        ConcinnityDefinitionDefs = new DmcDefinitionSet<ConcinnityDefinition>("ConcinnityDefinition", allDefinitions);
        ConcinnityModuleDefs = new DmcDefinitionSet<ConcinnityModule>("ConcinnityModule", allDefinitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:164)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:172)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:189)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:195)
    @Override
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:215)
    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DotName dn = new DotName(name.getNameString() + "." + ai.type);
    
        // The name might contain module.defname, in which case we'll try to look it up
        // using a fully qualified DotName of the form module.defname.type. Otherwise,
        // we use the getDefinitionByNameAndType() form of the lookup.
        if (name.getNameString().indexOf(".") == -1){
            try{
                rc = allDefinitions.getDefinitionByNameAndType(dn);
            } catch (DmcNameClashException e) {
                rc = resolver.resolveClash(object, ai, e.getClashSet());
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:238)
    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinition resolving = (DSDefinition) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:321)
    /**
     * All definitions are added to the base definition collection.
     */
    void addConcinnityDefinition(ConcinnityDefinition def){
        ConcinnityDefinitionDefs.add(def);
    }

    public int getConcinnityDefinitionCount(){
        return(ConcinnityDefinitionDefs.size());
    }

    public ConcinnityDefinition getConcinnityDefinition(DotName name){
        return(ConcinnityDefinitionDefs.getDefinition(name));
    }

    public Iterator<ConcinnityDefinition> getAllConcinnityDefinition(){
        return(ConcinnityDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addConcinnityModule(ConcinnityModule def){
        ConcinnityModuleDefs.add(def);
        addConcinnityDefinition(def);
    }

    public int getConcinnityModuleCount(){
        return(ConcinnityModuleDefs.size());
    }

    public ConcinnityModule getConcinnityModule(DotName name){
        return(ConcinnityModuleDefs.getDefinition(name));
    }

    public Iterator<ConcinnityModule> getAllConcinnityModule(){
        return(ConcinnityModuleDefs.values().iterator());
    }


}

