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

package org.drools.event;

import org.kie.event.process.ProcessCompletedEvent;
import org.kie.event.process.ProcessEventListener;
import org.kie.event.process.ProcessNodeLeftEvent;
import org.kie.event.process.ProcessNodeTriggeredEvent;
import org.kie.event.process.ProcessStartedEvent;
import org.kie.event.process.ProcessVariableChangedEvent;

public class DefaultProcessEventListener implements ProcessEventListener {

    public void afterNodeLeft(ProcessNodeLeftEvent event) {
    }

    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
    }

    public void afterProcessCompleted(ProcessCompletedEvent event) {
    }

    public void afterProcessStarted(ProcessStartedEvent event) {
    }

    public void afterVariableChanged(ProcessVariableChangedEvent event) {
    }

    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
    }

    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
    }

    public void beforeProcessCompleted(ProcessCompletedEvent event) {
    }

    public void beforeProcessStarted(ProcessStartedEvent event) {
    }

    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
    }

}
