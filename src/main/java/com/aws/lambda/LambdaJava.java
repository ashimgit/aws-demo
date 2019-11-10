package com.aws.lambda;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.lambda.pojo.MyResponse;

public class LambdaJava implements RequestHandler<Object, Object> {

	public MyResponse handleRequest(Object input, Context context) {

		String msg = "Hello World !";
		System.out.println("Got the msg = " + msg);

		return MyResponse.builder()
				.headers(Collections.singletonMap("X-Powered-By", "AshimDemo"))
				.isBase64Encoded(false)
				.body(msg).
				build();
		
	}

}
