package org.dmd.concinnity.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpHeaderDMSAG(DmoCompactSchemaFormatter.java:1064)
import java.util.ArrayList;                                  // For storage of schema info - (DmoCompactSchemaFormatter.java:998)
import java.util.HashMap;                                    // For storage of schema info - (DmoCompactSchemaFormatter.java:997)
import java.util.Iterator;                                   // For access of schema info - (DmoCompactSchemaFormatter.java:999)
import org.dmd.dmc.*;                                        // Basic DMC stuff - (DmoCompactSchemaFormatter.java:1000)
import org.dmd.dmc.rules.RuleIF;                             // For rule info - (DmoCompactSchemaFormatter.java:1001)
import org.dmd.dms.generated.dmo.MetaDMSAG;                  // Required attribute from MetaDMSAG - (DmoCompactSchemaFormatter.java:1017)
import org.dmd.dms.generated.enums.ClassTypeEnum;            // Have class definitions - (DmoCompactSchemaFormatter.java:1005)
import org.dmd.dms.generated.enums.DataTypeEnum;             // Have class/attribute definitions - (DmoCompactSchemaFormatter.java:1006)
import org.dmd.dms.generated.enums.OriginalTypeEnum;         // Have type/internal type definitions - (DmoCompactSchemaFormatter.java:1011)
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Have attribute definitions - (DmoCompactSchemaFormatter.java:1032)




// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:137)
public class DmconcinnityDMSAG implements DmcCompactSchemaIF {


    static String schemaName = "dmconcinnity";


    static int schemaBaseID = -42000;


    static int schemaIDRange = 10;


    static int schemaMaxID = -41990;

    public final static DmcAttributeInfo __definedInConcinnityModule = new DmcAttributeInfo("dmconcinnity", "definedInConcinnityModule", -41999, "ConcinnityModule", ValueTypeEnum.SINGLE, DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __dependsOnConcinnityModule = new DmcAttributeInfo("dmconcinnity", "dependsOnConcinnityModule", -41998, "ConcinnityModule", ValueTypeEnum.MULTI, DataTypeEnum.PERSISTENT);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:176)
    public final static DmcTypeInfo __type_ConcinnityDefinition = new DmcTypeInfo("ConcinnityDefinition", OriginalTypeEnum.REFERENCE);
    public final static DmcTypeInfo __type_ConcinnityModule = new DmcTypeInfo("ConcinnityModule", OriginalTypeEnum.REFERENCE);

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:217)
    public final static DmcClassInfo __ConcinnityDefinition = new DmcClassInfo("ConcinnityDefinition","org.dmd.concinnity.shared.generated.dmo.ConcinnityDefinitionDMO", -41998, ClassTypeEnum.ABSTRACT, DataTypeEnum.PERSISTENT,MetaDMSAG.__Concinnity,MetaDMSAG.__name);
    public final static DmcClassInfo __ConcinnityModule = new DmcClassInfo("ConcinnityModule","org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO", -41999, ClassTypeEnum.STRUCTURAL, DataTypeEnum.PERSISTENT,__ConcinnityDefinition,MetaDMSAG.__name);

    static  HashMap<Integer, DmcClassInfo> _CmAp;

    static  HashMap<Integer, DmcAttributeInfo> _SmAp;

    static  HashMap<String, DmcNameBuilderIF> _NmAp;

    static  HashMap<String, DmcFilterBuilderIF> _FmAp;

    static  HashMap<String, DmcSliceInfo> _SImAp;

    static  HashMap<String, DmcTypeInfo> _TImAp;

    static  ArrayList<RuleIF>             _RmAp;

    static {
        _CmAp = new HashMap<Integer, DmcClassInfo>();

        _SmAp = new HashMap<Integer, DmcAttributeInfo>();

        _NmAp = new HashMap<String, DmcNameBuilderIF>();

        _FmAp = new HashMap<String, DmcFilterBuilderIF>();

        _SImAp = new HashMap<String, DmcSliceInfo>();

        _TImAp = new HashMap<String, DmcTypeInfo>();

        _RmAp = new ArrayList<RuleIF>();

        DmconcinnityDMSAGAMAP.initSmAp(_SmAp);

        DmconcinnityDMSAGCMAP.initCmAp(_CmAp);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:300)
    static {


        __ConcinnityDefinition.addMust(MetaDMSAG.__name);
        __ConcinnityDefinition.addMust(MetaDMSAG.__dotName);
        __ConcinnityDefinition.addMust(__definedInConcinnityModule);

        __ConcinnityModule.addMust(MetaDMSAG.__name);
        __ConcinnityModule.addMay(MetaDMSAG.__loadSchemaClass);
        __ConcinnityModule.addMay(MetaDMSAG.__description);
        __ConcinnityModule.addMay(MetaDMSAG.__defFiles);
        __ConcinnityModule.addMay(__dependsOnConcinnityModule);

    }

    // Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchema(DmoCompactSchemaFormatter.java:344)
    static {


    }

    static  DmconcinnityDMSAG instance;

    protected DmconcinnityDMSAG (){
    }

    public synchronized static DmconcinnityDMSAG instance(){
        if (instance == null)
            instance = new DmconcinnityDMSAG();
        
        return(instance);
    }


    public DmcClassInfo getClassInfo(Integer id){
        return(_CmAp.get(id));
    }


    public DmcAttributeInfo getAttributeInfo(Integer id){
        return(_SmAp.get(id));
    }


    public Iterator<DmcAttributeInfo> getAttributeInfo(){
        return(_SmAp.values().iterator());
    }


    public Iterator<DmcClassInfo> getClassInfo(){
        return(_CmAp.values().iterator());
    }


    public Iterator<DmcNameBuilderIF> getNameBuilders(){
        return(_NmAp.values().iterator());
    }


    public Iterator<DmcFilterBuilderIF> getFilterBuilders(){
        return(_FmAp.values().iterator());
    }


    public Iterator<DmcSliceInfo> getSliceInfo(){
        return(_SImAp.values().iterator());
    }


    public Iterator<DmcTypeInfo> getTypeInfo(){
        return(_TImAp.values().iterator());
    }


    public String getSchemaName(){
        return(schemaName);
    }


    public int getSchemaBaseID(){
        return(schemaBaseID);
    }


    public int getSchemaIDRange(){
        return(schemaIDRange);
    }


    public int getSchemaMaxID(){
        return(schemaMaxID);
    }


    public Iterator<RuleIF> getRules(){
        return(_RmAp.iterator());
    }


}

