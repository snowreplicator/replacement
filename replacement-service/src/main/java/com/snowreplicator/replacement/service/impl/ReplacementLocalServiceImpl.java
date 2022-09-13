package com.snowreplicator.replacement.service.impl;

import com.liferay.portal.aop.AopService;

import com.snowreplicator.replacement.service.base.ReplacementLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

@Component(
        property = "model.class.name=com.snowreplicator.replacement.model.Replacement",
        service = AopService.class
)
public class ReplacementLocalServiceImpl extends ReplacementLocalServiceBaseImpl {

}
