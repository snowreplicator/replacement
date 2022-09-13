package com.snowreplicator.replacement.service.impl;

import com.liferay.portal.aop.AopService;

import com.snowreplicator.replacement.service.base.ReplacementServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

@Component(
        property = {
                "json.web.service.context.name=rpl",
                "json.web.service.context.path=Replacement"
        },
        service = AopService.class
)
public class ReplacementServiceImpl extends ReplacementServiceBaseImpl {

}
