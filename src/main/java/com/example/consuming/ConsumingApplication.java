package com.example.consuming;

import com.example.consuming.entity.NYBestSeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class ConsumingApplication implements  CommandLineRunner {
	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ConsumingApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder, List<HttpMessageConverter<?>> messageConverters) {
		return builder.messageConverters(messageConverters)
				.build();
	}

	@Bean
	public MappingJackson2HttpMessageConverter jacksonHttpMessageConverter() {
		return new MappingJackson2HttpMessageConverter();
	}

	@Override
	public void run(String... args) {

		UriComponents uriComponents = UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("api.nytimes.com")
            .path("svc/books/v3/lists.json")
			.queryParam("list","hardcover-fiction")
			.queryParam("api-key", "KZItbFjSGRw0FpdDTfa9BiXLL1A6cgKW")
			.build(true);

		System.out.println("URI: " + uriComponents.toUriString());


		NYBestSeller bestSeller = restTemplate.getForObject(uriComponents.toUri(), NYBestSeller.class);


		System.out.println("Num Results: " + bestSeller.getNumResults());
		System.out.println( "Best Seller Date: "+ bestSeller.getResults().get(0).getBestsellersDate());
		System.out.println("best seller name "+bestSeller.getResults().get(0).getDisplayName().toUpperCase(Locale.ROOT));
	}


}
