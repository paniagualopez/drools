/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.event.knowlegebase.impl;

import org.kie.KnowledgeBase;
import org.kie.definition.process.Process;
import org.kie.event.knowledgebase.BeforeProcessRemovedEvent;

public class BeforeProcessRemovedEventImpl extends KnowledgeBaseEventImpl implements BeforeProcessRemovedEvent {
    private Process process;
    
    public BeforeProcessRemovedEventImpl(KnowledgeBase knowledgeBase, Process process) {
        super( knowledgeBase );
        this.process = process;
    }

    public Process getProcess() {
        return this.process;
    }

    @Override
    public String toString() {
        return "==>[BeforeProcessRemovedEventImpl: getProcess()=" + getProcess() + "]";
    }

}
