// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package org.drools.builder;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class JPAKnowledgeFactoryService_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return org.drools.builder.JPAKnowledgeFactoryService_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        org.drools.builder.JPAKnowledgeFactoryService_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __JPAKnowledgeFactoryService extends system.Object implements org.drools.builder.JPAKnowledgeFactoryService {
    
    protected __JPAKnowledgeFactoryService(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Lorg/drools/KnowledgeBase;Lorg/drools/runtime/KnowledgeSessionConfiguration;Lorg/drools/runtime/Environment;)Lorg/drools/runtime/StatefulKnowledgeSession;")
    public native org.drools.runtime.StatefulKnowledgeSession newStatefulKnowledgeSession(org.drools.KnowledgeBase par0, org.drools.runtime.KnowledgeSessionConfiguration par1, org.drools.runtime.Environment par2);
    
    @net.sf.jni4net.attributes.ClrMethod("(ILorg/drools/KnowledgeBase;Lorg/drools/runtime/KnowledgeSessionConfiguration;Lorg/drools/runtime/Environment;)Lorg/drools/runtime/StatefulKnowledgeSession;")
    public native org.drools.runtime.StatefulKnowledgeSession loadStatefulKnowledgeSession(int par0, org.drools.KnowledgeBase par1, org.drools.runtime.KnowledgeSessionConfiguration par2, org.drools.runtime.Environment par3);
}
//</generated-proxy>
