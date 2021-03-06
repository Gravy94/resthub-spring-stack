package org.resthub.web.controller;

import org.resthub.web.model.Sample;
import org.resthub.web.service.SampleResourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@RestController
@RequestMapping("/service-based")
@Profile("resthub-jpa")
public class SampleServiceBasedRestController extends
        ServiceBasedRestController<Sample, Long, SampleResourceService> {

    @Override
    @Inject
    public void setService(SampleResourceService service) {
        this.service = service;
    }

}
