package org.sysu.renResourcing.resource;

import org.sysu.renResourcing.entity.RIdentifier;

/**
 * Author: Rinkako
 * Date  : 2017/11/22
 * Usage : Abstract resource class for all kinds of resources
 */
public abstract class RResource extends RIdentifier {
    /**
     * Notation of this resource
     */
    public String Note = "";

    /**
     * The user id of who registered this resource
     */
    public String RegisterUID = "";
}