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
package org.scleropages.maldini.app.model;

import org.scleropages.crud.types.Available;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 具体某一业务功能，由 {@link Api} 提供技术实现，由 {@link Domain} 进行业务组织作为一种能力对外提供服务.
 *
 * @author <a href="mailto:martinmao@icloud.com">Martin Mao</a>
 */
public class DomainFunction implements Available {

    private Long id;
    private String name;
    private String fullName;
    private String tag;
    private String description;
    private String docUrl;
    private Boolean enabled;
    private Long apiId;
    private Long domainId;

    @NotNull(groups = {UpdateModel.class})
    @Null(groups = {CreateModel.class})
    public Long getId() {
        return id;
    }

    @NotBlank(groups = {CreateModel.class})
    public String getName() {
        return name;
    }

    @Null
    public String getFullName() {
        return fullName;
    }

    @NotBlank(groups = {CreateModel.class})
    public String getTag() {
        return tag;
    }

    @NotBlank(groups = {CreateModel.class})
    public String getDescription() {
        return description;
    }

    @NotBlank(groups = {CreateModel.class})
    public String getDocUrl() {
        return docUrl;
    }

    @Null
    public Boolean getEnabled() {
        return enabled;
    }

    @NotNull(groups = {CreateModel.class})
    @Null(groups = {UpdateModel.class})
    public Long getApiId() {
        return apiId;
    }

    @NotNull(groups = {CreateModel.class})
    @Null(groups = {UpdateModel.class})
    public Long getDomainId() {
        return domainId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public boolean isAvailable() {
        return enabled;
    }

    public static interface CreateModel {
    }

    public static interface UpdateModel {
    }
}
