package org.sysu.renResourcing.log;

import org.sysu.renResourcing.entity.RIdentifier;
import org.sysu.renResourcing.entity.RServiceType;
import org.sysu.renResourcing.entity.RSession;

import java.util.Date;

/**
 * Author: Rinkako
 * Date  : 2017/11/19
 * Usage : This event entity used for Ren resourcing service.
 */
public class REngineEvent extends org.sysu.renResourcing.log.REvent {
    public REngineEvent(RServiceType et) {
        this.EventType = et;
        this.EventName = et.toString();
        this.TimeStamp = new Date();
    }

    /**
     * resourcing service type
     */
    public RServiceType EventType = RServiceType.NOP;

    /**
     * causer session
     */
    public RSession Session = null;

    /**
     * Generate the event XML String.
     * @return XML string of this event
     */
    public String ToXML() {
        return null;
    }

    /**
     * Generate instance from event XML string.
     *
     * @param xml XML data in string
     * @return a RIdentifier object
     */
    public RIdentifier FromXML(String xml) {
        return null;
    }
}

