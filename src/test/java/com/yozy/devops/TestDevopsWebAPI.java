package com.yozy.devops;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.yozy.devops.controller.CommonController;
import com.yozy.devops.model.BaseObj;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CommonController.class)
public class TestDevopsWebAPI {

	@Autowired
	private MockMvc mockMvc;

	BaseObj model = new BaseObj("2034", "DEVOPS Accelerator", "Yozy Technologies LLP,India");

	@Before
	public void beforeMethod() {
		System.out.println("Junit testing started.....");
	}

	@Test
	public void checkDetails() throws Exception {

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello-world").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println("response:::::: " + result.getResponse());

		String expected = "{\"id\": \"2034\",\"projectName\": \"DEVOPS Accelerator\",\"companyName\": \"Yozy Technologies LLP India\"}";

	}

	@After
	public void afterMethod() {
		System.out.println("Junit testing Ended.....");
	}

}
