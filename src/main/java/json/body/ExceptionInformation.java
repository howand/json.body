package json.body;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

@Builder
public class ExceptionInformation {

	@JsonProperty("exception")
	private String exception;
}
