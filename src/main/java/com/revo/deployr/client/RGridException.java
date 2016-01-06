/*
 * RGridException.java
 *
 * Copyright (C) 2010-2016, Microsoft Corporation
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client;

/**
 * Exception thrown when the DeployR grid determines an operation
 * exceeds runtime limits set by Server Policies or when the grid
 * is simply at resource exhaustion and incapable of accepting
 * additional operations at this time.
 */
public class RGridException extends Exception {

    public int errorCode;

    public RGridException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
