/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.config.model.validate;

import javax.xml.namespace.QName;

import org.switchyard.config.model.Model;

/**
 * The "validate" configuration model.
 *
 * @author <a href="mailto:tm.igarashi@gmail.com">Tomohisa Igarashi</a>
 */
public interface ValidateModel extends Model {

    /** The default "validate" namespace. */
    public static final String DEFAULT_NAMESPACE = "urn:switchyard-config:validate:1.0";

    /** The "validate" name. */
    public static final String VALIDATE = "validate";

    /** The "name" name. */
    public static final String NAME = "name";

    /**
     * Gets the parent validates model.
     * @return the parent validates model.
     */
    public ValidatesModel getValidates();

    /**
     * Gets the name attribute.
     * @return the name attribute
     */
    public QName getName();

    /**
     * Sets the name attribute.
     * @param name the name attribute
     * @return this ValidateModel (useful for chaining)
     */
    public ValidateModel setName(QName name);

}
