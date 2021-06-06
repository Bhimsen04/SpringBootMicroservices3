package io.bhim.ratingsdataservice.resources;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.bhim.ratingsdataservice.models.Rating;
import io.bhim.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
		UserRating u = new UserRating();
		u.setUserRating(Arrays.asList(new Rating("1234", 4), new Rating("5678", 3)));
		return u;
	}

}
