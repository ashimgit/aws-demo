package com.aws.lambda.pojo;

import java.util.Map;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(fluent = true)
public class MyResponse {
	private String body;
	private Integer statusCode;
	private String Message;
	private Map<String, String> headers;
	private boolean isBase64Encoded;
	

}
