package com.airbnb.chancery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import lombok.Data;
import lombok.EqualsAndHashCode;

import org.hibernate.validator.constraints.NotEmpty;

@Data
@EqualsAndHashCode(callSuper=true)
public class S3ArchiverConfig extends Configuration {
    @NotEmpty
    @JsonProperty
    private String refFilter;

    @NotEmpty
    @JsonProperty
    private String bucketName;

    @NotEmpty
    @JsonProperty
    private String keyTemplate;
}
