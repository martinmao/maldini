/**
 * Copyright 2001-2005 The Apache Software Foundation.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scleropages.maldini.security.acl;

import java.io.Serializable;

/**
 * Defined some actions(execute, read, write, administration...) for specific resource.
 *
 * @author <a href="mailto:martinmao@icloud.com">Martin Mao</a>
 */
public interface Permission {

    /**
     * return identifier of this permission.
     *
     * @return
     */
    Serializable id();

    /**
     * return name of this permission.
     *
     * @return
     */
    String name();

    /**
     * return tag used for display.
     *
     * @return
     */
    String tag();
}
