package org.drools.impl;

import org.drools.RuleBase;
import org.kie.KnowledgeBase;

public interface InternalKnowledgeBase extends KnowledgeBase {

    RuleBase getRuleBase();

}
