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
package org.scleropages.maldini.security.provider.shiro;

import org.apache.shiro.SecurityUtils;
import org.scleropages.maldini.security.AuthenticationDetails;
import org.scleropages.maldini.security.SecurityContext;
import org.scleropages.maldini.security.authc.provider.Authenticated;

import java.util.Date;

/**
 * @author <a href="mailto:martinmao@icloud.com">Martin Mao</a>
 */
public class ShiroSecurityContext implements SecurityContext {

    protected static final ShiroSecurityContext SHIRO_SECURITY_CONTEXT = new ShiroSecurityContext();


    @Override
    public boolean isAuthenticated() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

    @Override
    public boolean isRemembered() {
        return SecurityUtils.getSubject().isRemembered();
    }


    @Override
    public Object getPrincipal() {
        return getRequiredAuthenticated().principal();
    }

    @Override
    public AuthenticationDetails getDetails() {
        return getRequiredAuthenticated().details();
    }

    private Authenticated getRequiredAuthenticated() {
        Object principal = SecurityUtils.getSubject().getPrincipal();
        if (principal instanceof Authenticated) {
            return (Authenticated) principal;
        }
        throw new IllegalStateException("unknown principal.");
    }

    @Override
    public Date getAuthenticatedTime() {
        return getRequiredAuthenticated().time();
    }

    @Override
    public String getHost() {
        return getRequiredAuthenticated().host();
    }

    @Override
    public Authenticated getAuthenticated() {
        return getRequiredAuthenticated();
    }

    @Override
    public String getName() {
        return String.valueOf(getPrincipal());
    }
}
