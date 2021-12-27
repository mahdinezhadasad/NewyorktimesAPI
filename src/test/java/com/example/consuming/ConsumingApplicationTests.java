package com.example.consuming;

import com.example.consuming.entity.NYBestSeller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumingApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	public void contextLoads() {
	}

	@Test
	public void integrationBookTest(){

		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("api.nytimes.com")
				.path("svc/books/v3/lists.json")
				.queryParam("list","hardcover-fiction")
				.queryParam("api-key", "KZItbFjSGRw0FpdDTfa9BiXLL1A6cgKW")
				.build(true);


		ResponseEntity<NYBestSeller> response = this.restTemplate.getForEntity("https://api.nytimes.com/svc/books/v3/lists.json?list=hardcover-fiction&api-key=KZItbFjSGRw0FpdDTfa9BiXLL1A6cgKW", NYBestSeller.class);
		assertThat(response.getStatusCode(),equalTo(HttpStatus.OK));






	}

}
